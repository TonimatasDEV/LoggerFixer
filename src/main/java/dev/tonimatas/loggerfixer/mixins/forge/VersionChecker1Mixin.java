package dev.tonimatas.loggerfixer.mixins.forge;

import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "net.neoforged.fml.VersionChecker$1")
public class VersionChecker1Mixin {
    @Redirect(method = "run", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;info(Ljava/lang/String;)V"))
    private void loggerfixer$run(Logger instance, String s) {
        
    }

    @Redirect(method = "process", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private void loggerfixer$process(Logger instance, String s, Object o, Object o1) {

    }

    @Redirect(method = "process", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private void loggerfixer$process(Logger instance, String s, Object o, Object o1, Object o2, Object o3) {

    }

    @Redirect(method = "process", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;warn(Ljava/lang/String;Ljava/lang/Throwable;)V"))
    private void loggerfixer$process(Logger instance, String s, Throwable throwable) {

    }
}
