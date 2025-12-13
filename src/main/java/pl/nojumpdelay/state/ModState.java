package pl.nojumpdelay.state;

public class ModState {
    private static boolean enabled = true;

    public static boolean isEnabled() {
        return enabled;
    }

    public static void toggle() {
        enabled = !enabled;
    }
}
