package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.Util;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Util.class)
public class UtilMixin {
    @Redirect(method = "logAndPauseIfInIde(Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;error(Ljava/lang/String;)V"))
    private static void loggerfixer$logAndPauseIfInIde(Logger instance, String s) {
        
    }

    @Redirect(method = "logAndPauseIfInIde(Ljava/lang/String;Ljava/lang/Throwable;)V", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;error(Ljava/lang/String;Ljava/lang/Throwable;)V"))
    private static void loggerfixer$logAndPauseIfInIde(Logger instance, String s, Throwable throwable) {

    }
}
