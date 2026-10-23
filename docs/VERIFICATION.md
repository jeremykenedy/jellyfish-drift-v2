# Verification

This document concerns the new, separately installed Jellyfish Drift V2 package. Prior filmed Jellyfish Drift 2.0 tests used a different Android package and signer; they establish source-video provenance and a reference architecture, not completion of this package's device gates.

## Candidate

- Package: `com.jeremykenedy.jellyfishdriftv2`.
- Version: 2.0.0, Android code 1.
- Effective settings: scene, playback speed, randomization.
- Original Jellyfish Drift data and selection remain independent.

## Checks

Local settings and installer tests, formatter, and full line/branch coverage for the pure options/validation classes pass (21 lines, 28 branches). The current signed artifact is SHA-256 `36670ddde785473a5b3bb699438947d5f556a467cb4fabfe90b5fc387fbced67`, 35,288,292 bytes. Its independent signing certificate is `48a625bc388ac96301a5d9b614e6c5e157a98f359b49a8495ab562622d01f85c`.

On October 22, 2026, the exact new-package candidate passed native three-value schema validation, actual D-pad scene/speed/randomization selection with provider readback, offline Credits scrolling and the actual Close button, Preview, and Back. Blue aquarium was recorded for 35 seconds and Deep ocean for 40 seconds at recorded speed, each spanning two editorial loops. These current recordings still require moving visual review; no physical performance figure is claimed. The classic package's six saved values remained unchanged throughout the V2 gate. All test baselines, including external file bytes, were persisted before changes and exact restoration completed without errors.

| Platform | Evidence |
| --- | --- |
| Android TV API 34 emulator, 1920 x 1080 | Current settings, credits, Preview, three-control selection, two-loop recordings, and package isolation passed; current captures in the [gallery](SCREENSHOTS.md) |
| Actual bound Dream on API 34 emulator | Not established: exported Somnambulator returned no current Dream; this production AVD does not permit root-only dream commands |
| Physical Fire TV | New-package gate pending |
| Physical Google TV | Untested; a volunteer with this device is needed |

Please report model, OS/API, resolution, tested behavior, and results through the repository's issue tracker when helping verify an untested device.

## Limits

The source recordings are 1080p, with 720p decoder fallback, not native 4K footage. Blue aquarium repeats every 16 seconds; Deep ocean repeats approximately every 19 seconds and includes a source camera-view transition. Editorial dissolves remain visible limitations. Sustained thermal behavior and vendor automatic idle activation are not established by a build or an emulator test. A successful functional gate does not imply owner visual acceptance.
