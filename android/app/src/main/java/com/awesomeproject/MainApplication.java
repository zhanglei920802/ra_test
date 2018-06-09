package com.awesomeproject;

import android.app.Application;
import android.util.Log;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
  private static final String TAG = "MyApplication";
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      Log.d(TAG, "getPackages() called");
      return Arrays.asList(
              new MainReactPackage(),
              new ExampleReactPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      Log.d(TAG, "getJSMainModuleName() called");
      return "index";
    }
  };


  @Override
  public ReactNativeHost getReactNativeHost() {
    Log.d(TAG, "getReactNativeHost() called");
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
    Log.d(TAG, "onCreate() called");
  }
}
