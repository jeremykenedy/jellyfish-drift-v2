# Testing

Run `bash test.sh` for pure settings behavior and installer tests. Run `bash scripts/test-python-coverage.sh`, `bash scripts/test-coverage.sh`, `bash scripts/check-style.sh`, `python3 scripts/check-docs.py`, and `python3 scripts/check-privacy.py` for the maintained checks. The pure options and validation classes require 100% line and branch coverage; Android framework lifecycle and decoder behavior require native checks.

With a freshly authorized device lease, `tests/native_provider_persistence.py --serial DEVICE --output PRIVATE_DIRECTORY` tests acknowledged writes across process death and restores all three values. It must not run alongside a Preview or Dream test. It does not change Dream selection, OS settings, or another app.

New-package native checks must cover both scenes and playback speeds, actual menu choices, randomization, Credits/Close/Back, Preview resume, actual bound Dream, decoder selection, loops, and exit. Snapshot and persist all private baselines before the first mutation. Confirm the classic package and its six values remain unchanged when V2 is installed or configured. Physical pacing must use actual presentation timestamps without screenrecord and distinguish sampled windows from continuous capture. See [verification](VERIFICATION.md).
