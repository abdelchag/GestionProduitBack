/*
 * Gestion Produits REST API
 * RESTful API pour la gestion des produits
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.abdel.gestionproduit.testswaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Produit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T12:21:46.705+02:00")
public class Produit {
  @JsonProperty("designation")
  private String designation = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("prix")
  private Integer prix = null;

  @JsonProperty("quantite")
  private Integer quantite = null;

  public Produit designation(String designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @ApiModelProperty(value = "")
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Produit id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Produit prix(Integer prix) {
    this.prix = prix;
    return this;
  }

   /**
   * Get prix
   * @return prix
  **/
  @ApiModelProperty(value = "")
  public Integer getPrix() {
    return prix;
  }

  public void setPrix(Integer prix) {
    this.prix = prix;
  }

  public Produit quantite(Integer quantite) {
    this.quantite = quantite;
    return this;
  }

   /**
   * Get quantite
   * @return quantite
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantite() {
    return quantite;
  }

  public void setQuantite(Integer quantite) {
    this.quantite = quantite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Produit produit = (Produit) o;
    return Objects.equals(this.designation, produit.designation) &&
        Objects.equals(this.id, produit.id) &&
        Objects.equals(this.prix, produit.prix) &&
        Objects.equals(this.quantite, produit.quantite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designation, id, prix, quantite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Produit {\n");
    
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prix: ").append(toIndentedString(prix)).append("\n");
    sb.append("    quantite: ").append(toIndentedString(quantite)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

