/*
 * Plan SW - Toepasbare regel SW
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: robert.melskens@vng.nl
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ActiviteitHal;
import org.openapitools.client.model.ActiviteitHalCollectie;
import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.CrsEnum;
import org.openapitools.client.model.Foutbericht;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActiviteitenApi {
    private ApiClient localVarApiClient;

    public ActiviteitenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActiviteitenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getactiviteit
     * @param identificatie &lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt; (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getactiviteitCall(String identificatie, CrsEnum acceptCrs, String expand, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/activiteiten/{identificatie}"
            .replaceAll("\\{" + "identificatie" + "\\}", localVarApiClient.escapeString(identificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (acceptCrs != null) {
            localVarHeaderParams.put("Accept-Crs", localVarApiClient.parameterToString(acceptCrs));
        }

        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getactiviteitValidateBeforeCall(String identificatie, CrsEnum acceptCrs, String expand, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identificatie' is set
        if (identificatie == null) {
            throw new ApiException("Missing the required parameter 'identificatie' when calling getactiviteit(Async)");
        }
        

        okhttp3.Call localVarCall = getactiviteitCall(identificatie, acceptCrs, expand, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
     * @param identificatie &lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt; (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @return ActiviteitHal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ActiviteitHal getactiviteit(String identificatie, CrsEnum acceptCrs, String expand) throws ApiException {
        ApiResponse<ActiviteitHal> localVarResp = getactiviteitWithHttpInfo(identificatie, acceptCrs, expand);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
     * @param identificatie &lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt; (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @return ApiResponse&lt;ActiviteitHal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<ActiviteitHal> getactiviteitWithHttpInfo(String identificatie, CrsEnum acceptCrs, String expand) throws ApiException {
        okhttp3.Call localVarCall = getactiviteitValidateBeforeCall(identificatie, acceptCrs, expand, null);
        Type localVarReturnType = new TypeToken<ActiviteitHal>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
     * @param identificatie &lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt; (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getactiviteitAsync(String identificatie, CrsEnum acceptCrs, String expand, final ApiCallback<ActiviteitHal> _callback) throws ApiException {

        okhttp3.Call localVarCall = getactiviteitValidateBeforeCall(identificatie, acceptCrs, expand, _callback);
        Type localVarReturnType = new TypeToken<ActiviteitHal>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getactiviteiten
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param naam &lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt; (optional)
     * @param pageSize  (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Pagination-Page -  <br>  * X-Pagination-Limit -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getactiviteitenCall(CrsEnum acceptCrs, Integer page, String expand, String naam, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/activiteiten";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (naam != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("naam", naam));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (acceptCrs != null) {
            localVarHeaderParams.put("Accept-Crs", localVarApiClient.parameterToString(acceptCrs));
        }

        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getactiviteitenValidateBeforeCall(CrsEnum acceptCrs, Integer page, String expand, String naam, Integer pageSize, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getactiviteitenCall(acceptCrs, page, expand, naam, pageSize, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param naam &lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt; (optional)
     * @param pageSize  (optional, default to 20)
     * @return ActiviteitHalCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Pagination-Page -  <br>  * X-Pagination-Limit -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ActiviteitHalCollectie getactiviteiten(CrsEnum acceptCrs, Integer page, String expand, String naam, Integer pageSize) throws ApiException {
        ApiResponse<ActiviteitHalCollectie> localVarResp = getactiviteitenWithHttpInfo(acceptCrs, page, expand, naam, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param naam &lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt; (optional)
     * @param pageSize  (optional, default to 20)
     * @return ApiResponse&lt;ActiviteitHalCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Pagination-Page -  <br>  * X-Pagination-Limit -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<ActiviteitHalCollectie> getactiviteitenWithHttpInfo(CrsEnum acceptCrs, Integer page, String expand, String naam, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getactiviteitenValidateBeforeCall(acceptCrs, page, expand, naam, pageSize, null);
        Type localVarReturnType = new TypeToken<ActiviteitHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param naam &lt;body&gt;&lt;p&gt;Een (korte) omschrijving van de activiteit.&lt;/p&gt;&lt;/body&gt; (optional)
     * @param pageSize  (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  * X-Pagination-Page -  <br>  * X-Pagination-Limit -  <br>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getactiviteitenAsync(CrsEnum acceptCrs, Integer page, String expand, String naam, Integer pageSize, final ApiCallback<ActiviteitHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getactiviteitenValidateBeforeCall(acceptCrs, page, expand, naam, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ActiviteitHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
