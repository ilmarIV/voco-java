package week9.ex17.mooc.ui;

import week9.ex17.mooc.logic.UserInterface;

public class TextUserInterface implements UserInterface {

    @Override
    public void update() {
        System.out.println("Updating the user interface");
    }
}
