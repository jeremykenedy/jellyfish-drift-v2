<p align="center">
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2#gh-light-mode-only"><picture><source media="(max-width: 600px) and (prefers-reduced-motion: reduce)" srcset="art/banner-mobile-still-light.4f5811f47e78.svg"><source media="(prefers-reduced-motion: reduce)" srcset="art/banner-still-light.d6e9508885f0.svg"><source media="(max-width: 600px)" srcset="art/banner-mobile-light.a5d9a59b1f02.svg"><img src="art/banner-light.f7fd060ab37a.svg#gh-light-mode-only" alt="Jellyfish Drift V2" width="800"></picture></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2#gh-dark-mode-only"><picture><source media="(max-width: 600px) and (prefers-reduced-motion: reduce)" srcset="art/banner-mobile-still-dark.3db224f91f88.svg"><source media="(prefers-reduced-motion: reduce)" srcset="art/banner-still-dark.018a7f579f32.svg"><source media="(max-width: 600px)" srcset="art/banner-mobile-dark.300c770a4cd4.svg"><img src="art/banner-dark.f41ee5699738.svg#gh-dark-mode-only" alt="Jellyfish Drift V2" width="800"></picture></a>
</p>

<p align="center">Real filmed jellyfish scenes for compatible TV screensavers, played entirely offline.</p>

<p align="center">
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2/releases"><img src="https://img.shields.io/github/downloads/jeremykenedy/jellyfish-drift-v2/total" alt="GitHub release downloads"></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2/releases"><img src="https://img.shields.io/github/v/release/jeremykenedy/jellyfish-drift-v2?label=latest%20release" alt="Latest release"></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/ci.yml"><img src="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/ci.yml/badge.svg" alt="Build and tests"></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/style.yml"><img src="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/style.yml/badge.svg" alt="Code style"></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/docs.yml"><img src="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/docs.yml/badge.svg" alt="Documentation"></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/security.yml"><img src="https://github.com/jeremykenedy/jellyfish-drift-v2/actions/workflows/security.yml/badge.svg" alt="Security checks"></a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-Apache--2.0-blue.svg" alt="Application code: Apache-2.0"></a>
</p>
<p align="center">
  <a href="https://github.com/jeremykenedy"><img src="https://img.shields.io/github/followers/jeremykenedy?label=Follow&style=social" alt="Follow Jeremy Kenedy"></a>
  <a href="https://github.com/jeremykenedy/jellyfish-drift-v2"><img src="https://img.shields.io/github/stars/jeremykenedy/jellyfish-drift-v2?label=Star&style=social" alt="Star Jellyfish Drift V2"></a>
  <a href="https://github.com/sponsors/jeremykenedy"><img src="https://img.shields.io/badge/Sponsor-jeremykenedy-EA4AAA?logo=githubsponsors&logoColor=white" alt="Sponsor Jeremy Kenedy"></a>
</p>

Jellyfish Drift V2 is a separate filmed app. It can be installed beside [classic Jellyfish Drift](https://github.com/jeremykenedy/jellyfish-drift), with independent settings and a distinct signing key. See the [verification record](docs/VERIFICATION.md) for current test evidence and limits.

If you enjoy Jellyfish Drift V2, show your support by starring the repository.

## Table of contents

- [Privacy](#privacy)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Fire TV Toolkit](#fire-tv-toolkit)
- [Configuration](#configuration)
- [Screenshots](#screenshots)
- [Building and testing](#building-and-testing)
- [Documentation](#documentation)
- [License](#license)

## Privacy

Playback uses bundled files, with no network permission, advertisements, analytics, or tracking. The optional command-line installer contacts GitHub to download published release files and verify their checksum.

## Features

| Feature | What it does | Details |
| --- | --- | --- |
| Real recordings | Blue aquarium Aurelia and Deep ocean Crossota scenes | [Scenes and limitations](docs/CONFIGURATION.md) |
| Playback controls | 0.9x, recorded speed, 1.25x, or random scene and speed | [Settings](docs/CONFIGURATION.md) |
| Offline playback | Silent 1080p H264 with a 720p fallback | [Architecture](docs/ARCHITECTURE.md) |
| Native TV settings | Remote controls, Preview, and offline licenses | [Current gallery](docs/SCREENSHOTS.md) |
| DreamService | The same scene player in Preview and the Android screensaver service | [Verified behavior](docs/VERIFICATION.md) |

The recordings repeat every 16 or approximately 19 seconds, with editorial dissolves. Animal count, species, lighting, and camera movement come from each recording. Density, species, and light-ray controls are not provided because the animals and lighting come from the recordings.

## Requirements

- Android 6.0 (API 23) or later on a compatible TV device.
- A system or host application that supports Android DreamService screensavers.
- ADB access from a computer when sideloading.

Physical Google TV support, sustained thermal behavior, and native 4K source detail are not established. See [platform evidence](docs/VERIFICATION.md).

## Installation

For the **published release**, connect the TV with ADB and run:

```bash
python3 install.py --serial TV_IP:5555
```

The installer verifies the downloaded APK against its release checksum and updates the existing package. It does not automatically select a screensaver. See [installation and removal](docs/INSTALLATION.md).

## Fire TV Toolkit

[Fire TV Toolkit](https://github.com/jeremykenedy/fire-tv-toolkit) provides guided TV setup and screensaver management. Set up its CLI first:

```bash
git clone https://github.com/jeremykenedy/fire-tv-toolkit.git
cd fire-tv-toolkit
node setup.js
```

Use these commands for the published Jellyfish Drift V2 release:

```bash
# Install
firetv-screensavers --install=jellyfish-drift-v2 --yes
# Select separately
screensaver --set=jellyfish-drift-v2
# Update the installed package
firetv-screensavers --install=jellyfish-drift-v2 --yes
# Remove the app and its saved preferences
firetv-screensavers --uninstall=jellyfish-drift-v2 --force
```

Toolkit also manages launcher choices, sleep/screensaver timers, and supported settings protection. Installation does not select a screensaver. Configure filmed scenes in Jellyfish Drift V2's native settings; see the [integration contract](docs/INTEGRATION.md).

## Configuration

Open Jellyfish Drift V2 from the TV launcher to choose a recording or playback speed, watch Preview, or read Credits and licenses. Changes apply when the next view starts. [Configuration](docs/CONFIGURATION.md) documents all three effective controls and its separate three-value settings provider.

## Screenshots

<table>
<tr><td width="33%"><img src="art/screenshots/v2-blue-preview.png" alt="Blue aquarium, recorded playback speed"><br>Blue aquarium, recorded playback speed</td><td width="33%"><img src="art/screenshots/v2-deep-preview.png" alt="Deep ocean, recorded playback speed"><br>Deep ocean, recorded playback speed</td><td width="33%"><img src="art/screenshots/v2-settings.png" alt="Three effective filmed controls"><br>Three effective filmed controls</td></tr>
</table>

Current native emulator captures. See the [full gallery and provenance](docs/SCREENSHOTS.md). Physical device and bound Dream gates for this split package remain pending.

## Building and testing

```bash
bash build.sh
bash test.sh
bash scripts/test-python-coverage.sh
bash scripts/test-coverage.sh
```

The build requires Android SDK platform 36, build-tools 36.0.0, JDK 17 or later, and the original protected signing key. It does not silently generate a replacement production key. See [building](docs/BUILDING.md) and [testing](docs/TESTING.md).

## Documentation

- [Configuration and migration](docs/CONFIGURATION.md)
- [Host integration contract](docs/INTEGRATION.md)
- [Screenshots](docs/SCREENSHOTS.md)
- [Installation, update, and removal](docs/INSTALLATION.md)
- [Building from source](docs/BUILDING.md)
- [Architecture](docs/ARCHITECTURE.md)
- [Testing and coverage](docs/TESTING.md)
- [Device verification](docs/VERIFICATION.md)
- [CI](docs/CI.md)
- [Troubleshooting](docs/TROUBLESHOOTING.md)
- [Release process](docs/RELEASING.md)
- [Version 2.0.0 upgrade guide](docs/releases/v2.0.0.md)

## License

Application code is licensed under the [Apache License, Version 2.0](LICENSE). Filmed media uses separate source terms: Aurelia footage and derived images are CC BY-SA 4.0; the credited NOAA footage is public-domain material. See [media notices](assets/NOTICE.txt), the [CC BY-SA license](assets/CC-BY-SA-4.0.txt), and [project notices](NOTICE). The same notices are available offline in settings.
