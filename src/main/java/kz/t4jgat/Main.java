package kz.t4jgat;

import kz.t4jgat.LootBoxes.BravoCaseFactory;
import kz.t4jgat.LootBoxes.Case;
import kz.t4jgat.LootBoxes.CaseFactory;
import kz.t4jgat.LootBoxes.GammaCaseFactory;
import kz.t4jgat.NotificationSystem.GameStore;
import kz.t4jgat.NotificationSystem.Gamer;
import kz.t4jgat.NotificationSystem.Observer;

public class Main {
    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
        Observer firstGamer = new Gamer("David");
        Observer secondGamer = new Gamer("Bob");
        gameStore.addObserver(firstGamer);
        gameStore.addObserver(secondGamer);

        CaseFactory caseFactory = createCaseBySpecifies("bravo");
        Case myCase = caseFactory.createCase();

        gameStore.addLootbox(myCase);

//   ===================== TESTS ========================
//        Observer thirdGamer = new Gamer("S1mple");
//        gameStore.addObserver(thirdGamer);
//        CaseFactory caseFactory2 = createCaseBySpecifies("gamma");
//        Case newCase = caseFactory2.createCase();
//        gameStore.addLootbox(newCase);
    }

    public static CaseFactory createCaseBySpecifies(String specifies) {
        if (specifies.equalsIgnoreCase("bravo")) {
            return new BravoCaseFactory();
        } else if (specifies.equalsIgnoreCase("gamma")) {
            return new GammaCaseFactory();
        } else {
            throw new RuntimeException(specifies + " is unknown case");
        }
    }
}
