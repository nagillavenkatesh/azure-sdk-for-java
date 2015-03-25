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

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.models.DatabaseSecurityPolicy;
import com.microsoft.azure.management.sql.models.DatabaseSecurityPolicyGetResponse;
import com.microsoft.azure.management.sql.models.DatabaseSecurityPolicyProperties;
import com.microsoft.azure.management.sql.models.DatabaseSecurityPolicyUpdateParameters;
import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.NullNode;
import org.codehaus.jackson.node.ObjectNode;

/**
* Represents all the operations for operating on Azure SQL Database security
* policy.  Contains operations to: Retrieve and Update security policy
*/
public class SecurityOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, SecurityOperations {
    /**
    * Initializes a new instance of the SecurityOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    SecurityOperationsImpl(SqlManagementClientImpl client) {
        this.client = client;
    }
    
    private SqlManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.azure.management.sql.SqlManagementClientImpl.
    * @return The Client value.
    */
    public SqlManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Gets Azure SQL Database security policy object according to a given Azure
    * SQL Database Server and Database.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the Azure SQL Database Server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the Azure SQL Database hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the security policy is being retreived.
    * @return Represents the response to a get Azure SQL Database security
    * policy request
    */
    @Override
    public Future<DatabaseSecurityPolicyGetResponse> getAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return this.getClient().getExecutorService().submit(new Callable<DatabaseSecurityPolicyGetResponse>() { 
            @Override
            public DatabaseSecurityPolicyGetResponse call() throws Exception {
                return get(resourceGroupName, serverName, databaseName);
            }
         });
    }
    
    /**
    * Gets Azure SQL Database security policy object according to a given Azure
    * SQL Database Server and Database.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the Azure SQL Database Server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the Azure SQL Database hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the security policy is being retreived.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a get Azure SQL Database security
    * policy request
    */
    @Override
    public DatabaseSecurityPolicyGetResponse get(String resourceGroupName, String serverName, String databaseName) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            CloudTracing.enter(invocationId, this, "getAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/subscriptions/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/resourceGroups/" + resourceGroupName.trim() + "/providers/" + "Microsoft.Sql" + "/servers/" + serverName.trim() + "/databaseSecurityPolicies/" + databaseName.trim() + "?";
        url = url + "api-version=" + "2014-04-01";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            DatabaseSecurityPolicyGetResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new DatabaseSecurityPolicyGetResponse();
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode responseDoc = null;
            if (responseContent == null == false) {
                responseDoc = objectMapper.readTree(responseContent);
            }
            
            if (responseDoc != null && responseDoc instanceof NullNode == false) {
                DatabaseSecurityPolicy databaseSecurityPolicyInstance = new DatabaseSecurityPolicy();
                result.setDatabaseSecurityPolicy(databaseSecurityPolicyInstance);
                
                JsonNode nameValue = responseDoc.get("name");
                if (nameValue != null && nameValue instanceof NullNode == false) {
                    String nameInstance;
                    nameInstance = nameValue.getTextValue();
                    databaseSecurityPolicyInstance.setName(nameInstance);
                }
                
                JsonNode propertiesValue = responseDoc.get("properties");
                if (propertiesValue != null && propertiesValue instanceof NullNode == false) {
                    DatabaseSecurityPolicyProperties propertiesInstance = new DatabaseSecurityPolicyProperties();
                    databaseSecurityPolicyInstance.setProperties(propertiesInstance);
                    
                    JsonNode isAuditingEnabledValue = propertiesValue.get("isAuditingEnabled");
                    if (isAuditingEnabledValue != null && isAuditingEnabledValue instanceof NullNode == false) {
                        boolean isAuditingEnabledInstance;
                        isAuditingEnabledInstance = isAuditingEnabledValue.getBooleanValue();
                        propertiesInstance.setIsAuditingEnabled(isAuditingEnabledInstance);
                    }
                    
                    JsonNode retentionDaysValue = propertiesValue.get("retentionDays");
                    if (retentionDaysValue != null && retentionDaysValue instanceof NullNode == false) {
                        int retentionDaysInstance;
                        retentionDaysInstance = retentionDaysValue.getIntValue();
                        propertiesInstance.setRetentionDays(retentionDaysInstance);
                    }
                    
                    JsonNode isEventTypeDataAccessEnabledValue = propertiesValue.get("isEventTypeDataAccessEnabled");
                    if (isEventTypeDataAccessEnabledValue != null && isEventTypeDataAccessEnabledValue instanceof NullNode == false) {
                        boolean isEventTypeDataAccessEnabledInstance;
                        isEventTypeDataAccessEnabledInstance = isEventTypeDataAccessEnabledValue.getBooleanValue();
                        propertiesInstance.setIsEventTypeDataAccessEnabled(isEventTypeDataAccessEnabledInstance);
                    }
                    
                    JsonNode isEventTypeSchemaChangeEnabledValue = propertiesValue.get("isEventTypeSchemaChangeEnabled");
                    if (isEventTypeSchemaChangeEnabledValue != null && isEventTypeSchemaChangeEnabledValue instanceof NullNode == false) {
                        boolean isEventTypeSchemaChangeEnabledInstance;
                        isEventTypeSchemaChangeEnabledInstance = isEventTypeSchemaChangeEnabledValue.getBooleanValue();
                        propertiesInstance.setIsEventTypeSchemaChangeEnabled(isEventTypeSchemaChangeEnabledInstance);
                    }
                    
                    JsonNode isEventTypeDataChangesEnabledValue = propertiesValue.get("isEventTypeDataChangesEnabled");
                    if (isEventTypeDataChangesEnabledValue != null && isEventTypeDataChangesEnabledValue instanceof NullNode == false) {
                        boolean isEventTypeDataChangesEnabledInstance;
                        isEventTypeDataChangesEnabledInstance = isEventTypeDataChangesEnabledValue.getBooleanValue();
                        propertiesInstance.setIsEventTypeDataChangesEnabled(isEventTypeDataChangesEnabledInstance);
                    }
                    
                    JsonNode isEventTypeSecurityExceptionsEnabledValue = propertiesValue.get("isEventTypeSecurityExceptionsEnabled");
                    if (isEventTypeSecurityExceptionsEnabledValue != null && isEventTypeSecurityExceptionsEnabledValue instanceof NullNode == false) {
                        boolean isEventTypeSecurityExceptionsEnabledInstance;
                        isEventTypeSecurityExceptionsEnabledInstance = isEventTypeSecurityExceptionsEnabledValue.getBooleanValue();
                        propertiesInstance.setIsEventTypeSecurityExceptionsEnabled(isEventTypeSecurityExceptionsEnabledInstance);
                    }
                    
                    JsonNode isEventTypeGrantRevokePermissionsEnabledValue = propertiesValue.get("isEventTypeGrantRevokePermissionsEnabled");
                    if (isEventTypeGrantRevokePermissionsEnabledValue != null && isEventTypeGrantRevokePermissionsEnabledValue instanceof NullNode == false) {
                        boolean isEventTypeGrantRevokePermissionsEnabledInstance;
                        isEventTypeGrantRevokePermissionsEnabledInstance = isEventTypeGrantRevokePermissionsEnabledValue.getBooleanValue();
                        propertiesInstance.setIsEventTypeGrantRevokePermissionsEnabled(isEventTypeGrantRevokePermissionsEnabledInstance);
                    }
                    
                    JsonNode storageAccountNameValue = propertiesValue.get("storageAccountName");
                    if (storageAccountNameValue != null && storageAccountNameValue instanceof NullNode == false) {
                        String storageAccountNameInstance;
                        storageAccountNameInstance = storageAccountNameValue.getTextValue();
                        propertiesInstance.setStorageAccountName(storageAccountNameInstance);
                    }
                    
                    JsonNode storageAccountKeyValue = propertiesValue.get("storageAccountKey");
                    if (storageAccountKeyValue != null && storageAccountKeyValue instanceof NullNode == false) {
                        String storageAccountKeyInstance;
                        storageAccountKeyInstance = storageAccountKeyValue.getTextValue();
                        propertiesInstance.setStorageAccountKey(storageAccountKeyInstance);
                    }
                    
                    JsonNode secondaryStorageAccountKeyValue = propertiesValue.get("secondaryStorageAccountKey");
                    if (secondaryStorageAccountKeyValue != null && secondaryStorageAccountKeyValue instanceof NullNode == false) {
                        String secondaryStorageAccountKeyInstance;
                        secondaryStorageAccountKeyInstance = secondaryStorageAccountKeyValue.getTextValue();
                        propertiesInstance.setSecondaryStorageAccountKey(secondaryStorageAccountKeyInstance);
                    }
                    
                    JsonNode storageTableEndpointValue = propertiesValue.get("storageTableEndpoint");
                    if (storageTableEndpointValue != null && storageTableEndpointValue instanceof NullNode == false) {
                        String storageTableEndpointInstance;
                        storageTableEndpointInstance = storageTableEndpointValue.getTextValue();
                        propertiesInstance.setStorageTableEndpoint(storageTableEndpointInstance);
                    }
                    
                    JsonNode storageAccountResourceGroupNameValue = propertiesValue.get("storageAccountResourceGroupName");
                    if (storageAccountResourceGroupNameValue != null && storageAccountResourceGroupNameValue instanceof NullNode == false) {
                        String storageAccountResourceGroupNameInstance;
                        storageAccountResourceGroupNameInstance = storageAccountResourceGroupNameValue.getTextValue();
                        propertiesInstance.setStorageAccountResourceGroupName(storageAccountResourceGroupNameInstance);
                    }
                    
                    JsonNode storageAccountSubscriptionIdValue = propertiesValue.get("storageAccountSubscriptionId");
                    if (storageAccountSubscriptionIdValue != null && storageAccountSubscriptionIdValue instanceof NullNode == false) {
                        String storageAccountSubscriptionIdInstance;
                        storageAccountSubscriptionIdInstance = storageAccountSubscriptionIdValue.getTextValue();
                        propertiesInstance.setStorageAccountSubscriptionId(storageAccountSubscriptionIdInstance);
                    }
                    
                    JsonNode adoNetConnectionStringValue = propertiesValue.get("adoNetConnectionString");
                    if (adoNetConnectionStringValue != null && adoNetConnectionStringValue instanceof NullNode == false) {
                        String adoNetConnectionStringInstance;
                        adoNetConnectionStringInstance = adoNetConnectionStringValue.getTextValue();
                        propertiesInstance.setAdoNetConnectionString(adoNetConnectionStringInstance);
                    }
                    
                    JsonNode odbcConnectionStringValue = propertiesValue.get("odbcConnectionString");
                    if (odbcConnectionStringValue != null && odbcConnectionStringValue instanceof NullNode == false) {
                        String odbcConnectionStringInstance;
                        odbcConnectionStringInstance = odbcConnectionStringValue.getTextValue();
                        propertiesInstance.setOdbcConnectionString(odbcConnectionStringInstance);
                    }
                    
                    JsonNode phpConnectionStringValue = propertiesValue.get("phpConnectionString");
                    if (phpConnectionStringValue != null && phpConnectionStringValue instanceof NullNode == false) {
                        String phpConnectionStringInstance;
                        phpConnectionStringInstance = phpConnectionStringValue.getTextValue();
                        propertiesInstance.setPhpConnectionString(phpConnectionStringInstance);
                    }
                    
                    JsonNode jdbcConnectionStringValue = propertiesValue.get("jdbcConnectionString");
                    if (jdbcConnectionStringValue != null && jdbcConnectionStringValue instanceof NullNode == false) {
                        String jdbcConnectionStringInstance;
                        jdbcConnectionStringInstance = jdbcConnectionStringValue.getTextValue();
                        propertiesInstance.setJdbcConnectionString(jdbcConnectionStringInstance);
                    }
                    
                    JsonNode proxyDnsNameValue = propertiesValue.get("proxyDnsName");
                    if (proxyDnsNameValue != null && proxyDnsNameValue instanceof NullNode == false) {
                        String proxyDnsNameInstance;
                        proxyDnsNameInstance = proxyDnsNameValue.getTextValue();
                        propertiesInstance.setProxyDnsName(proxyDnsNameInstance);
                    }
                    
                    JsonNode useServerDefaultValue = propertiesValue.get("useServerDefault");
                    if (useServerDefaultValue != null && useServerDefaultValue instanceof NullNode == false) {
                        boolean useServerDefaultInstance;
                        useServerDefaultInstance = useServerDefaultValue.getBooleanValue();
                        propertiesInstance.setUseServerDefault(useServerDefaultInstance);
                    }
                    
                    JsonNode isBlockDirectAccessEnabledValue = propertiesValue.get("isBlockDirectAccessEnabled");
                    if (isBlockDirectAccessEnabledValue != null && isBlockDirectAccessEnabledValue instanceof NullNode == false) {
                        boolean isBlockDirectAccessEnabledInstance;
                        isBlockDirectAccessEnabledInstance = isBlockDirectAccessEnabledValue.getBooleanValue();
                        propertiesInstance.setIsBlockDirectAccessEnabled(isBlockDirectAccessEnabledInstance);
                    }
                }
                
                JsonNode idValue = responseDoc.get("id");
                if (idValue != null && idValue instanceof NullNode == false) {
                    String idInstance;
                    idInstance = idValue.getTextValue();
                    databaseSecurityPolicyInstance.setId(idInstance);
                }
                
                JsonNode typeValue = responseDoc.get("type");
                if (typeValue != null && typeValue instanceof NullNode == false) {
                    String typeInstance;
                    typeInstance = typeValue.getTextValue();
                    databaseSecurityPolicyInstance.setType(typeInstance);
                }
                
                JsonNode locationValue = responseDoc.get("location");
                if (locationValue != null && locationValue instanceof NullNode == false) {
                    String locationInstance;
                    locationInstance = locationValue.getTextValue();
                    databaseSecurityPolicyInstance.setLocation(locationInstance);
                }
                
                JsonNode tagsSequenceElement = ((JsonNode) responseDoc.get("tags"));
                if (tagsSequenceElement != null && tagsSequenceElement instanceof NullNode == false) {
                    Iterator<Map.Entry<String, JsonNode>> itr = tagsSequenceElement.getFields();
                    while (itr.hasNext()) {
                        Map.Entry<String, JsonNode> property = itr.next();
                        String tagsKey = property.getKey();
                        String tagsValue = property.getValue().getTextValue();
                        databaseSecurityPolicyInstance.getTags().put(tagsKey, tagsValue);
                    }
                }
            }
            
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Updates an Azure SQL Database security policy object.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the Azure SQL Database Server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * which the Azure SQL Database belongs.
    * @param databaseName Required. The name of the Azure SQL Database to which
    * the security policy is applied.
    * @param parameters Required. The required parameters for updating a
    * security policy.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<AzureOperationResponse> updateAsync(final String resourceGroupName, final String serverName, final String databaseName, final DatabaseSecurityPolicyUpdateParameters parameters) {
        return this.getClient().getExecutorService().submit(new Callable<AzureOperationResponse>() {
            @Override
            public AzureOperationResponse call() throws Exception {
                return update(resourceGroupName, serverName, databaseName, parameters);
            }
         });
    }
    
    /**
    * Updates an Azure SQL Database security policy object.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the Azure SQL Database Server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * which the Azure SQL Database belongs.
    * @param databaseName Required. The name of the Azure SQL Database to which
    * the security policy is applied.
    * @param parameters Required. The required parameters for updating a
    * security policy.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public AzureOperationResponse update(String resourceGroupName, String serverName, String databaseName, DatabaseSecurityPolicyUpdateParameters parameters) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        if (parameters == null) {
            throw new NullPointerException("parameters");
        }
        if (parameters.getProperties() == null) {
            throw new NullPointerException("parameters.Properties");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "updateAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/subscriptions/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/resourceGroups/" + resourceGroupName.trim() + "/providers/" + "Microsoft.Sql" + "/servers/" + serverName.trim() + "/databaseSecurityPolicies/" + databaseName.trim() + "?";
        url = url + "api-version=" + "2014-04-01";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpPut httpRequest = new HttpPut(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/json");
        
        // Serialize Request
        String requestContent = null;
        JsonNode requestDoc = null;
        
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode databaseSecurityPolicyUpdateParametersValue = objectMapper.createObjectNode();
        requestDoc = databaseSecurityPolicyUpdateParametersValue;
        
        ObjectNode propertiesValue = objectMapper.createObjectNode();
        ((ObjectNode) databaseSecurityPolicyUpdateParametersValue).put("properties", propertiesValue);
        
        ((ObjectNode) propertiesValue).put("isAuditingEnabled", parameters.getProperties().isAuditingEnabled());
        
        ((ObjectNode) propertiesValue).put("retentionDays", parameters.getProperties().getRetentionDays());
        
        ((ObjectNode) propertiesValue).put("isEventTypeDataAccessEnabled", parameters.getProperties().isEventTypeDataAccessEnabled());
        
        ((ObjectNode) propertiesValue).put("isEventTypeSchemaChangeEnabled", parameters.getProperties().isEventTypeSchemaChangeEnabled());
        
        ((ObjectNode) propertiesValue).put("isEventTypeDataChangesEnabled", parameters.getProperties().isEventTypeDataChangesEnabled());
        
        ((ObjectNode) propertiesValue).put("isEventTypeSecurityExceptionsEnabled", parameters.getProperties().isEventTypeSecurityExceptionsEnabled());
        
        ((ObjectNode) propertiesValue).put("isEventTypeGrantRevokePermissionsEnabled", parameters.getProperties().isEventTypeGrantRevokePermissionsEnabled());
        
        if (parameters.getProperties().getStorageAccountName() != null) {
            ((ObjectNode) propertiesValue).put("storageAccountName", parameters.getProperties().getStorageAccountName());
        }
        
        if (parameters.getProperties().getStorageAccountKey() != null) {
            ((ObjectNode) propertiesValue).put("storageAccountKey", parameters.getProperties().getStorageAccountKey());
        }
        
        if (parameters.getProperties().getSecondaryStorageAccountKey() != null) {
            ((ObjectNode) propertiesValue).put("secondaryStorageAccountKey", parameters.getProperties().getSecondaryStorageAccountKey());
        }
        
        if (parameters.getProperties().getStorageTableEndpoint() != null) {
            ((ObjectNode) propertiesValue).put("storageTableEndpoint", parameters.getProperties().getStorageTableEndpoint());
        }
        
        if (parameters.getProperties().getStorageAccountResourceGroupName() != null) {
            ((ObjectNode) propertiesValue).put("storageAccountResourceGroupName", parameters.getProperties().getStorageAccountResourceGroupName());
        }
        
        if (parameters.getProperties().getStorageAccountSubscriptionId() != null) {
            ((ObjectNode) propertiesValue).put("storageAccountSubscriptionId", parameters.getProperties().getStorageAccountSubscriptionId());
        }
        
        if (parameters.getProperties().getAdoNetConnectionString() != null) {
            ((ObjectNode) propertiesValue).put("adoNetConnectionString", parameters.getProperties().getAdoNetConnectionString());
        }
        
        if (parameters.getProperties().getOdbcConnectionString() != null) {
            ((ObjectNode) propertiesValue).put("odbcConnectionString", parameters.getProperties().getOdbcConnectionString());
        }
        
        if (parameters.getProperties().getPhpConnectionString() != null) {
            ((ObjectNode) propertiesValue).put("phpConnectionString", parameters.getProperties().getPhpConnectionString());
        }
        
        if (parameters.getProperties().getJdbcConnectionString() != null) {
            ((ObjectNode) propertiesValue).put("jdbcConnectionString", parameters.getProperties().getJdbcConnectionString());
        }
        
        if (parameters.getProperties().getProxyDnsName() != null) {
            ((ObjectNode) propertiesValue).put("proxyDnsName", parameters.getProperties().getProxyDnsName());
        }
        
        ((ObjectNode) propertiesValue).put("useServerDefault", parameters.getProperties().isUseServerDefault());
        
        ((ObjectNode) propertiesValue).put("isBlockDirectAccessEnabled", parameters.getProperties().isBlockDirectAccessEnabled());
        
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, requestDoc);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/json");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            AzureOperationResponse result = null;
            result = new AzureOperationResponse();
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
