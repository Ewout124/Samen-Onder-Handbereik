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


import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.CrsEnum;
import org.openapitools.client.model.Foutbericht;
import org.openapitools.client.model.JuridischeRegelVoorIedereenHal;
import org.openapitools.client.model.JuridischeRegelVoorIedereenHalCollectie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JuridischeRegelsVoorIedereenApi {
    private ApiClient localVarApiClient;

    public JuridischeRegelsVoorIedereenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JuridischeRegelsVoorIedereenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getjuridischeRegelVoorIedereen
     * @param identificatie &lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt; (required)
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
    public okhttp3.Call getjuridischeRegelVoorIedereenCall(String identificatie, CrsEnum acceptCrs, String expand, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/juridischeregelsvooriedereen/{identificatie}"
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
    private okhttp3.Call getjuridischeRegelVoorIedereenValidateBeforeCall(String identificatie, CrsEnum acceptCrs, String expand, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identificatie' is set
        if (identificatie == null) {
            throw new ApiException("Missing the required parameter 'identificatie' when calling getjuridischeRegelVoorIedereen(Async)");
        }
        

        okhttp3.Call localVarCall = getjuridischeRegelVoorIedereenCall(identificatie, acceptCrs, expand, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert. I.h.k.v. deze API zijn alleen juridische regels die minimaal één activiteit bevatten van belang.&lt;/p&gt;&lt;/body&gt;
     * @param identificatie &lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt; (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @return JuridischeRegelVoorIedereenHal
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
    public JuridischeRegelVoorIedereenHal getjuridischeRegelVoorIedereen(String identificatie, CrsEnum acceptCrs, String expand) throws ApiException {
        ApiResponse<JuridischeRegelVoorIedereenHal> localVarResp = getjuridischeRegelVoorIedereenWithHttpInfo(identificatie, acceptCrs, expand);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert. I.h.k.v. deze API zijn alleen juridische regels die minimaal één activiteit bevatten van belang.&lt;/p&gt;&lt;/body&gt;
     * @param identificatie &lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt; (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @return ApiResponse&lt;JuridischeRegelVoorIedereenHal&gt;
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
    public ApiResponse<JuridischeRegelVoorIedereenHal> getjuridischeRegelVoorIedereenWithHttpInfo(String identificatie, CrsEnum acceptCrs, String expand) throws ApiException {
        okhttp3.Call localVarCall = getjuridischeRegelVoorIedereenValidateBeforeCall(identificatie, acceptCrs, expand, null);
        Type localVarReturnType = new TypeToken<JuridischeRegelVoorIedereenHal>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert. I.h.k.v. deze API zijn alleen juridische regels die minimaal één activiteit bevatten van belang.&lt;/p&gt;&lt;/body&gt;
     * @param identificatie &lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt; (required)
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
    public okhttp3.Call getjuridischeRegelVoorIedereenAsync(String identificatie, CrsEnum acceptCrs, String expand, final ApiCallback<JuridischeRegelVoorIedereenHal> _callback) throws ApiException {

        okhttp3.Call localVarCall = getjuridischeRegelVoorIedereenValidateBeforeCall(identificatie, acceptCrs, expand, _callback);
        Type localVarReturnType = new TypeToken<JuridischeRegelVoorIedereenHal>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getjuridischeRegelsVoorIedereen
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
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
    public okhttp3.Call getjuridischeRegelsVoorIedereenCall(CrsEnum acceptCrs, Integer page, String expand, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/juridischeregelsvooriedereen";

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
    private okhttp3.Call getjuridischeRegelsVoorIedereenValidateBeforeCall(CrsEnum acceptCrs, Integer page, String expand, Integer pageSize, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getjuridischeRegelsVoorIedereenCall(acceptCrs, page, expand, pageSize, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert. I.h.k.v. deze API zijn alleen juridische regels die minimaal één activiteit bevatten van belang.&lt;/p&gt;&lt;/body&gt;
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param pageSize  (optional, default to 20)
     * @return JuridischeRegelVoorIedereenHalCollectie
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
    public JuridischeRegelVoorIedereenHalCollectie getjuridischeRegelsVoorIedereen(CrsEnum acceptCrs, Integer page, String expand, Integer pageSize) throws ApiException {
        ApiResponse<JuridischeRegelVoorIedereenHalCollectie> localVarResp = getjuridischeRegelsVoorIedereenWithHttpInfo(acceptCrs, page, expand, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert. I.h.k.v. deze API zijn alleen juridische regels die minimaal één activiteit bevatten van belang.&lt;/p&gt;&lt;/body&gt;
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
     * @param pageSize  (optional, default to 20)
     * @return ApiResponse&lt;JuridischeRegelVoorIedereenHalCollectie&gt;
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
    public ApiResponse<JuridischeRegelVoorIedereenHalCollectie> getjuridischeRegelsVoorIedereenWithHttpInfo(CrsEnum acceptCrs, Integer page, String expand, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getjuridischeRegelsVoorIedereenValidateBeforeCall(acceptCrs, page, expand, pageSize, null);
        Type localVarReturnType = new TypeToken<JuridischeRegelVoorIedereenHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert. I.h.k.v. deze API zijn alleen juridische regels die minimaal één activiteit bevatten van belang.&lt;/p&gt;&lt;/body&gt;
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param page Een pagina binnen de gepagineerde resultatenset. (optional)
     * @param expand Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature). (optional)
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
    public okhttp3.Call getjuridischeRegelsVoorIedereenAsync(CrsEnum acceptCrs, Integer page, String expand, Integer pageSize, final ApiCallback<JuridischeRegelVoorIedereenHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getjuridischeRegelsVoorIedereenValidateBeforeCall(acceptCrs, page, expand, pageSize, _callback);
        Type localVarReturnType = new TypeToken<JuridischeRegelVoorIedereenHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
