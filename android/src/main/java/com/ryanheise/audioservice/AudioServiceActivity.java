package com.ryanheise.audioservice;

import android.content.Context;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.android.FlutterFragmentActivity;

public class AudioServiceActivity extends FlutterFragmentActivity {
    @Override
    public FlutterEngine provideFlutterEngine(Context context) {
        return AudioServicePlugin.getFlutterEngine(context);
    }
}
