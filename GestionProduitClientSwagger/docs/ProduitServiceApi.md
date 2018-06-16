# ProduitServiceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProduitUsingDELETE**](ProduitServiceApi.md#deleteProduitUsingDELETE) | **DELETE** /produits/{id} | deleteProduit
[**getAllUsingGET**](ProduitServiceApi.md#getAllUsingGET) | **GET** /produits | Get all product
[**getProduitByIdUsingGET**](ProduitServiceApi.md#getProduitByIdUsingGET) | **GET** /produits/{id} | getProduitById
[**getProduitsByDesignUsingGET**](ProduitServiceApi.md#getProduitsByDesignUsingGET) | **GET** /chercher | getProduitsByDesign
[**getProduitsByDesignationUsingGET**](ProduitServiceApi.md#getProduitsByDesignationUsingGET) | **GET** /ckalab | getProduitsByDesignation
[**saveProduitUsingPOST**](ProduitServiceApi.md#saveProduitUsingPOST) | **POST** /produits | saveProduit
[**saveProduitUsingPUT**](ProduitServiceApi.md#saveProduitUsingPUT) | **PUT** /produits/{id} | saveProduit


<a name="deleteProduitUsingDELETE"></a>
# **deleteProduitUsingDELETE**
> deleteProduitUsingDELETE(id)

deleteProduit

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteProduitUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#deleteProduitUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllUsingGET"></a>
# **getAllUsingGET**
> List&lt;Produit&gt; getAllUsingGET()

Get all product

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
try {
    List<Produit> result = apiInstance.getAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#getAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Produit&gt;**](Produit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getProduitByIdUsingGET"></a>
# **getProduitByIdUsingGET**
> Produit getProduitByIdUsingGET(id)

getProduitById

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
Long id = 789L; // Long | id
try {
    Produit result = apiInstance.getProduitByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#getProduitByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Produit**](Produit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getProduitsByDesignUsingGET"></a>
# **getProduitsByDesignUsingGET**
> PageProduit getProduitsByDesignUsingGET(design, page, size)

getProduitsByDesign

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
String design = "design_example"; // String | design
Integer page = 0; // Integer | page
Integer size = 3; // Integer | size
try {
    PageProduit result = apiInstance.getProduitsByDesignUsingGET(design, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#getProduitsByDesignUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **design** | **String**| design |
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 3]

### Return type

[**PageProduit**](PageProduit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getProduitsByDesignationUsingGET"></a>
# **getProduitsByDesignationUsingGET**
> PageProduit getProduitsByDesignationUsingGET(design, page, size)

getProduitsByDesignation

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
String design = "design_example"; // String | design
Integer page = 0; // Integer | page
Integer size = 3; // Integer | size
try {
    PageProduit result = apiInstance.getProduitsByDesignationUsingGET(design, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#getProduitsByDesignationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **design** | **String**| design |
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 3]

### Return type

[**PageProduit**](PageProduit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveProduitUsingPOST"></a>
# **saveProduitUsingPOST**
> Produit saveProduitUsingPOST(produit)

saveProduit

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
Produit produit = new Produit(); // Produit | produit
try {
    Produit result = apiInstance.saveProduitUsingPOST(produit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#saveProduitUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **produit** | [**Produit**](Produit.md)| produit |

### Return type

[**Produit**](Produit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveProduitUsingPUT"></a>
# **saveProduitUsingPUT**
> Produit saveProduitUsingPUT(id, produit)

saveProduit

### Example
```java
// Import classes:
//import org.abdel.gestionproduit.testswaggercodegen.ApiException;
//import org.abdel.gestionproduit.testswaggercodegen.apiapi.ProduitServiceApi;


ProduitServiceApi apiInstance = new ProduitServiceApi();
Long id = 789L; // Long | id
Produit produit = new Produit(); // Produit | produit
try {
    Produit result = apiInstance.saveProduitUsingPUT(id, produit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProduitServiceApi#saveProduitUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **produit** | [**Produit**](Produit.md)| produit |

### Return type

[**Produit**](Produit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

