package kz.t4jgat.NotificationSystem;

import kz.t4jgat.LootBoxes.Case;

import java.util.List;

// Observer Interface
public interface Observer {
    void handleEvent(List<Case> inventory); // method which handle updates in observer
}
