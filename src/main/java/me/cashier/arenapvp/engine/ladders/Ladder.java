package me.cashier.arenapvp.engine.ladders;

import lombok.Getter;
import lombok.Setter;
import me.cashier.arenapvp.engine.ladders.ladderenum.LadderType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

@Getter
@Setter
public class Ladder {

    private static final List<Ladder> allLadders = new ArrayList<>();

    private final String id;

    private boolean isEnabled;
    private boolean isRanked;
    private ItemStack[] inventory = new ItemStack[0];
    private ItemStack[] armorInventory = new ItemStack[0];
    private LadderType ladderType = LadderType.DEFAULT;

    private MaterialData icon;

    public Ladder(String id) {
        this.id = id;
    }


}
