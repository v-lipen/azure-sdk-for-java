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

package com.microsoft.windowsazure.management.scheduler.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.HashMap;

/**
* Information about a retrieved Cloud Service.
*/
public class CloudServiceGetResponse extends OperationResponse
{
    private String geoLocation;
    
    /**
    * The location associated with the cloud service.
    * @return The GeoLocation value.
    */
    public String getGeoLocation()
    {
        return this.geoLocation;
    }
    
    /**
    * The location associated with the cloud service.
    * @param geoLocationValue The GeoLocation value.
    */
    public void setGeoLocation(final String geoLocationValue)
    {
        this.geoLocation = geoLocationValue;
    }
    
    private ArrayList<CloudServiceGetResponse.Resource> resources;
    
    /**
    * A collection of resources.
    * @return The Resources value.
    */
    public ArrayList<CloudServiceGetResponse.Resource> getResources()
    {
        return this.resources;
    }
    
    /**
    * A collection of resources.
    * @param resourcesValue The Resources value.
    */
    public void setResources(final ArrayList<CloudServiceGetResponse.Resource> resourcesValue)
    {
        this.resources = resourcesValue;
    }
    
    /**
    * Initializes a new instance of the CloudServiceGetResponse class.
    *
    */
    public CloudServiceGetResponse()
    {
        super();
        this.resources = new ArrayList<CloudServiceGetResponse.Resource>();
    }
    
    /**
    * A resource.
    */
    public static class Resource
    {
        private String eTag;
        
        /**
        * ETag identifying the current entity revision on the server.
        * @return The ETag value.
        */
        public String getETag()
        {
            return this.eTag;
        }
        
        /**
        * ETag identifying the current entity revision on the server.
        * @param eTagValue The ETag value.
        */
        public void setETag(final String eTagValue)
        {
            this.eTag = eTagValue;
        }
        
        private String label;
        
        /**
        * Label of the resource.
        * @return The Label value.
        */
        public String getLabel()
        {
            return this.label;
        }
        
        /**
        * Label of the resource.
        * @param labelValue The Label value.
        */
        public void setLabel(final String labelValue)
        {
            this.label = labelValue;
        }
        
        private String name;
        
        /**
        * A name for the resource. The name must be unique within the
        * subscription ID and cloud service.
        * @return The Name value.
        */
        public String getName()
        {
            return this.name;
        }
        
        /**
        * A name for the resource. The name must be unique within the
        * subscription ID and cloud service.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue)
        {
            this.name = nameValue;
        }
        
        private HashMap<String, String> outputItems;
        
        /**
        * @return The OutputItems value.
        */
        public HashMap<String, String> getOutputItems()
        {
            return this.outputItems;
        }
        
        /**
        * @param outputItemsValue The OutputItems value.
        */
        public void setOutputItems(final HashMap<String, String> outputItemsValue)
        {
            this.outputItems = outputItemsValue;
        }
        
        private String plan;
        
        /**
        * The plan of the resource.
        * @return The Plan value.
        */
        public String getPlan()
        {
            return this.plan;
        }
        
        /**
        * The plan of the resource.
        * @param planValue The Plan value.
        */
        public void setPlan(final String planValue)
        {
            this.plan = planValue;
        }
        
        private String resourceProviderNamespace;
        
        /**
        * Namespace identifier for the resource provider.
        * @return The ResourceProviderNamespace value.
        */
        public String getResourceProviderNamespace()
        {
            return this.resourceProviderNamespace;
        }
        
        /**
        * Namespace identifier for the resource provider.
        * @param resourceProviderNamespaceValue The ResourceProviderNamespace
        * value.
        */
        public void setResourceProviderNamespace(final String resourceProviderNamespaceValue)
        {
            this.resourceProviderNamespace = resourceProviderNamespaceValue;
        }
        
        private String schemaVersion;
        
        /**
        * Optional version of the intrinsic properties for the resource. If not
        * specified, you must conform to the default contract resource.
        * @return The SchemaVersion value.
        */
        public String getSchemaVersion()
        {
            return this.schemaVersion;
        }
        
        /**
        * Optional version of the intrinsic properties for the resource. If not
        * specified, you must conform to the default contract resource.
        * @param schemaVersionValue The SchemaVersion value.
        */
        public void setSchemaVersion(final String schemaVersionValue)
        {
            this.schemaVersion = schemaVersionValue;
        }
        
        private String state;
        
        /**
        * The current resource status.
        * @return The State value.
        */
        public String getState()
        {
            return this.state;
        }
        
        /**
        * The current resource status.
        * @param stateValue The State value.
        */
        public void setState(final String stateValue)
        {
            this.state = stateValue;
        }
        
        private String subState;
        
        /**
        * An optional, more detailed resource status.
        * @return The SubState value.
        */
        public String getSubState()
        {
            return this.subState;
        }
        
        /**
        * An optional, more detailed resource status.
        * @param subStateValue The SubState value.
        */
        public void setSubState(final String subStateValue)
        {
            this.subState = subStateValue;
        }
        
        private String type;
        
        /**
        * The Type for the resource.
        * @return The Type value.
        */
        public String getType()
        {
            return this.type;
        }
        
        /**
        * The Type for the resource.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue)
        {
            this.type = typeValue;
        }
        
        /**
        * Initializes a new instance of the Resource class.
        *
        */
        public Resource()
        {
            this.outputItems = new HashMap<String, String>();
        }
    }
}
