package week9.ex17;

import week9.ex17.mooc.logic.UserInterface;
import week9.ex17.mooc.ui.ApplicationLogic;
import week9.ex17.mooc.ui.TextUserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
