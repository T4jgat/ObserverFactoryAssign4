package kz.t4jgat.LootBoxes;

import java.util.Arrays;
import java.util.List;

public class BravoCase implements Case {
    private String name = "Bravo Case";
    private List<String> content = Arrays.asList(
            "AK-47 | Fire Serpent", "Desert Eagle | Golden Koi", "P2000 | Ocean Foam",
            "AWP | Graphite", "P90 | Emerald Dragon", "USP-S | Overgrowth"
    );



    @Override
    public List<String> getContent() {
        return content;
    }

    @Override
    public String getName() {
        return this.name;
    }
}