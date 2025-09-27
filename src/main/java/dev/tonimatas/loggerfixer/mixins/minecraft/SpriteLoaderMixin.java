package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.renderer.texture.SpriteLoader;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SpriteLoader.class)
public class SpriteLoaderMixin {
    @Redirect(method = "stitch", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;[Ljava/lang/Object;)V"))
    private void loggerfixer$createAnimatedTexture(Logger instance, String s, Object[] objects) {

    }
}
