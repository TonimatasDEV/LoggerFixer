package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.sounds.SoundEngine;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SoundEngine.class)
public class SoundEngineMixin {
    @Redirect(method = "reload", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerFixer$reload(Logger instance, String s, Object o) {

    }

    @Redirect(method = "loadLibrary", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Lorg/slf4j/Marker;Ljava/lang/String;)V"))
    private static void loggerFixer$loadLibrary(Logger instance, Marker marker, String s) {

    }
}
