package kz.t4jgat.NotificationSystem;

import kz.t4jgat.LootBoxes.Case;

import java.util.List;

public interface Observer {
    void handleEvent(List<Case> inventory);
}
