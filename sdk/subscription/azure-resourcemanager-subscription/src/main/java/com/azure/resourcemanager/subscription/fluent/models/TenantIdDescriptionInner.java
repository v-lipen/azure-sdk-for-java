// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tenant Id information. */
@Immutable
public final class TenantIdDescriptionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantIdDescriptionInner.class);

    /*
     * The fully qualified ID of the tenant. For example,
     * /tenants/00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the id property: The fully qualified ID of the tenant. For example,
     * /tenants/00000000-0000-0000-0000-000000000000.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tenantId property: The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
