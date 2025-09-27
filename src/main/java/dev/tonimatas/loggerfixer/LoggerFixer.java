package dev.tonimatas.loggerfixer;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(LoggerFixer.MODID)
public class LoggerFixer {
    public static final String MODID = "loggerfixer";

    public LoggerFixer(IEventBus modEventBus, ModContainer modContainer) {
        LogUtils.getLogger().info("Logger Fixer has been started correctly.");
    }
}
