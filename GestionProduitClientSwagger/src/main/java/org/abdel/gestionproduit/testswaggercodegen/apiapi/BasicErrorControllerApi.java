package org.abdel.gestionproduit.testswaggercodegen.apiapi;

import org.abdel.gestionproduit.testswaggercodegen.ApiException;
import org.abdel.gestionproduit.testswaggercodegen.ApiClient;
import org.abdel.gestionproduit.testswaggercodegen.Configuration;
import org.abdel.gestionproduit.testswaggercodegen.Pair;

import javax.ws.rs.core.GenericType;

import org.abdel.gestionproduit.testswaggercodegen.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T12:21:46.705+02:00")
public class BasicErrorControllerApi {
  private ApiClient apiClient;

  public BasicErrorControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BasicErrorControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingDELETE() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingHEAD() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingOPTIONS() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "OPTIONS", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingPATCH() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingPOST() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * errorHtml
   * 
   * @return ModelAndView
   * @throws ApiException if fails to make API call
   */
  public ModelAndView errorHtmlUsingPUT() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/error";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAndView> localVarReturnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
