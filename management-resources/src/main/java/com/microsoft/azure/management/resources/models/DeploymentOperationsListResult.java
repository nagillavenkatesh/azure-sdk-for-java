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

package com.microsoft.azure.management.resources.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* List of deployment operations.
*/
public class DeploymentOperationsListResult extends AzureOperationResponse {
    private String nextLink;
    
    /**
    * Optional. Gets or sets the URL to get the next set of results.
    * @return The NextLink value.
    */
    public String getNextLink() {
        return this.nextLink;
    }
    
    /**
    * Optional. Gets or sets the URL to get the next set of results.
    * @param nextLinkValue The NextLink value.
    */
    public void setNextLink(final String nextLinkValue) {
        this.nextLink = nextLinkValue;
    }
    
    private ArrayList<DeploymentOperation> operations;
    
    /**
    * Optional. Gets or sets the list of deployments.
    * @return The Operations value.
    */
    public ArrayList<DeploymentOperation> getOperations() {
        return this.operations;
    }
    
    /**
    * Optional. Gets or sets the list of deployments.
    * @param operationsValue The Operations value.
    */
    public void setOperations(final ArrayList<DeploymentOperation> operationsValue) {
        this.operations = operationsValue;
    }
    
    /**
    * Initializes a new instance of the DeploymentOperationsListResult class.
    *
    */
    public DeploymentOperationsListResult() {
        super();
        this.setOperations(new LazyArrayList<DeploymentOperation>());
    }
}
