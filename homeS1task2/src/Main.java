//Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
//        Какие члены должны быть у каждого из классов
package homeS1;


import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        Box myBox = new Box();
        Human ownerHuman = new Human("ivan", "owner", "open");
        Human userHuman = new Human("nik", "user", "push");
        Human guestHuman = new Human("kate", "guest", "view");

        myBox.DoAction(ownerHuman);
        myBox.DoAction(userHuman);
        myBox.DoAction(guestHuman);

        guestHuman.setAction("close");
        System.out.println(guestHuman);
        myBox.DoAction(guestHuman);

    }
}