package com.jeremykenedy.jellyfishdriftv2;

public final class SettingsValues {
  private SettingsValues() {}

  public static boolean isSupported(String key, String value) {
    if (key == null || value == null) return false;
    if ("background".equals(key)) return oneOf(value, "dark", "light", "random");
    if ("motion".equals(key)) return oneOf(value, "slow", "normal", "fast", "random");
    if ("randomize_all".equals(key) || "show_clock".equals(key))
      return oneOf(value, "true", "false");
    return false;
  }

  private static boolean oneOf(String value, String... allowed) {
    for (String option : allowed) if (option.equals(value)) return true;
    return false;
  }
}
