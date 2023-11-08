package net.brynnexvii.gemcraft.utility;

import net.brynnexvii.gemcraft.utility.enums.GCAspect;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.Level;

import java.util.List;

public class GCClientAccess {
    private static final String TEXT_DARK_RED = "\u00A74";
    private static final String TEXT_RED = "\u00A7c";
    private static final String TEXT_GOLD = "\u00A76";
    private static final String TEXT_YELLOW = "\u00A7e";
    private static final String TEXT_DARK_GREEN = "\u00A72";
    private static final String TEXT_GREEN = "\u00A7a";
    private static final String TEXT_AQUA = "\u00A7b";
    private static final String TEXT_DARK_AQUA = "\u00A73";
    private static final String TEXT_DARK_BLUE = "\u00A71";
    private static final String TEXT_BLUE = "\u00A79";
    private static final String TEXT_LIGHT_PINK = "\u00A7d"; //mojang calls this light purple -_-
    private static final String TEXT_DARK_PINK = "\u00A75"; //mojang calls this dark purple -_-
    private static final String TEXT_WHITE = "\u00A7f";
    private static final String TEXT_GRAY = "\u00A77";
    private static final String TEXT_DARK_GRAY = "\u00A78";
    private static final String TEXT_BLACK = "\u00A70";

    private static final String TEXT_BOLD = "\u00A7l";
    private static final String TEXT_UNDERLINE = "\u00A7n";
    private static final String TEXT_ITALICS = "\u00A7o";


    public static void expandedItemTooltip(Level level, List<Component> components, Component baseToolTip, Component expandedToolTip, GCAspect aspect) {
        if(!Screen.hasShiftDown()) {
            if(baseToolTip != null) {
                components.add(baseToolTip);
            }
            components.add(Component.literal("Press " + TEXT_DARK_AQUA + "SHIFT " + TEXT_WHITE + "for more information"));
            if(aspect != null){
                printMagicalAspect(components, aspect);
            }
        } else {
            components.add(expandedToolTip);
        }
    }

    private static void printMagicalAspect(List<Component> components, GCAspect aspect){
        MutableComponent aspectText = Component.literal(aspect.toString());
        aspectText.setStyle(aspectText.getStyle().withItalic(true));
        switch (aspect){
            case IGNIS:
                aspectText.setStyle(aspectText.getStyle().withColor(11141120));
                break;
            case ZEPHYR:
                aspectText.setStyle(aspectText.getStyle().withColor(16777045));
                break;
            case TERRA:
                aspectText.setStyle(aspectText.getStyle().withColor(43520));
                break;
            case MIZU:
                aspectText.setStyle(aspectText.getStyle().withColor(5592575));
                break;
            case AETHER:
                aspectText.setStyle(aspectText.getStyle().withColor(7799804));
                break;
            case LYS:
                aspectText.setStyle(aspectText.getStyle().withColor(15455439));
                break;
            case INANIS:
                aspectText.setStyle(aspectText.getStyle().withColor(5592405));
                break;
            default:
                System.out.println("Invalid aspect");
                components.add(Component.literal("INVALID"));
        }
        components.add(aspectText);
    }

}
