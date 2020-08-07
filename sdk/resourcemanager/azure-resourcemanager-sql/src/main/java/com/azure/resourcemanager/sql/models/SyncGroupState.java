// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SyncGroupState. */
public final class SyncGroupState extends ExpandableStringEnum<SyncGroupState> {
    /** Static value NotReady for SyncGroupState. */
    public static final SyncGroupState NOT_READY = fromString("NotReady");

    /** Static value Error for SyncGroupState. */
    public static final SyncGroupState ERROR = fromString("Error");

    /** Static value Warning for SyncGroupState. */
    public static final SyncGroupState WARNING = fromString("Warning");

    /** Static value Progressing for SyncGroupState. */
    public static final SyncGroupState PROGRESSING = fromString("Progressing");

    /** Static value Good for SyncGroupState. */
    public static final SyncGroupState GOOD = fromString("Good");

    /**
     * Creates or finds a SyncGroupState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SyncGroupState.
     */
    @JsonCreator
    public static SyncGroupState fromString(String name) {
        return fromString(name, SyncGroupState.class);
    }

    /** @return known SyncGroupState values. */
    public static Collection<SyncGroupState> values() {
        return values(SyncGroupState.class);
    }
}