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

package com.microsoft.windowsazure.management.storage.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import java.net.URI;

/**
* The primary and secondary access keys for a storage account.
*/
public class StorageAccountGetKeysResponse extends AzureOperationResponse {
    private String primaryKey;
    
    /**
    * Optional. The primary access key for the storage account.
    * @return The PrimaryKey value.
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    
    /**
    * Optional. The primary access key for the storage account.
    * @param primaryKeyValue The PrimaryKey value.
    */
    public void setPrimaryKey(final String primaryKeyValue) {
        this.primaryKey = primaryKeyValue;
    }
    
    private String secondaryKey;
    
    /**
    * Optional. The secondary access key for the storage account.
    * @return The SecondaryKey value.
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }
    
    /**
    * Optional. The secondary access key for the storage account.
    * @param secondaryKeyValue The SecondaryKey value.
    */
    public void setSecondaryKey(final String secondaryKeyValue) {
        this.secondaryKey = secondaryKeyValue;
    }
    
    private URI uri;
    
    /**
    * Optional. The Service Management API request URI used to perform Get
    * Storage Account Properties requests against the storage account.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Optional. The Service Management API request URI used to perform Get
    * Storage Account Properties requests against the storage account.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
}
