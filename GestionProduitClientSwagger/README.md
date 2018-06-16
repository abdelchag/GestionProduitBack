# GestionProduitTestSwagger

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.abdel.gestionproduit.testswaggercodegen</groupId>
    <artifactId>GestionProduitTestSwagger</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.abdel.gestionproduit.testswaggercodegen:GestionProduitTestSwagger:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/GestionProduitTestSwagger-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.abdel.gestionproduit.testswaggercodegen.*;
import org.abdel.gestionproduit.testswaggercodegen.auth.*;
import org.abdel.gestionproduit.testswaggercodegen.model.*;
import org.abdel.gestionproduit.testswaggercodegen.apiapi.BasicErrorControllerApi;

import java.io.File;
import java.util.*;

public class BasicErrorControllerApiExample {

    public static void main(String[] args) {
        
        BasicErrorControllerApi apiInstance = new BasicErrorControllerApi();
        try {
            ModelAndView result = apiInstance.errorHtmlUsingDELETE();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BasicErrorControllerApi#errorHtmlUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasicErrorControllerApi* | [**errorHtmlUsingDELETE**](docs/BasicErrorControllerApi.md#errorHtmlUsingDELETE) | **DELETE** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingGET**](docs/BasicErrorControllerApi.md#errorHtmlUsingGET) | **GET** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingHEAD**](docs/BasicErrorControllerApi.md#errorHtmlUsingHEAD) | **HEAD** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingOPTIONS**](docs/BasicErrorControllerApi.md#errorHtmlUsingOPTIONS) | **OPTIONS** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingPATCH**](docs/BasicErrorControllerApi.md#errorHtmlUsingPATCH) | **PATCH** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingPOST**](docs/BasicErrorControllerApi.md#errorHtmlUsingPOST) | **POST** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingPUT**](docs/BasicErrorControllerApi.md#errorHtmlUsingPUT) | **PUT** /error | errorHtml
*ProduitServiceApi* | [**deleteProduitUsingDELETE**](docs/ProduitServiceApi.md#deleteProduitUsingDELETE) | **DELETE** /produits/{id} | deleteProduit
*ProduitServiceApi* | [**getAllUsingGET**](docs/ProduitServiceApi.md#getAllUsingGET) | **GET** /produits | Get all product
*ProduitServiceApi* | [**getProduitByIdUsingGET**](docs/ProduitServiceApi.md#getProduitByIdUsingGET) | **GET** /produits/{id} | getProduitById
*ProduitServiceApi* | [**getProduitsByDesignUsingGET**](docs/ProduitServiceApi.md#getProduitsByDesignUsingGET) | **GET** /chercher | getProduitsByDesign
*ProduitServiceApi* | [**getProduitsByDesignationUsingGET**](docs/ProduitServiceApi.md#getProduitsByDesignationUsingGET) | **GET** /ckalab | getProduitsByDesignation
*ProduitServiceApi* | [**saveProduitUsingPOST**](docs/ProduitServiceApi.md#saveProduitUsingPOST) | **POST** /produits | saveProduit
*ProduitServiceApi* | [**saveProduitUsingPUT**](docs/ProduitServiceApi.md#saveProduitUsingPUT) | **PUT** /produits/{id} | saveProduit


## Documentation for Models

 - [Exception](docs/Exception.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [PageProduit](docs/PageProduit.md)
 - [Produit](docs/Produit.md)
 - [RuntimeException](docs/RuntimeException.md)
 - [Sort](docs/Sort.md)
 - [StackTraceElement](docs/StackTraceElement.md)
 - [Throwable](docs/Throwable.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



