# Host integration

Jellyfish Drift V2 is an additional app. Keep classic Jellyfish Drift registered separately, including its preferences and current selection. Do not replace its catalog entry or reuse its preview hash.

| Field | Value |
| --- | --- |
| Saver ID | `jellyfish-drift-v2` |
| Repository | `jeremykenedy/jellyfish-drift-v2` |
| Display name | Jellyfish Drift V2 |
| Package | `com.jeremykenedy.jellyfishdriftv2` |
| Dream | `com.jeremykenedy.jellyfishdriftv2/.JellyfishDreamService` |
| Settings | `com.jeremykenedy.jellyfishdriftv2/.SettingsActivity` |
| Preview | `com.jeremykenedy.jellyfishdriftv2/.PreviewActivity` |
| Assets | `jellyfish-drift-v2.apk`, `jellyfish-drift-v2.apk.sha256` |
| Provider | `com.jeremykenedy.jellyfishdriftv2.settings` |
| First version | 2.0.0, Android code 2 |

Both `/schema` and `/settings` expose exactly four effective keys: `background`, `motion`, `randomize_all`, and `show_clock`. See [configuration](CONFIGURATION.md). No density, species, or rays editor applies to this filmed app.

Install from verified public release metadata only. No release is verified by this candidate document. After publication, verify actual download bytes, SHA-256, sidecar, package, and the new unique signing certificate before pinning. Use actual captures from this package for previews, with source attribution. Blue aquarium derivatives are CC BY-SA 4.0, credited to Eric Polk; Deep ocean derivatives use the credited NOAA public-domain source. Preserve media notices in host distributions.

The optional `show_clock` boolean defaults to false and has `randomAllowed=false`. It is independent of scene randomization and must not be overwritten by a host randomize-all operation. The settings provider exposes four rows, retaining the three filmed-scene keys.
