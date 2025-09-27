package dev.tonimatas.loggerfixer.mixins.minecraft;

import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "net.minecraft.client.gui.font.providers.UnihexProvider$Definition")
public class UnihexProviderMixin {
    @Redirect(method = "loadData", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;Ljava/lang/Object;)V"))
    private void loggerfixer$loadData(Logger instance, String s, Object o) {
        
    }
}
