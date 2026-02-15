package com.raid.addon.modules;

import com.raid.addon.AutoRaidFarm;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.EntityPose;
import static meteordevelopment.meteorclient.MeteorClient.mc;

public class AutomateRaid extends Module {

    public AutomateRaid() {
        super(Categories.Misc, "elytra-plus", "Make elytra flight look like vanilla fly.");
    }

    @EventHandler
    private void onTick(TickEvent.Post event) {
        if (mc.player != null && (mc.player.speed > 30)) {
            mc.player.setPose(EntityPose.STANDING);
        }
    }
}
