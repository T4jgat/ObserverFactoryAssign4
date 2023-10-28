package kz.t4jgat.NotificationSystem;

import kz.t4jgat.LootBoxes.Case;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Observer object which observe updates in ivnentory
public class Gamer implements Observer{
    Scanner sc = new Scanner(System.in);
    private String name;

    public Gamer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<Case> inventory) {
        int lastIndex = inventory.size() - 1;
        Case newCase = inventory.get(lastIndex);
        System.out.println("Dear " + name + ", you have new "+ newCase.getName() +"!\n"
                + " Case contains: " + newCase.getContent()
                +"\n ============================================================ \n");
    }
}
