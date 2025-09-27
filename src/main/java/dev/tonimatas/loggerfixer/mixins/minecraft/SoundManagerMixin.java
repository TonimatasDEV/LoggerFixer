package dev.tonimatas.loggerfixer.mixins.minecraft;

import net.minecraft.client.sounds.SoundManager;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SoundManager.class)
public class SoundManagerMixin {
    @Redirect(method = "validateSoundResource", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"))
    private static void loggerfixer$validateSoundResource(Logger instance, String s, Object o, Object o1) {
        
    }
}
