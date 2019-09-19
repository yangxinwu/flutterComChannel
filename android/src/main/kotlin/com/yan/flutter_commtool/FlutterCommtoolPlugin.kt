package com.yan.flutter_commtool

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterCommtoolPlugin : MethodCallHandler {

  companion object {
    @JvmField
    var iFlutterChannel: IFlutterChannel? = null

    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "flutter_commtool")
      channel.setMethodCallHandler(FlutterCommtoolPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (iFlutterChannel == null) {
      result.notImplemented()
      return
    }

    iFlutterChannel!!.onMethodCall(call, result)
  }
}
