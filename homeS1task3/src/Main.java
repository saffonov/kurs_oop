package homeS1;
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Human ownerHuman = new Human("ivan", "owner", "feed");
        Human userHuman = new Human("nik", "user", "play");
        Human guestHuman = new Human("kate", "guest", "view");

        System.out.println(myCat.getName());

//        myCat.DoAction(ownerHuman);
//        myCat.DoAction(userHuman);
//        myCat.DoAction(guestHuman);
//
//        guestHuman.setAction("feed");
//        System.out.println(guestHuman);
//        myCat.DoAction(guestHuman);
    }
}