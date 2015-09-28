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

package com.google.android.gms.playlog.internal;

import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

import java.util.Date;

public class LogEvent extends AutoSafeParcelable {

    @SafeParceled(1)
    private int versionCode = 1;

    @SafeParceled(2)
    public final long eventTime;

    @SafeParceled(3)
    public final String tag;

    @SafeParceled(4)
    public final byte[] data;

    private LogEvent() {
        eventTime = -1;
        tag = null;
        data = null;
    }

    @Override
    public String toString() {
        return "LogEvent{" +
                "eventTime=" + new Date(eventTime) +
                ", tag='" + tag + '\'' +
                ", data=" + (data == null ? "null" : ('\'' + new String(data) + '\'')) +
                '}';
    }

    public static Creator<LogEvent> CREATOR = new AutoCreator<LogEvent>(LogEvent.class);
}
