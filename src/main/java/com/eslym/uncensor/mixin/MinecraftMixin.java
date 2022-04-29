package com.eslym.uncensor.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(at = @At("HEAD"), method="isTextFilteringEnabled()Z", cancellable = true)
    private void injectShouldFilterText(CallbackInfoReturnable<Boolean> info) {
        info.setReturnValue(false);
    }
}
