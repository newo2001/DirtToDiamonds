package me.newo2001.dirttodiamonds;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("dirttodiamonds")
public class DirtToDiamonds
{
    private static final Logger LOGGER = LogManager.getLogger();

    public DirtToDiamonds() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Loading dirt to diamonds");
    }
}
