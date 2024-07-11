/*
 * Copyright (C) 2022 AOSPAPLUSOS
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.deviceinfo;

import android.content.Context;
import android.os.SystemProperties;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class AospaplusVersionPreferenceController extends BasePreferenceController {

    private static final String AOSPAPLUS_VERSION_PROP = "ro.aospaplus.version";
    private static final String AOSPAPLUS_BUILDTYPE_PROP = "ro.aospaplus.build_type";
    private static final String AOSPAPLUS_VARIANT_PROP = "ro.aospaplus.build_variant";

    private final Context mContext;

    public AospaplusVersionPreferenceController(Context context, String key) {
        super(context, key);
        mContext = context;
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE_UNSEARCHABLE;
    }

    @Override
    public CharSequence getSummary() {
        String version = SystemProperties.get(AOSPAPLUS_VERSION_PROP,
                mContext.getString(R.string.device_info_default));
        String buildType = SystemProperties.get(AOSPAPLUS_BUILDTYPE_PROP,
                mContext.getString(R.string.device_info_default));
        String variant = SystemProperties.get(AOSPAPLUS_VARIANT_PROP,
                mContext.getString(R.string.device_info_default));

        // Example: 14.0 | OFFICIAL | GAPPS
         StringBuilder sb = new StringBuilder(AospaplusVersionSettings.getVersion(mContext))
                .append(" | ")
                .append(AospaplusVersionSettings.getBuildType(mContext))
                .append(" | ")
                .append(AospaplusVersionSettings.getBuildVariant(mContext));

        return sb.toString();
    }
}