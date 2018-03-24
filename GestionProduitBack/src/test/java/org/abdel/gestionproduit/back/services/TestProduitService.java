package org.abdel.gestionproduit.back.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.abdel.gestionproduit.back.dao.ProduitRepository;
import org.abdel.gestionproduit.back.entities.Produit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.dao.EmptyResultDataAccessException;

@RunWith(MockitoJUnitRunner.class)
public class TestProduitService {
	
	@Mock
	private ProduitRepository repo;
	
	@InjectMocks
	private ProduitService service;
	
	private Produit p1 = createProduit(1L, "design1", 100, 10);
	private Produit p2 = createProduit(2L, "design2", 200, 20);
	private Produit p3 = createProduit(3L, "design3", 300, 30);
	
	
	private Produit createProduit(Long id, String designation, Integer prix, Integer quantite){
		Produit p = new Produit();
		p.setId(id);
		p.setDesignation(designation);
		p.setPrix(prix);
		p.setQuantite(quantite);
		return p;
	}

	@Test
	public void testGetAll(){
		when(repo.findAll()).thenReturn(Arrays.asList(p1, p2));
		List<Produit> expected = service.getAll();
		assertThat(expected).isNotNull();
		assertThat(expected.size()).isEqualTo(2);
		assertThat(expected).containsOnly(p1,p2);
	}
	
	@Test
	public void testGetProduitByIdFound(){
		when(repo.findOne(1L)).thenReturn(p1);
		Produit expected = service.getProduitById(1L);
		assertThat(expected).isNotNull();
		assertThat(expected).isEqualTo(p1);
	}
	
	@Test
	public void testGetProduitByIdNotFound(){
		when(repo.findOne(1L)).thenReturn(p1);
		Produit expected = service.getProduitById(2L);
		assertThat(expected).isNull();
	}
	
	@Test(expected=EmptyResultDataAccessException.class)
	public void testDeleteProduitNotFound(){
		doThrow(new EmptyResultDataAccessException(0)).when(repo).delete(anyLong());
		
		service.deleteProduit(5L);
	}
	
	
}
