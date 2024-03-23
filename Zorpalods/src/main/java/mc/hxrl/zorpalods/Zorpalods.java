package mc.hxrl.zorpalods;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("zorpalods")
public class Zorpalods
{
	public static final String MODID = "zorpalods";
    // private static final Logger LOGGER = LogUtils.getLogger();

    public Zorpalods()
    {
        // IEventBus mbus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
