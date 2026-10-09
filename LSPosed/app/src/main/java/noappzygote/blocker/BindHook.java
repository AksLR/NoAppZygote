package noappzygote.blocker;

/**
 * Minimal no-op hook placeholder used only to validate the Android/LSPosed
 * project build. It intentionally installs no framework hooks.
 */
public final class BindHook {

    private BindHook() {
        // Utility class.
    }

    public static void install(ClassLoader classLoader) {
        Logger.i("Neutral test module loaded; no hooks installed");
    }
}
