# Configuration

Jellyfish Drift V2 has three effective settings. Its separate package does not read, migrate, overwrite, or remove classic Jellyfish Drift preferences.

| Key | Native control | Values | Default |
| --- | --- | --- | --- |
| `background` | Filmed scene | `dark` (Deep ocean), `light` (Blue aquarium), `random` | `dark` |
| `motion` | Playback speed | `slow` (0.9x), `normal` (1x), `fast` (1.25x), `random` | `normal` |
| `randomize_all` | Random scene and speed each start | `true`, `false` | `false` |

Changes apply to the next Preview or Dream. Random selections are resolved once for each new view. Animal density, species, camera movement, and lighting are part of the recording and cannot be configured independently.

The exported authority is `com.jeremykenedy.jellyfishdriftv2.settings`. Query `/schema` for the three supported controls or `/settings` for the three raw values. Updates use `ContentValues` named `key` and `value` on the settings URI. Invalid keys and choices are rejected. An update acknowledges success only after its preference commit succeeds. Boolean values use the strings `true` and `false`.

Blue aquarium contains filmed Aurelia labiata from Eric Polk's CC BY-SA 4.0 source. Deep ocean contains NOAA Crossota footage with progressive deinterlacing. The silent recordings loop every 16 or approximately 19 seconds using editorial dissolves. Crossota also contains a transition between source camera views. These are fixed recordings, not simulated animals. See [media notices](../assets/NOTICE.txt).
