package kz.t4jgat.LootBoxes;

import java.util.List;

// Interface for lootbox cases
public interface Case {
    List<String> getContent(); // get list with possible loot from the case
    String getName(); // name getter
}
