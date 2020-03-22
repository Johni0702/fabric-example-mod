package net.fabricmc.example.mixin;

import net.minecraft.client.gl.GlBlendState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GlBlendState.class)
public class ExampleMixin {
	@Inject(method = "<init>", at = @At("RETURN"))
	private void init(CallbackInfo info) {
		System.out.println("getActiveProgram: " + AccJsonGlProgram.getActiveProgram());
	}
}
