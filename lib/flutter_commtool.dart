import 'dart:async';

import 'package:flutter/services.dart';

class FlutterCommtool {
  static const MethodChannel _channel = const MethodChannel('flutter_commtool');

  static Future<String> getString(String name) async {
    final String data = await _channel.invokeMethod('getString', name);
    return data;
  }

  static Future<Map<String, String>> getStrings(List<String> names) async {
    final Map<String, String> data =
        await _channel.invokeMethod('getStrings', names);
    return data;
  }

  static Future<dynamic> execute(name) async {
    final String data = await _channel.invokeMethod('execute', name);
    return data;
  }

  static Future<String> goWeb(String tag) async {
    final String data = await _channel.invokeMethod('goWeb', tag);
    return data;
  }

  static Future<String> goPage(String page) async {
    final String data = await _channel.invokeMethod('goPage', page);
    return data;
  }

  static Future<String> get(Map<String, String> map) async {
    final String data = await _channel.invokeMethod('get', map);
    return data;
  }

  static Future<String> post(Map<String, String> map) async {
    final String data = await _channel.invokeMethod('post', map);
    return data;
  }
}
