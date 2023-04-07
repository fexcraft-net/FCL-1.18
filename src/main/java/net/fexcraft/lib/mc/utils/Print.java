package net.fexcraft.lib.mc.utils;

import net.fexcraft.lib.common.Static;
import net.minecraft.commands.CommandSource;
import net.minecraft.network.chat.TextComponent;

public class Print {

    public static void chat(CommandSource src, String msg){
        src.sendMessage(new TextComponent(msg), null);
    }

    public static void debug(Object obj){
        if(Static.dev()){
            System.out.println(obj);
        }
    }

    public static void debug(Object... obj){
        if(Static.dev()){
            System.out.println("[");
            System.out.println("\t" + obj);
            System.out.println("]");
        }
    }

}
