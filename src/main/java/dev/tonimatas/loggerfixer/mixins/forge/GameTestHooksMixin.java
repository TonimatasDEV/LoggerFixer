package dev.tonimatas.loggerfixer.mixins.forge;

import net.neoforged.neoforge.gametest.GameTestHooks;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GameTestHooks.class)
public class GameTestHooksMixin {
    @Redirect(method = "registerGametests", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerfixer$registerGametests(Logger instance, String s, Object o) {

    }
}
