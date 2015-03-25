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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;

/**
* The Virtual Machine Template Capture Role operation response.
*/
public class VirtualMachineCaptureVMImageParameters extends AzureOperationResponse {
    private String operationType;
    
    /**
    * Optional. Required. Must be set to CaptureRoleOperation.
    * @return The OperationType value.
    */
    public String getOperationType() {
        return this.operationType;
    }
    
    /**
    * Optional. Required. Must be set to CaptureRoleOperation.
    * @param operationTypeValue The OperationType value.
    */
    public void setOperationType(final String operationTypeValue) {
        this.operationType = operationTypeValue;
    }
    
    private String oSState;
    
    /**
    * Optional. Required. The OS state: Generalized | Specialized.
    * @return The OSState value.
    */
    public String getOSState() {
        return this.oSState;
    }
    
    /**
    * Optional. Required. The OS state: Generalized | Specialized.
    * @param oSStateValue The OSState value.
    */
    public void setOSState(final String oSStateValue) {
        this.oSState = oSStateValue;
    }
    
    private String vMImageLabel;
    
    /**
    * Optional. Required. The VM Template Label.
    * @return The VMImageLabel value.
    */
    public String getVMImageLabel() {
        return this.vMImageLabel;
    }
    
    /**
    * Optional. Required. The VM Template Label.
    * @param vMImageLabelValue The VMImageLabel value.
    */
    public void setVMImageLabel(final String vMImageLabelValue) {
        this.vMImageLabel = vMImageLabelValue;
    }
    
    private String vMImageName;
    
    /**
    * Optional. Required. The VM Template Name.
    * @return The VMImageName value.
    */
    public String getVMImageName() {
        return this.vMImageName;
    }
    
    /**
    * Optional. Required. The VM Template Name.
    * @param vMImageNameValue The VMImageName value.
    */
    public void setVMImageName(final String vMImageNameValue) {
        this.vMImageName = vMImageNameValue;
    }
}
