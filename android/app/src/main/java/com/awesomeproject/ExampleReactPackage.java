package com.awesomeproject;

import android.util.Log;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 80107442 on 2018/3/22.
 */

public class ExampleReactPackage implements ReactPackage {
    private static final String TAG = "ExampleReactPackage";
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        Log.d(TAG, "createNativeModules() called with: reactContext = [" + reactContext + "]");
        return Arrays.<NativeModule>asList(
                new ToastExample(reactContext)
        );
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        Log.d(TAG, "createViewManagers() called with: reactContext = [" + reactContext + "]");
        return Collections.emptyList();
    }
}
