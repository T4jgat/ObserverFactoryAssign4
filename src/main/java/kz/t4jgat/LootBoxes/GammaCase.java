package kz.t4jgat.LootBoxes;

import java.util.Arrays;
import java.util.List;

public class GammaCase implements Case {
    private String name = "Gamma case";
    private List<String> content = Arrays.asList(
            "AK-47 | Neon Revolution", "FAMAS | Roll Cage", "Tec-9 | Fuel Injector", "MP9 | Airlock", "AUG | Syd Mead",
            "Desert Eagle | Directive", "Glock-18 | Weasel", "SG 553 | Triarch"
    );


    @Override
    public List<String> getContent() {
        return this.content;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
