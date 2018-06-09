package com.awesomeproject;

import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

/**
 * native modules,used to js access
 */
@ReactModule(name = "ToastExample")
public class ToastExample extends ReactContextBaseJavaModule {
    private static final String TAG = "ToastExample";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    public ToastExample(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        Log.d(TAG, "getName() called");
        return TAG;
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        Log.d(TAG, "getConstants() called");
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        return constants;
    }

    @ReactMethod
    public void show(String message, int duration) {
        Log.d(TAG, "show() called with: message = [" + message + "], duration = [" + duration + "]");
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }
}
