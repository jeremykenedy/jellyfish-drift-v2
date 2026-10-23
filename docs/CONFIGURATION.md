# Configuration

Jellyfish Drift V2 has four effective settings. Its separate package does not read, migrate, overwrite, or remove classic Jellyfish Drift preferences.

| Key | Native control | Values | Default |
| --- | --- | --- | --- |
| `background` | Filmed scene | `dark` (Deep ocean), `light` (Blue aquarium), `random` | `dark` |
| `motion` | Playback speed | `slow` (0.9x), `normal` (1x), `fast` (1.25x), `random` | `normal` |
| `show_clock` | Show clock | `true`, `false` | `false` |
| `randomize_all` | Random scene and speed each start | `true`, `false` | `false` |

Changes apply to the next Preview or Dream. Random selections are resolved once for each new view. Animal density, species, camera movement, and lighting are part of the recording and cannot be configured independently.

The exported authority is `com.jeremykenedy.jellyfishdriftv2.settings`. Query `/schema` for the four supported controls or `/settings` for the four raw values. Updates use `ContentValues` named `key` and `value` on the settings URI. Invalid keys and choices are rejected. An update acknowledges success only after its preference commit succeeds. Boolean values use the strings `true` and `false`.

Blue aquarium contains filmed Aurelia labiata from Eric Polk's CC BY-SA 4.0 source. Deep ocean contains NOAA Crossota footage with progressive deinterlacing. The silent recordings loop every 16 or approximately 19 seconds using editorial dissolves. Crossota also contains a transition between source camera views. These are fixed recordings, not simulated animals. See [media notices](../assets/NOTICE.txt).

## Optional clock

`show_clock` is a boolean, off by default. When enabled, local time uses the device time format and slowly moves within a safe screen margin. Its saved choice is independent of `randomize_all`: an enabled clock stays enabled and a disabled clock stays disabled. Changes apply when the next Preview or Dream starts. Clock off keeps the original word-free scene. No clock or date is burned into the media.
