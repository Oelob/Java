package OOP.less05;

import OOP.less05.models.Phonebook;
import OOP.less05.presenter.Presenter;

public class app {

    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        Presenter.Menu(pb);
    }
}