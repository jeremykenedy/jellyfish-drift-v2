# Architecture

The separate `com.jeremykenedy.jellyfishdriftv2` package owns its launcher settings, Preview activity, DreamService, three-value settings provider, assets, and signing identity. It does not access the original Jellyfish Drift package.

Preview and Dream use the same SurfaceView/MediaPlayer player. A centered 16:9 layout preserves source proportions. Bundled silent 1080p H264 recordings have a 720p fallback. Generation checks prevent callbacks from a released player from restarting it. Pause, surface destruction, and Dream detachment release playback resources. Normal task resume restores the saved position.

Only scene, speed, and randomization are resolved by the pure options classes. Native settings include full offline source notices and licenses. Credits and failure messages remain outside the screensaver image. No runtime network permission, content download, telemetry, or external framework dependency is used.
