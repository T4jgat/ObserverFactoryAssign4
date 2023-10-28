package kz.t4jgat;

public class BaseSeasonPassFactory implements SeasonPassFactory{

    @Override
    public SeasonPass createSeasonPass() {
        return new BaseSeasonPass();
    }
}
