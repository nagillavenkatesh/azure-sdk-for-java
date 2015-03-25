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

package com.microsoft.windowsazure.management.mediaservices.models;

import com.microsoft.windowsazure.core.AzureOperationResponse;
import com.microsoft.windowsazure.core.LazyArrayList;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Media Accounts operation response.
*/
public class MediaServicesAccountListResponse extends AzureOperationResponse implements Iterable<MediaServicesAccountListResponse.MediaServiceAccount> {
    private ArrayList<MediaServicesAccountListResponse.MediaServiceAccount> accounts;
    
    /**
    * Optional.
    * @return The Accounts value.
    */
    public ArrayList<MediaServicesAccountListResponse.MediaServiceAccount> getAccounts() {
        return this.accounts;
    }
    
    /**
    * Optional.
    * @param accountsValue The Accounts value.
    */
    public void setAccounts(final ArrayList<MediaServicesAccountListResponse.MediaServiceAccount> accountsValue) {
        this.accounts = accountsValue;
    }
    
    /**
    * Initializes a new instance of the MediaServicesAccountListResponse class.
    *
    */
    public MediaServicesAccountListResponse() {
        super();
        this.setAccounts(new LazyArrayList<MediaServicesAccountListResponse.MediaServiceAccount>());
    }
    
    /**
    * Gets the sequence of Accounts.
    *
    */
    public Iterator<MediaServicesAccountListResponse.MediaServiceAccount> iterator() {
        return this.getAccounts().iterator();
    }
    
    /**
    * A Media Services account associated with your subscription.
    */
    public static class MediaServiceAccount {
        private String accountId;
        
        /**
        * Optional. The Id of the Media Services Account.
        * @return The AccountId value.
        */
        public String getAccountId() {
            return this.accountId;
        }
        
        /**
        * Optional. The Id of the Media Services Account.
        * @param accountIdValue The AccountId value.
        */
        public void setAccountId(final String accountIdValue) {
            this.accountId = accountIdValue;
        }
        
        private String name;
        
        /**
        * Optional. The Name of the Media Services Account.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The Name of the Media Services Account.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private URI parentUri;
        
        /**
        * Optional. The ParentLink of the Media Services Account.
        * @return The ParentUri value.
        */
        public URI getParentUri() {
            return this.parentUri;
        }
        
        /**
        * Optional. The ParentLink of the Media Services Account.
        * @param parentUriValue The ParentUri value.
        */
        public void setParentUri(final URI parentUriValue) {
            this.parentUri = parentUriValue;
        }
        
        private String state;
        
        /**
        * Optional. The current state of the Media Services Account.
        * @return The State value.
        */
        public String getState() {
            return this.state;
        }
        
        /**
        * Optional. The current state of the Media Services Account.
        * @param stateValue The State value.
        */
        public void setState(final String stateValue) {
            this.state = stateValue;
        }
        
        private String type;
        
        /**
        * Optional. The type of the Media Services Account.
        * @return The Type value.
        */
        public String getType() {
            return this.type;
        }
        
        /**
        * Optional. The type of the Media Services Account.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue) {
            this.type = typeValue;
        }
        
        private URI uri;
        
        /**
        * Optional. The SelfLink of the Media Services Account.
        * @return The Uri value.
        */
        public URI getUri() {
            return this.uri;
        }
        
        /**
        * Optional. The SelfLink of the Media Services Account.
        * @param uriValue The Uri value.
        */
        public void setUri(final URI uriValue) {
            this.uri = uriValue;
        }
    }
}
