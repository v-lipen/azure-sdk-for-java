/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management;

import com.microsoft.windowsazure.core.ServiceClient;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.models.OperationStatus;
import com.microsoft.windowsazure.management.models.OperationStatusResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
* The Service Management API provides programmatic access to much of the
* functionality available through the Management Portal. The Service
* Management API is a REST API. All API operations are performed over SSL and
* mutually authenticated using X.509 v3 certificates.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/ee460799.aspx for more
* information)
*/
public class ManagementClientImpl extends ServiceClient<ManagementClient> implements ManagementClient
{
    private URI baseUri;
    
    /**
    * The URI used as the base for all Service Management requests.
    * @return The BaseUri value.
    */
    public URI getBaseUri()
    {
        return this.baseUri;
    }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * When you create a Windows Azure subscription, it is uniquely identified
    * by a subscription ID. The subscription ID forms part of the URI for
    * every call that you make to the Service Management API.  The Windows
    * Azure Service ManagementAPI use mutual authentication of management
    * certificates over SSL to ensure that a request made to the service is
    * secure.  No anonymous requests are allowed.
    * @return The Credentials value.
    */
    public SubscriptionCloudCredentials getCredentials()
    {
        return this.credentials;
    }
    
    private AffinityGroupOperations affinityGroups;
    
    /**
    * Operations for managing affinity groups beneath your subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460798.aspx for
    * more information)
    * @return The AffinityGroupsOperations value.
    */
    public AffinityGroupOperations getAffinityGroupsOperations()
    {
        return this.affinityGroups;
    }
    
    private LocationOperations locations;
    
    /**
    * The Service Management API includes operations for listing the available
    * data center locations for a hosted service in your subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/gg441299.aspx for
    * more information)
    * @return The LocationsOperations value.
    */
    public LocationOperations getLocationsOperations()
    {
        return this.locations;
    }
    
    private ManagementCertificateOperations managementCertificates;
    
    /**
    * You can use management certificates, which are also known as subscription
    * certificates, to authenticate clients attempting to connect to resources
    * associated with your Windows Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154124.aspx for
    * more information)
    * @return The ManagementCertificatesOperations value.
    */
    public ManagementCertificateOperations getManagementCertificatesOperations()
    {
        return this.managementCertificates;
    }
    
    private SubscriptionOperations subscriptions;
    
    /**
    * Operation for listing subscription operations and details.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/gg715315.aspx for
    * more information)
    * @return The SubscriptionsOperations value.
    */
    public SubscriptionOperations getSubscriptionsOperations()
    {
        return this.subscriptions;
    }
    
    /**
    * Initializes a new instance of the ManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    private ManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService)
    {
        super(httpBuilder, executorService);
        this.affinityGroups = new AffinityGroupOperationsImpl(this);
        this.locations = new LocationOperationsImpl(this);
        this.managementCertificates = new ManagementCertificateOperationsImpl(this);
        this.subscriptions = new SubscriptionOperationsImpl(this);
    }
    
    /**
    * Initializes a new instance of the ManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials When you create a Windows Azure subscription, it is
    * uniquely identified by a subscription ID. The subscription ID forms part
    * of the URI for every call that you make to the Service Management API.
    * The Windows Azure Service ManagementAPI use mutual authentication of
    * management certificates over SSL to ensure that a request made to the
    * service is secure.  No anonymous requests are allowed.
    * @param baseUri The URI used as the base for all Service Management
    * requests.
    */
    public ManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, SubscriptionCloudCredentials credentials, URI baseUri)
    {
        this(httpBuilder, executorService);
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        if (baseUri == null)
        {
            throw new NullPointerException("baseUri");
        }
        this.credentials = credentials;
        this.baseUri = baseUri;
    }
    
    /**
    * Initializes a new instance of the ManagementClientImpl class.
    * Initializes a new instance of the ManagementClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param credentials When you create a Windows Azure subscription, it is
    * uniquely identified by a subscription ID. The subscription ID forms part
    * of the URI for every call that you make to the Service Management API.
    * The Windows Azure Service ManagementAPI use mutual authentication of
    * management certificates over SSL to ensure that a request made to the
    * service is secure.  No anonymous requests are allowed.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    */
    @Inject
    public ManagementClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, @Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials) throws java.net.URISyntaxException
    {
        this(httpBuilder, executorService);
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net");
    }
    
    /**
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    protected ManagementClientImpl newInstance(HttpClientBuilder httpBuilder, ExecutorService executorService)
    {
        return new ManagementClientImpl(httpBuilder, executorService, this.getCredentials(), this.getBaseUri());
    }
    
    /**
    * The Get Operation Status operation returns the status of thespecified
    * operation. After calling an asynchronous operation, you can call Get
    * Operation Status to determine whether the operation has succeeded,
    * failed, or is still in progress.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
    * more information)
    *
    * @param requestId The request ID for the request you wish to track. The
    * request ID is returned in the x-ms-request-id response header for every
    * request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    @Override
    public Future<OperationStatusResponse> getOperationStatusAsync(final String requestId)
    {
        return this.getExecutorService().submit(new Callable<OperationStatusResponse>() { 
            @Override
            public OperationStatusResponse call() throws Exception
            {
                return getOperationStatus(requestId);
            }
         });
    }
    
    /**
    * The Get Operation Status operation returns the status of thespecified
    * operation. After calling an asynchronous operation, you can call Get
    * Operation Status to determine whether the operation has succeeded,
    * failed, or is still in progress.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
    * more information)
    *
    * @param requestId The request ID for the request you wish to track. The
    * request ID is returned in the x-ms-request-id response header for every
    * request.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    @Override
    public OperationStatusResponse getOperationStatus(String requestId) throws IOException, ServiceException, ParserConfigurationException, SAXException
    {
        // Validate
        if (requestId == null)
        {
            throw new NullPointerException("requestId");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("requestId", requestId);
            CloudTracing.enter(invocationId, this, "getOperationStatusAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getBaseUri() + "/" + this.getCredentials().getSubscriptionId() + "/operations/" + requestId;
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2013-03-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try
        {
            if (shouldTrace)
            {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getHttpClient().execute(httpRequest);
            if (shouldTrace)
            {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK)
            {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace)
                {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationStatusResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new OperationStatusResponse();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document responseDoc = documentBuilder.parse(responseContent);
            
            NodeList elements = responseDoc.getElementsByTagName("Operation");
            Element operationElement = elements.getLength() > 0 ? ((Element) elements.item(0)) : null;
            if (operationElement != null)
            {
                NodeList elements2 = operationElement.getElementsByTagName("ID");
                Element idElement = elements2.getLength() > 0 ? ((Element) elements2.item(0)) : null;
                if (idElement != null)
                {
                    String idInstance;
                    idInstance = idElement.getTextContent();
                    result.setId(idInstance);
                }
                
                NodeList elements3 = operationElement.getElementsByTagName("Status");
                Element statusElement = elements3.getLength() > 0 ? ((Element) elements3.item(0)) : null;
                if (statusElement != null)
                {
                    OperationStatus statusInstance;
                    statusInstance = OperationStatus.valueOf(statusElement.getTextContent());
                    result.setStatus(statusInstance);
                }
                
                NodeList elements4 = operationElement.getElementsByTagName("HttpStatusCode");
                Element httpStatusCodeElement = elements4.getLength() > 0 ? ((Element) elements4.item(0)) : null;
                if (httpStatusCodeElement != null)
                {
                    Integer httpStatusCodeInstance;
                    httpStatusCodeInstance = Integer.valueOf(httpStatusCodeElement.getTextContent());
                    result.setHttpStatusCode(httpStatusCodeInstance);
                }
                
                NodeList elements5 = operationElement.getElementsByTagName("Error");
                Element errorElement = elements5.getLength() > 0 ? ((Element) elements5.item(0)) : null;
                if (errorElement != null)
                {
                    OperationStatusResponse.ErrorDetails errorInstance = new OperationStatusResponse.ErrorDetails();
                    result.setError(errorInstance);
                    
                    NodeList elements6 = errorElement.getElementsByTagName("Code");
                    Element codeElement = elements6.getLength() > 0 ? ((Element) elements6.item(0)) : null;
                    if (codeElement != null)
                    {
                        String codeInstance;
                        codeInstance = codeElement.getTextContent();
                        errorInstance.setCode(codeInstance);
                    }
                    
                    NodeList elements7 = errorElement.getElementsByTagName("Message");
                    Element messageElement = elements7.getLength() > 0 ? ((Element) elements7.item(0)) : null;
                    if (messageElement != null)
                    {
                        String messageInstance;
                        messageInstance = messageElement.getTextContent();
                        errorInstance.setMessage(messageInstance);
                    }
                }
            }
            
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0)
            {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace)
            {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        }
        finally
        {
            if (httpResponse != null && httpResponse.getEntity() != null)
            {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
