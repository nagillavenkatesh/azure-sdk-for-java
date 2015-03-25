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

package com.microsoft.windowsazure.management.models;

/**
* Parameters supplied to the Update Affinity Group operation.
*/
public class AffinityGroupUpdateParameters {
    private String description;
    
    /**
    * Optional. A description for the affinity group. The description can be up
    * to 1024 characters in length.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. A description for the affinity group. The description can be up
    * to 1024 characters in length.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private String label;
    
    /**
    * Required. A name for the affinity specified as a base-64-encoded string.
    * The label can be up to 100 characters in length.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Required. A name for the affinity specified as a base-64-encoded string.
    * The label can be up to 100 characters in length.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    /**
    * Initializes a new instance of the AffinityGroupUpdateParameters class.
    *
    */
    public AffinityGroupUpdateParameters() {
    }
    
    /**
    * Initializes a new instance of the AffinityGroupUpdateParameters class
    * with required arguments.
    *
    * @param label A name for the affinity specified as a base-64-encoded
    * string. The label can be up to 100 characters in length.
    */
    public AffinityGroupUpdateParameters(String label) {
        if (label == null) {
            throw new NullPointerException("label");
        }
        this.setLabel(label);
    }
}
