package org.abdel.gestionproduit.back.dao;


import org.abdel.gestionproduit.back.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	@Query("select p from Produit p where p.designation like %:designation%")
	public Page<Produit> chercherParDesignation(@Param("designation") String designation, Pageable pageable);


}
