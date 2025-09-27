package dev.tonimatas.loggerfixer.mixins.mojang;

import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(YggdrasilAuthenticationService.class)
public class YggdrasilAuthenticationServiceMixin {
    @Redirect(method = "<init>(Ljava/net/Proxy;Lcom/mojang/authlib/Environment;)V", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V"))
    private static void loggerFixer$init(Logger instance, String s, Object o) {

    }
}
