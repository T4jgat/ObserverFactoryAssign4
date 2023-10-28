package kz.t4jgat.LootBoxes;

public class GammaCaseFactory implements CaseFactory{

    @Override
    public Case createCase() {
        return new GammaCase();
    }
}
