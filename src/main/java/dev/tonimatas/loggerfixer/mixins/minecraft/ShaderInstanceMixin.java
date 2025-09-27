package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.renderer.ShaderInstance;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ShaderInstance.class)
public class ShaderInstanceMixin {
    @Redirect(method = "updateLocations", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private static void loggerFixer$updateLocations(Logger instance, String s, Object o, Object o1) {

    }
}
