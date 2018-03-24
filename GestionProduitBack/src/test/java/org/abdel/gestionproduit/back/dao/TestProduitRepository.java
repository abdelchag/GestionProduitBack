package org.abdel.gestionproduit.back.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.abdel.gestionproduit.back.entities.Produit;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Role;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@ActiveProfiles("test")
public class TestProduitRepository {
	
	@Autowired
	ProduitRepository repo;
	
	Produit expected;
	
	@Before
	public void initiateProduit(){
		expected = new Produit();
		expected.setDesignation("Produit test AssertJ");
		expected.setPrix(500);
		expected.setQuantite(50);
	}
	
	
	
	@Test
	public void testSaveProduit(){
		Produit actual = repo.save(expected);
		actual = repo.findOne(actual.getId());
		assertThat(actual.getDesignation()).isEqualTo(expected.getDesignation());
		assertThat(actual.getPrix()).isEqualTo(expected.getPrix());
		assertThat(actual.getQuantite()).isEqualTo(expected.getQuantite());
		
	}
	
	@Test
	public void testDeleteProduit(){
		Produit actual = repo.save(expected);
		repo.delete(actual.getId());
		actual = repo.findOne(actual.getId());
		assertThat(actual).isNull();
	}
	
	@Test(expected=EmptyResultDataAccessException.class)
	public void testDeleteProduitNotFound(){
		repo.delete(Double.doubleToLongBits(Math.random()));
	}
	
	
	@Test
	public void testFindByDesignation(){
		repo.save(expected);
		Page<Produit> actual = repo.chercherParDesignation(expected.getDesignation(), new PageRequest(0, 3));
		assertThat(actual).isNotNull();
		assertThat(actual.getContent().isEmpty()).isFalse();
		assertThat(actual.getTotalElements()).isEqualTo(1);
	}
	
	@Test
	public void testFindOneFound(){
		Produit actual = repo.save(expected);
		Produit expected = repo.findOne(actual.getId());
		assertThat(expected).isEqualTo(actual);
		
	}
	
	@Test
	public void testFindOneNotFound(){
		repo.save(expected);
		Produit expected = repo.findOne(Double.doubleToLongBits(Math.random()));
		assertThat(expected).isNull();
		
	}
	
	
	
	
	

}
