package dev.tonimatas.loggerfixer.mixins.forge;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ModConfigSpec.class)
public class ModConfigSpecMixin {
    @Redirect(method = "lambda$acceptConfig$0", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;warn(Lorg/apache/logging/log4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private static void loggerfixer$lambda$acceptConfig$0(Logger instance, Marker marker, String s, Object o, Object o1, Object o2, Object o3) {

    }

    @Redirect(method = "acceptConfig", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;warn(Lorg/apache/logging/log4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerfixer$acceptConfig(Logger instance, Marker marker, String s, Object o) {

    }
}
