package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.resources.model.ModelBakery;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ModelBakery.class)
public class ModelBakeryMixin {
    @Redirect(method = "getModel", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;[Ljava/lang/Object;)V"))
    private static void loggerFixer$getModel(Logger instance, String s, Object[] objects) {

    }
}
