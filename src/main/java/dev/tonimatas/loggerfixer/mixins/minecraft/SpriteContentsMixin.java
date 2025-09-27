package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.renderer.texture.SpriteContents;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SpriteContents.class)
public class SpriteContentsMixin {
    @Redirect(method = "createAnimatedTexture", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private void loggerfixer$createAnimatedTexture(Logger instance, String s, Object o, Object o1) {
        
    }

    @Redirect(method = "createAnimatedTexture", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;[Ljava/lang/Object;)V"))
    private void loggerfixer$createAnimatedTexture(Logger instance, String s, Object[] objects) {

    }
}
