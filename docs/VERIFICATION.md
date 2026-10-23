# Verification

The current Jellyfish Drift V2 candidate is 2.0.0, Android code 2. Its signed APK SHA-256 is `90697388e2719412136ecf9ee0859f9245a17fb22188e9cfeb14d685a9e5b2ed`, 35,292,388 bytes. Package identities and signing keys remain separate between classic and V2.

## Current checks

Local settings/installer tests, formatter, privacy checks, and 100% line/branch coverage of the actual pure options and validation sources pass. Android rendering and framework lifecycle are verified separately on native platforms.

On October 22, 2026, the exact code 2 signed candidate passed a same-signer API 34 emulator update retaining all 3 previous raw settings and adding `show_clock=false`. Its schema/settings cursors expose 4 values. Actual D-pad interaction enabled and disabled Show clock. Both explicit choices remained unchanged while randomize-all was enabled. Current Preview captures visibly show time only when enabled, with a small real position change across 20 seconds. Settings, scrollable offline Credits, the actual Close button, Preview, and Back passed. All baselines, including external file bytes and absent markers, were persisted before mutation. Cleanup restored the previous raw values and surrounding state exactly; the new default-off clock row is intentionally retained.

| Platform | Current evidence |
| --- | --- |
| Android TV API 34 emulator, 1920 x 1080 | Current update, legacy retention, 4-row schema, D-pad clock on/off, randomization independence, 20-second drift pair, Settings/Credits/Close/Preview/Back passed |
| Actual bound Dream on API 34 emulator | Not established: the production AVD does not allow root-only dream commands and exported Somnambulator did not bind a Dream in prior tests |
| Physical Fire TV | Current code 2 Dream, decoder/rendering and presentation gate pending |
| Physical Google TV | Untested; a volunteer with this device is needed |

Please report model, OS/API, resolution, tested behavior, and results through the repository's issue tracker when helping verify an untested device. Current [screenshots and provenance](SCREENSHOTS.md) identify the exact candidate. No physical performance or owner visual-acceptance claim is made.

## Earlier reference evidence

Earlier separate-package code 1 passed native scene/speed/randomization controls and recorded Blue aquarium for 35 seconds and Deep ocean for 40 seconds, spanning two edited loops. Its source-media/player evidence remains a clock-off reference, not proof of the current clock overlay's physical behavior. Original-package filmed v2 measurements are not claimed for this separate package.

## Media limits

Source recordings are 1080p with a 720p decoder fallback, not native 4K footage. Blue aquarium repeats every 16 seconds; Deep ocean approximately every 19 seconds and includes a source camera transition. Editorial dissolves and source artifacts remain limitations. Sustained thermal behavior and automatic idle activation across vendors are unverified.
