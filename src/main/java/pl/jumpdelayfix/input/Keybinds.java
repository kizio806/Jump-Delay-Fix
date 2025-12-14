package pl.jumpdelayfix.input;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import pl.jumpdelayfix.state.ModState;

public class Keybinds {

    private static KeyBinding toggleKey;

    public static void register() {
        toggleKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.jumpdelayfix.toggle",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_J,
                        "category.jumpdelayfix"
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (toggleKey.wasPressed()) {
                ModState.toggle();

                if (client.player != null) {
                    client.player.sendMessage(
                            Text.literal("JumpDelayFix: ")
                                    .append(
                                            Text.literal(ModState.isEnabled() ? "ON" : "OFF")
                                                    .formatted(ModState.isEnabled()
                                                            ? Formatting.GREEN
                                                            : Formatting.RED
                                                    )
                                    ),
                            true
                    );

                }
            }
        });
    }
}
