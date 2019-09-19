package com.yan.flutter_commtool_example

import android.os.Bundle
import com.yan.flutter_commtool.FlutterCommtoolPlugin
import com.yan.flutter_commtool.IFlutterChannel

import io.flutter.app.FlutterActivity
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity : FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    FlutterCommtoolPlugin.iFlutterChannel = object : IFlutterChannel {
      override fun onMethodCall(call: MethodCall, result: Result) {
         window.decorView.postDelayed({
           result.success(call.arguments)
         },2000)
      }
    }
    GeneratedPluginRegistrant.registerWith(this)
  }
}
