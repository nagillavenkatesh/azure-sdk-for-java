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

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;
import java.util.Calendar;

/**
* Deployment properties with additional details.
*/
public class DeploymentPropertiesExtended extends DeploymentProperties {
    private String correlationId;
    
    /**
    * Optional. Gets or sets the correlation ID of the deployment.
    * @return The CorrelationId value.
    */
    public String getCorrelationId() {
        return this.correlationId;
    }
    
    /**
    * Optional. Gets or sets the correlation ID of the deployment.
    * @param correlationIdValue The CorrelationId value.
    */
    public void setCorrelationId(final String correlationIdValue) {
        this.correlationId = correlationIdValue;
    }
    
    private ArrayList<Dependency> dependencies;
    
    /**
    * Optional. Gets the list of deployment dependencies.
    * @return The Dependencies value.
    */
    public ArrayList<Dependency> getDependencies() {
        return this.dependencies;
    }
    
    /**
    * Optional. Gets the list of deployment dependencies.
    * @param dependenciesValue The Dependencies value.
    */
    public void setDependencies(final ArrayList<Dependency> dependenciesValue) {
        this.dependencies = dependenciesValue;
    }
    
    private String outputs;
    
    /**
    * Optional. Gets or sets key/value pairs that represent deploymentoutput.
    * @return The Outputs value.
    */
    public String getOutputs() {
        return this.outputs;
    }
    
    /**
    * Optional. Gets or sets key/value pairs that represent deploymentoutput.
    * @param outputsValue The Outputs value.
    */
    public void setOutputs(final String outputsValue) {
        this.outputs = outputsValue;
    }
    
    private ArrayList<Provider> providers;
    
    /**
    * Optional. Gets the list of resource providers needed for the deployment.
    * @return The Providers value.
    */
    public ArrayList<Provider> getProviders() {
        return this.providers;
    }
    
    /**
    * Optional. Gets the list of resource providers needed for the deployment.
    * @param providersValue The Providers value.
    */
    public void setProviders(final ArrayList<Provider> providersValue) {
        this.providers = providersValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets the state of the provisioning.
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets the state of the provisioning.
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private Calendar timestamp;
    
    /**
    * Optional. Gets or sets the timestamp of the template deployment.
    * @return The Timestamp value.
    */
    public Calendar getTimestamp() {
        return this.timestamp;
    }
    
    /**
    * Optional. Gets or sets the timestamp of the template deployment.
    * @param timestampValue The Timestamp value.
    */
    public void setTimestamp(final Calendar timestampValue) {
        this.timestamp = timestampValue;
    }
    
    /**
    * Initializes a new instance of the DeploymentPropertiesExtended class.
    *
    */
    public DeploymentPropertiesExtended() {
        super();
        this.setDependencies(new LazyArrayList<Dependency>());
        this.setProviders(new LazyArrayList<Provider>());
    }
}
