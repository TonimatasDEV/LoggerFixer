package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.server.packs.VanillaPackResourcesBuilder;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(VanillaPackResourcesBuilder.class)
public class VanillaPackResourcesBuilderMixin {
    @Redirect(method = "lambda$static$1", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerFixer$lambda$static$1(Logger instance, String s, Object o) {

    }
}
