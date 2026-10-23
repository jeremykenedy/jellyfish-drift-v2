package com.jeremykenedy.jellyfishdriftv2;

import java.util.Random;

public final class JellyfishOptionsTest {
  public static void main(String[] args) {
    verifyFilmedOptions();
    verifyRandomSelections();
    verifySettingsProviderValues();
    verifyOptionalClock();
    System.out.println("Jellyfish settings tests passed.");
  }

  private static void verifyFilmedOptions() {
    JellyfishOptions dark = JellyfishOptions.resolve("dark", "normal", false, new Random(1));
    check("crossota".equals(dark.scene) && dark.speed == 1f, "dark selects the deep-ocean film");
    JellyfishOptions light = JellyfishOptions.resolve("light", "fast", false, new Random(1));
    check(
        "aurelia".equals(light.scene) && light.speed == 1.25f,
        "light selects the blue-aquarium film");
    check(JellyfishOptions.speedFor("slow") == 0.9f, "slow is 0.9x");
    check(JellyfishOptions.speedFor("normal") == 1f, "normal is recorded speed");
    check(JellyfishOptions.speedFor("unknown") == 1f, "invalid speed falls back to recorded speed");
    check(JellyfishOptions.speedFor("fast") == 1.25f, "fast is 1.25x");
    JellyfishOptions invalid = JellyfishOptions.resolve("unknown", "unknown", false, new Random(1));
    check("crossota".equals(invalid.scene) && invalid.speed == 1f, "invalid options are safe");
  }

  private static void verifyRandomSelections() {
    for (int index = 0; index < 3; index++) {
      JellyfishOptions perSetting =
          JellyfishOptions.resolve("random", "random", false, new FixedRandom(index));
      JellyfishOptions all =
          JellyfishOptions.resolve("light", "fast", true, new FixedRandom(index));
      check(
          perSetting.scene.equals(all.scene) && perSetting.speed == all.speed,
          "only effective settings randomized");
      check(perSetting.scene.equals(index == 0 ? "crossota" : "aurelia"), "random scene selection");
      check(perSetting.speed == new float[] {1f, 0.9f, 1.25f}[index], "random speed selection");
    }
  }

  private static void verifySettingsProviderValues() {
    check(!SettingsValues.isSupported(null, "dark"), "null key rejected");
    check(!SettingsValues.isSupported("background", null), "null value rejected");
    check(SettingsValues.isSupported("background", "light"), "light background accepted");
    check(SettingsValues.isSupported("background", "dark"), "dark background accepted");
    check(SettingsValues.isSupported("background", "random"), "random background accepted");
    check(!SettingsValues.isSupported("background", "blue"), "invalid background rejected");
    check(SettingsValues.isSupported("motion", "slow"), "slow motion accepted");
    check(SettingsValues.isSupported("motion", "normal"), "normal motion accepted");
    check(SettingsValues.isSupported("motion", "fast"), "motion accepted");
    check(SettingsValues.isSupported("motion", "random"), "random motion accepted");
    check(!SettingsValues.isSupported("motion", "instant"), "invalid motion rejected");
    check(SettingsValues.isSupported("randomize_all", "true"), "randomize all accepted");
    check(SettingsValues.isSupported("randomize_all", "false"), "randomize toggle accepted");
    check(!SettingsValues.isSupported("unknown", "value"), "unknown key rejected");
    check(!SettingsValues.isSupported("density", "few"), "unsupported density rejected");
    check(!SettingsValues.isSupported("species", "moon"), "unsupported species rejected");
    check(!SettingsValues.isSupported("light_rays", "on"), "unsupported rays rejected");
  }

  private static void verifyOptionalClock() {
    check(SettingsValues.isSupported("show_clock", "true"), "clock opt-in accepted");
    check(SettingsValues.isSupported("show_clock", "false"), "clock opt-out accepted");
    check(!SettingsValues.isSupported("show_clock", "on"), "ambiguous clock value rejected");
  }

  private static void check(boolean result, String message) {
    if (!result) throw new AssertionError(message);
  }

  private static final class FixedRandom extends Random {
    private final int value;

    FixedRandom(int value) {
      this.value = value;
    }

    @Override
    public int nextInt(int bound) {
      return Math.min(value, bound - 1);
    }
  }
}
