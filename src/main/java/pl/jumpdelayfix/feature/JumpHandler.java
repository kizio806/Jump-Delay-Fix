package pl.jumpdelayfix.feature;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.network.ClientPlayerEntity;
import pl.jumpdelayfix.state.ModState;

public class JumpHandler {

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (!ModState.isEnabled()) return;

            ClientPlayerEntity player = client.player;
            if (player == null) return;

            if (player.isOnGround() && client.options.jumpKey.isPressed()) {
                player.jump();
            }
        });
    }
}
