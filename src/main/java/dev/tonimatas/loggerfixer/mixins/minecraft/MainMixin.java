package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.main.Main;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Main.class)
public class MainMixin {
    @Redirect(method = "main", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerFixer$main(Logger instance, String s, Object o) {
        
    }
}
