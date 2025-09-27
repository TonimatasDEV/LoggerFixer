package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.renderer.texture.TextureAtlas;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TextureAtlas.class)
public class TextureAtlasMixin {
    @Redirect(method = "upload", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;[Ljava/lang/Object;)V"))
    private void loggerfixer$upload(Logger instance, String s, Object[] objects) {

    }
}
