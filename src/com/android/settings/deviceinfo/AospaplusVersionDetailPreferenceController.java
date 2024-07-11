/*
 * Copyright (C) 2022 ReloadedOS
 * Copyright (C) 2024 Aospa Plus
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.deviceinfo;

import android.content.Context;

import com.android.settings.deviceinfo.firmwareversion.FirmwareVersionDetailPreferenceController;

public class AospaplusVersionDetailPreferenceController
        extends FirmwareVersionDetailPreferenceController {

    private static final String TAG = "AospaplusVersionDetailCtrl";

    public AospaplusVersionDetailPreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    public CharSequence getSummary() {
        return null;
    }
}