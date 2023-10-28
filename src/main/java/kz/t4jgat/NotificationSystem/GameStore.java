package kz.t4jgat.NotificationSystem;

import kz.t4jgat.LootBoxes.Case;

import java.util.ArrayList;
import java.util.List;

public class GameStore implements Observed{
    private List<Case> lootList = new ArrayList<>();
    private List<Observer> activeGamers = new ArrayList<>();

    public void addLootbox(Case lootbox) {
        this.lootList.add(lootbox);
        notifyObservers();
    }

    public void removeLootbox(Case lootbox) {
        this.lootList.remove(lootbox);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.activeGamers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.activeGamers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : activeGamers) {
            observer.handleEvent(this.lootList);
        }
    }
}
