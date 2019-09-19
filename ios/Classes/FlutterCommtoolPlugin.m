#import "FlutterCommtoolPlugin.h"
#import <flutter_commtool/flutter_commtool-Swift.h>

@implementation FlutterCommtoolPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterCommtoolPlugin registerWithRegistrar:registrar];
}
@end
