package com.raid.addon;

import com.raid.addon.modules.AutomateRaid;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;
import org.slf4j.Logger;

public class AutoRaidFarm extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();



    @Override
    public void onInitialize() {
        Modules.get().add(new AutomateRaid());

    }
    @Override
    public void onRegisterCategories() {

    }
    @Override
    public String getPackage() {
        return "com.raid.addon";
    }




    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("bitsixfour", "raidfarmaddon");
    }
}
