// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation Entity contract Properties. */
@Fluent
public final class OperationTagResourceContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationTagResourceContractProperties.class);

    /*
     * Identifier of the operation in form /operations/{operationId}.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Operation name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Api Name.
     */
    @JsonProperty(value = "apiName", access = JsonProperty.Access.WRITE_ONLY)
    private String apiName;

    /*
     * Api Revision.
     */
    @JsonProperty(value = "apiRevision", access = JsonProperty.Access.WRITE_ONLY)
    private String apiRevision;

    /*
     * Api Version.
     */
    @JsonProperty(value = "apiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String apiVersion;

    /*
     * Operation Description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST
     * but not limited by only them.
     */
    @JsonProperty(value = "method", access = JsonProperty.Access.WRITE_ONLY)
    private String method;

    /*
     * Relative URL template identifying the target resource for this
     * operation. May include parameters. Example:
     * /customers/{cid}/orders/{oid}/?date={date}
     */
    @JsonProperty(value = "urlTemplate", access = JsonProperty.Access.WRITE_ONLY)
    private String urlTemplate;

    /**
     * Get the id property: Identifier of the operation in form /operations/{operationId}.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Identifier of the operation in form /operations/{operationId}.
     *
     * @param id the id value to set.
     * @return the OperationTagResourceContractProperties object itself.
     */
    public OperationTagResourceContractProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the apiName property: Api Name.
     *
     * @return the apiName value.
     */
    public String apiName() {
        return this.apiName;
    }

    /**
     * Get the apiRevision property: Api Revision.
     *
     * @return the apiRevision value.
     */
    public String apiRevision() {
        return this.apiRevision;
    }

    /**
     * Get the apiVersion property: Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Get the description property: Operation Description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the method property: A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited
     * by only them.
     *
     * @return the method value.
     */
    public String method() {
        return this.method;
    }

    /**
     * Get the urlTemplate property: Relative URL template identifying the target resource for this operation. May
     * include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
     *
     * @return the urlTemplate value.
     */
    public String urlTemplate() {
        return this.urlTemplate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
