package dev.tonimatas.loggerfixer.mixins.forge;

import net.neoforged.fml.config.ConfigTracker;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@SuppressWarnings("UnstableApiUsage")
@Mixin(ConfigTracker.class)
public class ConfigTrackerMixin {
    @Redirect(method = "loadConfig", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerfixer$loadConfig(org.slf4j.Logger instance, org.slf4j.Marker marker, String s, Object o) {

    }

    @Redirect(method = "openConfig", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private static void loggerfixer$openConfig(Logger instance, String s, Object o, Object o1) {

    }
}
