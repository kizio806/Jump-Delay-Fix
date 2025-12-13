package pl.nojumpdelay;

import net.fabricmc.api.ClientModInitializer;
import pl.nojumpdelay.feature.JumpHandler;
import pl.nojumpdelay.input.Keybinds;

public class NoJumpDelayClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Keybinds.register();
        JumpHandler.register();
    }
}
