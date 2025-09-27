package dev.tonimatas.loggerfixer.mixins.mojang;

import com.mojang.datafixers.DataFixerBuilder;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DataFixerBuilder.Result.class)
public class DataFixerBuilder1Mixin {
    @Redirect(method = "lambda$optimize$4", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private static void loggerFixer$lambda$static$1(Logger instance, String s, Object o, Object o1) {

    }
}
