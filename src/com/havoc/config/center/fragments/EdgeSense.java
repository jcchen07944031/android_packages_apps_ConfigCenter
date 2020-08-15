/*
 * Copyright (C) 2016 The CyanogenMod Project
 *               2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.havoc.config.center.fragments;

import android.os.Bundle;
import android.util.Log;

import com.android.settings.SettingsPreferenceFragment;
import com.havoc.config.center.widget.SeekBarPreference;

public class EdgeSenseSettingsFragment extends SettingsPreferenceFragment {
public static final String TAG = "GESTURESETTINGS";
    private static final String SEEKBAR_PREFERENCE  = "squeeze_force";
    private SeekBarPreference mSeekBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        addPreferencesFromResource(R.xml.config_center_edge_sense);
    }
}
