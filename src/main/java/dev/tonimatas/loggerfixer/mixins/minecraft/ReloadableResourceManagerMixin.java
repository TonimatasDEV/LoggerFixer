package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.server.packs.resources.ReloadableResourceManager;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ReloadableResourceManager.class)
public class ReloadableResourceManagerMixin {
    @Redirect(method = "createReload", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerFixer$createReload(Logger instance, String s, Object o) {

    }
}
