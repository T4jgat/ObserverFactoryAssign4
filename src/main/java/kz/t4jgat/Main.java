    package kz.t4jgat;

public class Main {
    public static void main(String[] args) {
        SeasonPassFactory seasonPassFactory = createSeasonPassBySpecialty("base");
        SeasonPass seasonPass = seasonPassFactory.createSeasonPass();
        seasonPass.passFeatures();
    }

    public static SeasonPassFactory createSeasonPassBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("base")) {
            return new BaseSeasonPassFactory();
        } else if (specialty.equalsIgnoreCase("pro")) {
            return new ProSeasonPassFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown pass version");
        }
    }
}