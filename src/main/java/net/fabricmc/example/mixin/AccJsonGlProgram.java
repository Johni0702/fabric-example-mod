package net.fabricmc.example.mixin;

import net.minecraft.client.gl.JsonGlProgram;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(JsonGlProgram.class)
public interface AccJsonGlProgram {
    @Accessor
    static JsonGlProgram getActiveProgram() { throw new Error("AccJsonGlProgram did not apply"); }
}
