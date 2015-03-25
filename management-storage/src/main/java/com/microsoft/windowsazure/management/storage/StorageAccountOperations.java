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

package com.microsoft.windowsazure.management.storage;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.core.OperationStatusResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.storage.models.CheckNameAvailabilityResponse;
import com.microsoft.windowsazure.management.storage.models.StorageAccountCreateParameters;
import com.microsoft.windowsazure.management.storage.models.StorageAccountGetKeysResponse;
import com.microsoft.windowsazure.management.storage.models.StorageAccountGetResponse;
import com.microsoft.windowsazure.management.storage.models.StorageAccountListResponse;
import com.microsoft.windowsazure.management.storage.models.StorageAccountRegenerateKeysParameters;
import com.microsoft.windowsazure.management.storage.models.StorageAccountRegenerateKeysResponse;
import com.microsoft.windowsazure.management.storage.models.StorageAccountUpdateParameters;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* The Service Management API includes operations for managing the storage
* accounts beneath your subscription.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/ee460790.aspx for more
* information)
*/
public interface StorageAccountOperations {
    /**
    * The Begin Creating Storage Account operation creates a new storage
    * account in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264518.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Begin Creating
    * Storage Account operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    AzureOperationResponse beginCreating(StorageAccountCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * The Begin Creating Storage Account operation creates a new storage
    * account in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264518.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Begin Creating
    * Storage Account operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<AzureOperationResponse> beginCreatingAsync(StorageAccountCreateParameters parameters);
    
    /**
    * The Check Name Availability operation checks if a storage account name is
    * available for use in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154125.aspx for
    * more information)
    *
    * @param accountName Required. The desired storage account name to check
    * for availability.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response to a storage account check name availability request.
    */
    CheckNameAvailabilityResponse checkNameAvailability(String accountName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The Check Name Availability operation checks if a storage account name is
    * available for use in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154125.aspx for
    * more information)
    *
    * @param accountName Required. The desired storage account name to check
    * for availability.
    * @return The response to a storage account check name availability request.
    */
    Future<CheckNameAvailabilityResponse> checkNameAvailabilityAsync(String accountName);
    
    /**
    * The Create Storage Account operation creates a new storage account in
    * Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264518.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Create Storage
    * Account operation.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    OperationStatusResponse create(StorageAccountCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * The Create Storage Account operation creates a new storage account in
    * Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264518.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Create Storage
    * Account operation.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<OperationStatusResponse> createAsync(StorageAccountCreateParameters parameters);
    
    /**
    * The Delete Storage Account operation deletes the specified storage
    * account from Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264517.aspx for
    * more information)
    *
    * @param accountName Required. The name of the storage account to be
    * deleted.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    AzureOperationResponse delete(String accountName) throws IOException, ServiceException;
    
    /**
    * The Delete Storage Account operation deletes the specified storage
    * account from Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264517.aspx for
    * more information)
    *
    * @param accountName Required. The name of the storage account to be
    * deleted.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<AzureOperationResponse> deleteAsync(String accountName);
    
    /**
    * The Get Storage Account Properties operation returns system properties
    * for the specified storage account.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460802.aspx for
    * more information)
    *
    * @param accountName Required. Name of the storage account to get
    * properties for.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get Storage Account Properties operation response.
    */
    StorageAccountGetResponse get(String accountName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The Get Storage Account Properties operation returns system properties
    * for the specified storage account.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460802.aspx for
    * more information)
    *
    * @param accountName Required. Name of the storage account to get
    * properties for.
    * @return The Get Storage Account Properties operation response.
    */
    Future<StorageAccountGetResponse> getAsync(String accountName);
    
    /**
    * The Get Storage Keys operation returns the primary and secondary access
    * keys for the specified storage account.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460785.aspx for
    * more information)
    *
    * @param accountName Required. The name of the desired storage account.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The primary and secondary access keys for a storage account.
    */
    StorageAccountGetKeysResponse getKeys(String accountName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The Get Storage Keys operation returns the primary and secondary access
    * keys for the specified storage account.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460785.aspx for
    * more information)
    *
    * @param accountName Required. The name of the desired storage account.
    * @return The primary and secondary access keys for a storage account.
    */
    Future<StorageAccountGetKeysResponse> getKeysAsync(String accountName);
    
    /**
    * The List Storage Accounts operation lists the storage accounts available
    * under the current subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460787.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Storage Accounts operation response.
    */
    StorageAccountListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The List Storage Accounts operation lists the storage accounts available
    * under the current subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460787.aspx for
    * more information)
    *
    * @return The List Storage Accounts operation response.
    */
    Future<StorageAccountListResponse> listAsync();
    
    /**
    * The Regenerate Keys operation regenerates the primary or secondary access
    * key for the specified storage account.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460795.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Regenerate Keys
    * operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The primary and secondary access keys for a storage account.
    */
    StorageAccountRegenerateKeysResponse regenerateKeys(StorageAccountRegenerateKeysParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, URISyntaxException;
    
    /**
    * The Regenerate Keys operation regenerates the primary or secondary access
    * key for the specified storage account.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee460795.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Regenerate Keys
    * operation.
    * @return The primary and secondary access keys for a storage account.
    */
    Future<StorageAccountRegenerateKeysResponse> regenerateKeysAsync(StorageAccountRegenerateKeysParameters parameters);
    
    /**
    * The Update Storage Account operation updates the label and the
    * description, and enables or disables the geo-replication status for a
    * storage account in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264516.aspx for
    * more information)
    *
    * @param accountName Required. Name of the storage account to update.
    * @param parameters Required. Parameters supplied to the Update Storage
    * Account operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    AzureOperationResponse update(String accountName, StorageAccountUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * The Update Storage Account operation updates the label and the
    * description, and enables or disables the geo-replication status for a
    * storage account in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh264516.aspx for
    * more information)
    *
    * @param accountName Required. Name of the storage account to update.
    * @param parameters Required. Parameters supplied to the Update Storage
    * Account operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<AzureOperationResponse> updateAsync(String accountName, StorageAccountUpdateParameters parameters);
}
