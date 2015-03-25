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

package com.microsoft.windowsazure.management.scheduler;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.scheduler.models.JobCollectionCheckNameAvailabilityResponse;
import com.microsoft.windowsazure.management.scheduler.models.JobCollectionCreateParameters;
import com.microsoft.windowsazure.management.scheduler.models.JobCollectionCreateResponse;
import com.microsoft.windowsazure.management.scheduler.models.JobCollectionGetResponse;
import com.microsoft.windowsazure.management.scheduler.models.JobCollectionUpdateParameters;
import com.microsoft.windowsazure.management.scheduler.models.JobCollectionUpdateResponse;
import com.microsoft.windowsazure.management.scheduler.models.SchedulerOperationStatusResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

public interface JobCollectionOperations {
    /**
    * Create a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * create.
    * @param parameters Required. Parameters supplied to the Create Job
    * Collection operation.
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
    * @return The Create Job Collection operation response.
    */
    JobCollectionCreateResponse beginCreating(String cloudServiceName, String jobCollectionName, JobCollectionCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Create a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * create.
    * @param parameters Required. Parameters supplied to the Create Job
    * Collection operation.
    * @return The Create Job Collection operation response.
    */
    Future<JobCollectionCreateResponse> beginCreatingAsync(String cloudServiceName, String jobCollectionName, JobCollectionCreateParameters parameters);
    
    /**
    * Deletes a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service.
    * @param jobCollectionName Required. The name of the job collection to
    * delete.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    AzureOperationResponse beginDeleting(String cloudServiceName, String jobCollectionName) throws IOException, ServiceException;
    
    /**
    * Deletes a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service.
    * @param jobCollectionName Required. The name of the job collection to
    * delete.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<AzureOperationResponse> beginDeletingAsync(String cloudServiceName, String jobCollectionName);
    
    /**
    * Update a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * update.
    * @param parameters Required. Parameters supplied to the Update Job
    * Collection operation.
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
    * @return The Update Job Collection operation response.
    */
    JobCollectionUpdateResponse beginUpdating(String cloudServiceName, String jobCollectionName, JobCollectionUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Update a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * update.
    * @param parameters Required. Parameters supplied to the Update Job
    * Collection operation.
    * @return The Update Job Collection operation response.
    */
    Future<JobCollectionUpdateResponse> beginUpdatingAsync(String cloudServiceName, String jobCollectionName, JobCollectionUpdateParameters parameters);
    
    /**
    * Determine if the JobCollection name is available to be used.
    * JobCollection names must be unique within a cloud-service.
    *
    * @param cloudServiceName Required. The name of the cloud service.
    * @param jobCollectionName Required. A name for the JobCollection. The name
    * must be unique as scoped within the CloudService.  The name can be up to
    * 100 characters in length.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The Check Name Availability operation response.
    */
    JobCollectionCheckNameAvailabilityResponse checkNameAvailability(String cloudServiceName, String jobCollectionName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Determine if the JobCollection name is available to be used.
    * JobCollection names must be unique within a cloud-service.
    *
    * @param cloudServiceName Required. The name of the cloud service.
    * @param jobCollectionName Required. A name for the JobCollection. The name
    * must be unique as scoped within the CloudService.  The name can be up to
    * 100 characters in length.
    * @return The Check Name Availability operation response.
    */
    Future<JobCollectionCheckNameAvailabilityResponse> checkNameAvailabilityAsync(String cloudServiceName, String jobCollectionName);
    
    /**
    * Create a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * create.
    * @param parameters Required. Parameters supplied to the Create Job
    * Collection operation.
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
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    SchedulerOperationStatusResponse create(String cloudServiceName, String jobCollectionName, JobCollectionCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Create a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * create.
    * @param parameters Required. Parameters supplied to the Create Job
    * Collection operation.
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
    Future<SchedulerOperationStatusResponse> createAsync(String cloudServiceName, String jobCollectionName, JobCollectionCreateParameters parameters);
    
    /**
    * Deletes a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service.
    * @param jobCollectionName Required. The name of the job collection to
    * delete.
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
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    SchedulerOperationStatusResponse delete(String cloudServiceName, String jobCollectionName) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Deletes a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service.
    * @param jobCollectionName Required. The name of the job collection to
    * delete.
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
    Future<SchedulerOperationStatusResponse> deleteAsync(String cloudServiceName, String jobCollectionName);
    
    /**
    * Retreive a job collection.
    *
    * @param cloudServiceName Required. Name of the cloud service.
    * @param jobCollectionName Required. Name of the job collection.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The Get Job Collection operation response.
    */
    JobCollectionGetResponse get(String cloudServiceName, String jobCollectionName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Retreive a job collection.
    *
    * @param cloudServiceName Required. Name of the cloud service.
    * @param jobCollectionName Required. Name of the job collection.
    * @return The Get Job Collection operation response.
    */
    Future<JobCollectionGetResponse> getAsync(String cloudServiceName, String jobCollectionName);
    
    /**
    * Update a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * update.
    * @param parameters Required. Parameters supplied to the Update Job
    * Collection operation.
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
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    SchedulerOperationStatusResponse update(String cloudServiceName, String jobCollectionName, JobCollectionUpdateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Update a job collection.
    *
    * @param cloudServiceName Required. The name of the cloud service
    * containing the job collection.
    * @param jobCollectionName Required. The name of the job collection to
    * update.
    * @param parameters Required. Parameters supplied to the Update Job
    * Collection operation.
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
    Future<SchedulerOperationStatusResponse> updateAsync(String cloudServiceName, String jobCollectionName, JobCollectionUpdateParameters parameters);
}
