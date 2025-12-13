package pl.nojumpdelay.input;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;
import pl.nojumpdelay.state.ModState;

public class Keybinds {

    private static KeyBinding toggleKey;

    public static void register() {
        toggleKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.nojumpdelay.toggle",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_J,
                        "category.nojumpdelay"
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (toggleKey.wasPressed()) {
                ModState.toggle();

                if (client.player != null) {
                    client.player.sendMessage(
                            Text.literal("NoJumpDelay: ")
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
