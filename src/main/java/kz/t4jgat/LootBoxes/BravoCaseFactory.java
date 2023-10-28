package kz.t4jgat.LootBoxes;

public class BravoCaseFactory implements CaseFactory{

    @Override
    public Case createCase() {
        return new BravoCase();
    }
}
