package Ninja.Spoucy.configuration;

import java.io.File;
import java.util.logging.Level;
import net.minecraftforge.common.Configuration;
import Ninja.Spoucy.Lib.*;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
        public static Configuration config;
        public static void init(File file){
                config = new Configuration(file);
                
                try{
                        config.load();
                        
                        BlockIds.CUSTOMBLOCK_ID = config.getBlock(Strings.CUSTOMBLOCK_NAME, BlockIds.CUSTOMBLOCK_ID_DEFAULT).getInt(BlockIds.CUSTOMBLOCK_ID_DEFAULT);
                        BlockIds.CUSTOMSTATICBLOCK_ID = config.getBlock(Strings.CUSTOMSTATICBLOCK_NAME, BlockIds.CUSTOMSTATICBLOCK_ID_DEFAULT).getInt(BlockIds.CUSTOMSTATICBLOCK_ID_DEFAULT);
                        ItemIds.CUSTOMITEM_ID = config.getItem(Strings.CUSTOMITEM_NAME, ItemIds.CUSTOMITEM_ID_DEFAULT).getInt(ItemIds.CUSTOMITEM_ID_DEFAULT);
                        ItemIds.CUSTOMSTATICITEM_ID = config.getItem(Strings.CUSTOMSTATICITEM_NAME, ItemIds.CUSTOMSTATICITEM_ID_DEFAULT).getInt(ItemIds.CUSTOMSTATICITEM_ID_DEFAULT);

                }
                catch(Exception e){
                        FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "has a problem loading the config file");
                }
                finally{
                        config.save();
                }
                
        }
}
