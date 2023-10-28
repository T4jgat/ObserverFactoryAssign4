package kz.t4jgat;

public class ProSeasonPassFactory implements SeasonPassFactory{
    @Override
    public SeasonPass createSeasonPass() {
        return new ProSeasonPass();
    }
}
