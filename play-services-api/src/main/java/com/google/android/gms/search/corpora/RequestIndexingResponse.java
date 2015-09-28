/*
 * Copyright 2013-2015 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.search.corpora;

import com.google.android.gms.common.api.Status;

import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

public class RequestIndexingResponse extends AutoSafeParcelable {

    @SafeParceled(1000)
    private int versionCode;

    @SafeParceled(1)
    public final Status status;

    @SafeParceled(2)
    public final boolean scheduledIndexing;

    private RequestIndexingResponse() {
        status = null;
        scheduledIndexing = false;
    }

    public RequestIndexingResponse(Status status, boolean scheduledIndexing) {
        this.status = status;
        this.scheduledIndexing = scheduledIndexing;
    }

    public static Creator<RequestIndexingResponse> CREATOR = new AutoCreator<RequestIndexingResponse>(RequestIndexingResponse.class);
}
