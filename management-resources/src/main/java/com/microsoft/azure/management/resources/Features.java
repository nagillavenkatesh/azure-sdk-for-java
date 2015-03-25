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

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.FeatureOperationsListResult;
import com.microsoft.azure.management.resources.models.FeatureResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.util.concurrent.Future;

/**
* Operations for managing preview features.
*/
public interface Features {
    /**
    * Get all features under the subscription.
    *
    * @param resourceProviderNamespace Required. Namespace of the resource
    * provider.
    * @param featureName Required. Previewed feature name in the resource
    * provider.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Previewed feature information.
    */
    FeatureResponse get(String resourceProviderNamespace, String featureName) throws IOException, ServiceException;
    
    /**
    * Get all features under the subscription.
    *
    * @param resourceProviderNamespace Required. Namespace of the resource
    * provider.
    * @param featureName Required. Previewed feature name in the resource
    * provider.
    * @return Previewed feature information.
    */
    Future<FeatureResponse> getAsync(String resourceProviderNamespace, String featureName);
    
    /**
    * Gets a list of previewed features of a resource provider.
    *
    * @param resourceProviderNamespace Required. The namespace of the resource
    * provider.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of previewed features.
    */
    FeatureOperationsListResult list(String resourceProviderNamespace) throws IOException, ServiceException;
    
    /**
    * Gets a list of previewed features of a resource provider.
    *
    * @param resourceProviderNamespace Required. The namespace of the resource
    * provider.
    * @return List of previewed features.
    */
    Future<FeatureOperationsListResult> listAsync(String resourceProviderNamespace);
    
    /**
    * Gets a list of previewed features for all the providers in the current
    * subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of previewed features.
    */
    FeatureOperationsListResult listAll() throws IOException, ServiceException;
    
    /**
    * Gets a list of previewed features for all the providers in the current
    * subscription.
    *
    * @return List of previewed features.
    */
    Future<FeatureOperationsListResult> listAllAsync();
    
    /**
    * Gets a list of previewed features of a subscription.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of previewed features.
    */
    FeatureOperationsListResult listAllNext(String nextLink) throws IOException, ServiceException;
    
    /**
    * Gets a list of previewed features of a subscription.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @return List of previewed features.
    */
    Future<FeatureOperationsListResult> listAllNextAsync(String nextLink);
    
    /**
    * Gets a list of previewed features of a resource provider.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of previewed features.
    */
    FeatureOperationsListResult listNext(String nextLink) throws IOException, ServiceException;
    
    /**
    * Gets a list of previewed features of a resource provider.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @return List of previewed features.
    */
    Future<FeatureOperationsListResult> listNextAsync(String nextLink);
    
    /**
    * Registers for a previewed feature of a resource provider.
    *
    * @param resourceProviderNamespace Required. Namespace of the resource
    * provider.
    * @param featureName Required. Previewed feature name in the resource
    * provider.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Previewed feature information.
    */
    FeatureResponse register(String resourceProviderNamespace, String featureName) throws IOException, ServiceException;
    
    /**
    * Registers for a previewed feature of a resource provider.
    *
    * @param resourceProviderNamespace Required. Namespace of the resource
    * provider.
    * @param featureName Required. Previewed feature name in the resource
    * provider.
    * @return Previewed feature information.
    */
    Future<FeatureResponse> registerAsync(String resourceProviderNamespace, String featureName);
}
