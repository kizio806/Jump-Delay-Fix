package pl.jumpdelayfix;

import net.fabricmc.api.ClientModInitializer;
import pl.jumpdelayfix.feature.JumpHandler;
import pl.jumpdelayfix.input.Keybinds;

public class JumpDelayFixClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Keybinds.register();
        JumpHandler.register();
    }
}
