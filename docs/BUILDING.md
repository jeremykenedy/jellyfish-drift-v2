# Building

## Requirements

- JDK 17 or later.
- Android SDK platform 36 and build-tools 36.0.0.
- `aapt2`, `javac`, `d8`, `zipalign`, `apksigner`, `keytool`, and OpenSSL.

Set `ANDROID_HOME` if the SDK is not at `~/Library/Android/sdk`. Then run:

```bash
bash build.sh
```

The APK and SHA-256 file are written to `build/`. The build requires the original signing key and password under `~/.android/`. It fails if either is missing rather than generating an incompatible replacement. Back up both files securely and never commit them. Set `JELLYFISH_V2_KEYSTORE` and `JELLYFISH_V2_KEYPASS` to use an existing protected key. CI explicitly creates disposable runner credentials; its APKs are validation artifacts, not production updates.

The new separate package defaults to `2.0.0` and Android code `2`. It uses its own protected Jellyfish Drift V2 signing key. Never use the original app signing key or package. See [release process](RELEASING.md).
