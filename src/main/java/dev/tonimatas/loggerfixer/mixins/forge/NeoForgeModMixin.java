package dev.tonimatas.loggerfixer.mixins.forge;

import net.neoforged.neoforge.common.NeoForgeMod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(NeoForgeMod.class)
public class NeoForgeModMixin {
    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;info(Lorg/apache/logging/log4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private static void loggerfixer$init(Logger instance, Marker marker, String s, Object o, Object o1) {
        
    }
}
