package dev.tonimatas.loggerfixer.mixins.mojang;

import com.mojang.blaze3d.audio.Library;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Library.class)
public class LibraryMixin {
    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerfixer$logAndPauseIfInIde(Logger instance, String s, Object o) {

    }
}
