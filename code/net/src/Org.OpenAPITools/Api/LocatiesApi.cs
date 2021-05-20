/*
 * Plan SW - Toepasbare regel SW
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: robert.melskens@vng.nl
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Threading;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILocatiesApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <returns>LocatieHal</returns>
        LocatieHal Getlocatie (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <returns>ApiResponse of LocatieHal</returns>
        ApiResponse<LocatieHal> GetlocatieWithHttpInfo (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <returns>LocatieHalCollectie</returns>
        LocatieHalCollectie Getlocaties (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <returns>ApiResponse of LocatieHalCollectie</returns>
        ApiResponse<LocatieHalCollectie> GetlocatiesWithHttpInfo (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?));
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of LocatieHal</returns>
        System.Threading.Tasks.Task<LocatieHal> GetlocatieAsync (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?), CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of ApiResponse (LocatieHal)</returns>
        System.Threading.Tasks.Task<ApiResponse<LocatieHal>> GetlocatieWithHttpInfoAsync (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?), CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of LocatieHalCollectie</returns>
        System.Threading.Tasks.Task<LocatieHalCollectie> GetlocatiesAsync (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?), CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of ApiResponse (LocatieHalCollectie)</returns>
        System.Threading.Tasks.Task<ApiResponse<LocatieHalCollectie>> GetlocatiesWithHttpInfoAsync (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?), CancellationToken cancellationToken = default(CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class LocatiesApi : ILocatiesApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="LocatiesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LocatiesApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LocatiesApi"/> class
        /// </summary>
        /// <returns></returns>
        public LocatiesApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LocatiesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public LocatiesApi(Org.OpenAPITools.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Org.OpenAPITools.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <returns>LocatieHal</returns>
        public LocatieHal Getlocatie (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?))
        {
             ApiResponse<LocatieHal> localVarResponse = GetlocatieWithHttpInfo(identificatie, acceptCrs);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <returns>ApiResponse of LocatieHal</returns>
        public ApiResponse<LocatieHal> GetlocatieWithHttpInfo (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?))
        {
            // verify the required parameter 'identificatie' is set
            if (identificatie == null)
                throw new ApiException(400, "Missing required parameter 'identificatie' when calling LocatiesApi->Getlocatie");

            var localVarPath = "/locaties/{identificatie}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/hal+json",
                "application/problem+json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (identificatie != null) localVarPathParams.Add("identificatie", this.Configuration.ApiClient.ParameterToString(identificatie)); // path parameter
            if (acceptCrs != null) localVarHeaderParams.Add("Accept-Crs", this.Configuration.ApiClient.ParameterToString(acceptCrs)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("Getlocatie", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LocatieHal>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LocatieHal) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LocatieHal)));
        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of LocatieHal</returns>
        public async System.Threading.Tasks.Task<LocatieHal> GetlocatieAsync (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?), CancellationToken cancellationToken = default(CancellationToken))
        {
             ApiResponse<LocatieHal> localVarResponse = await GetlocatieWithHttpInfoAsync(identificatie, acceptCrs, cancellationToken);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van gegevens van een amendement retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="identificatie">&lt;body&gt;&lt;p&gt;De unieke identificatie waaronder elk object van dit type bekend is.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;&lt;body&gt;&lt;p&gt;De verzameling van waarden die gegevens van dit attribuutsoort kunnen hebben, dat wil zeggen het waardenbereik, uitgedrukt in een specifieke structuur.&lt;/p&gt;&lt;/body&gt;</param>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of ApiResponse (LocatieHal)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<LocatieHal>> GetlocatieWithHttpInfoAsync (string identificatie, CrsEnum? acceptCrs = default(CrsEnum?), CancellationToken cancellationToken = default(CancellationToken))
        {
            // verify the required parameter 'identificatie' is set
            if (identificatie == null)
                throw new ApiException(400, "Missing required parameter 'identificatie' when calling LocatiesApi->Getlocatie");

            var localVarPath = "/locaties/{identificatie}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/hal+json",
                "application/problem+json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (identificatie != null) localVarPathParams.Add("identificatie", this.Configuration.ApiClient.ParameterToString(identificatie)); // path parameter
            if (acceptCrs != null) localVarHeaderParams.Add("Accept-Crs", this.Configuration.ApiClient.ParameterToString(acceptCrs)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType, cancellationToken);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("Getlocatie", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LocatieHal>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LocatieHal) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LocatieHal)));
        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <returns>LocatieHalCollectie</returns>
        public LocatieHalCollectie Getlocaties (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?))
        {
             ApiResponse<LocatieHalCollectie> localVarResponse = GetlocatiesWithHttpInfo(acceptCrs, page, pageSize);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <returns>ApiResponse of LocatieHalCollectie</returns>
        public ApiResponse<LocatieHalCollectie> GetlocatiesWithHttpInfo (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?))
        {

            var localVarPath = "/locaties";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/hal+json",
                "application/problem+json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (page != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "page", page)); // query parameter
            if (pageSize != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "pageSize", pageSize)); // query parameter
            if (acceptCrs != null) localVarHeaderParams.Add("Accept-Crs", this.Configuration.ApiClient.ParameterToString(acceptCrs)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("Getlocaties", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LocatieHalCollectie>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LocatieHalCollectie) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LocatieHalCollectie)));
        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of LocatieHalCollectie</returns>
        public async System.Threading.Tasks.Task<LocatieHalCollectie> GetlocatiesAsync (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?), CancellationToken cancellationToken = default(CancellationToken))
        {
             ApiResponse<LocatieHalCollectie> localVarResponse = await GetlocatiesWithHttpInfoAsync(acceptCrs, page, pageSize, cancellationToken);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  &lt;body&gt;&lt;p&gt;Het bericht dat de JSON/REST API voor het ophalen van een collectie amendementen retourneert.&lt;/p&gt;&lt;/body&gt;
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="acceptCrs">Gewenste CRS van de coördinaten in de response. (optional)</param>
        /// <param name="page">Een pagina binnen de gepagineerde resultatenset. (optional)</param>
        /// <param name="pageSize"> (optional, default to 20)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel request (optional) </param>
        /// <returns>Task of ApiResponse (LocatieHalCollectie)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<LocatieHalCollectie>> GetlocatiesWithHttpInfoAsync (CrsEnum? acceptCrs = default(CrsEnum?), int? page = default(int?), int? pageSize = default(int?), CancellationToken cancellationToken = default(CancellationToken))
        {

            var localVarPath = "/locaties";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/hal+json",
                "application/problem+json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (page != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "page", page)); // query parameter
            if (pageSize != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "pageSize", pageSize)); // query parameter
            if (acceptCrs != null) localVarHeaderParams.Add("Accept-Crs", this.Configuration.ApiClient.ParameterToString(acceptCrs)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType, cancellationToken);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("Getlocaties", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LocatieHalCollectie>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LocatieHalCollectie) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LocatieHalCollectie)));
        }

    }
}
