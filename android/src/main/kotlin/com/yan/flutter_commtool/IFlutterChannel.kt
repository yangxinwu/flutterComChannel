package com.yan.flutter_commtool

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel.Result

interface IFlutterChannel {
  fun onMethodCall(call: MethodCall, result: Result) 
}