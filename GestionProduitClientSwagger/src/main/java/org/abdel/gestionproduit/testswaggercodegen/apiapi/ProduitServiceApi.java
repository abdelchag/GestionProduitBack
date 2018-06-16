package org.abdel.gestionproduit.testswaggercodegen.apiapi;

import org.abdel.gestionproduit.testswaggercodegen.ApiException;
import org.abdel.gestionproduit.testswaggercodegen.ApiClient;
import org.abdel.gestionproduit.testswaggercodegen.Configuration;
import org.abdel.gestionproduit.testswaggercodegen.Pair;

import javax.ws.rs.core.GenericType;

import org.abdel.gestionproduit.testswaggercodegen.model.Exception;
import org.abdel.gestionproduit.testswaggercodegen.model.PageProduit;
import org.abdel.gestionproduit.testswaggercodegen.model.Produit;
import org.abdel.gestionproduit.testswaggercodegen.model.RuntimeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T12:21:46.705+02:00")
public class ProduitServiceApi {
  private ApiClient apiClient;

  public ProduitServiceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProduitServiceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * deleteProduit
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProduitUsingDELETE(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProduitUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/produits/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get all product
   * 
   * @return List&lt;Produit&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Produit> getAllUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/produits";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Produit>> localVarReturnType = new GenericType<List<Produit>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProduitById
   * 
   * @param id id (required)
   * @return Produit
   * @throws ApiException if fails to make API call
   */
  public Produit getProduitByIdUsingGET(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getProduitByIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/produits/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Produit> localVarReturnType = new GenericType<Produit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProduitsByDesign
   * 
   * @param design design (required)
   * @param page page (optional, default to 0)
   * @param size size (optional, default to 3)
   * @return PageProduit
   * @throws ApiException if fails to make API call
   */
  public PageProduit getProduitsByDesignUsingGET(String design, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'design' is set
    if (design == null) {
      throw new ApiException(400, "Missing the required parameter 'design' when calling getProduitsByDesignUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/chercher";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "design", design));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageProduit> localVarReturnType = new GenericType<PageProduit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProduitsByDesignation
   * 
   * @param design design (required)
   * @param page page (optional, default to 0)
   * @param size size (optional, default to 3)
   * @return PageProduit
   * @throws ApiException if fails to make API call
   */
  public PageProduit getProduitsByDesignationUsingGET(String design, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'design' is set
    if (design == null) {
      throw new ApiException(400, "Missing the required parameter 'design' when calling getProduitsByDesignationUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/ckalab";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "design", design));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PageProduit> localVarReturnType = new GenericType<PageProduit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * saveProduit
   * 
   * @param produit produit (required)
   * @return Produit
   * @throws ApiException if fails to make API call
   */
  public Produit saveProduitUsingPOST(Produit produit) throws ApiException {
    Object localVarPostBody = produit;
    
    // verify the required parameter 'produit' is set
    if (produit == null) {
      throw new ApiException(400, "Missing the required parameter 'produit' when calling saveProduitUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/produits";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Produit> localVarReturnType = new GenericType<Produit>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * saveProduit
   * 
   * @param id id (required)
   * @param produit produit (required)
   * @return Produit
   * @throws ApiException if fails to make API call
   */
  public Produit saveProduitUsingPUT(Long id, Produit produit) throws ApiException {
    Object localVarPostBody = produit;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling saveProduitUsingPUT");
    }
    
    // verify the required parameter 'produit' is set
    if (produit == null) {
      throw new ApiException(400, "Missing the required parameter 'produit' when calling saveProduitUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/produits/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Produit> localVarReturnType = new GenericType<Produit>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
