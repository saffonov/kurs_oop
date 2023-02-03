package homeS1;

public class Cat {
    public String catname;
    public String state;

    public Cat(String catname, String state){
            this.state = state;
            this.catname = catname;
        }
        static String[] stateCat = new String[]{
                "feeded", "played", "pated", "kittyed",  "viewed"
        };


    public Cat(){
        this.state = stateCat[1];
        this.catname =  "Barsik";
    }

    public Boolean ChechOperation(Human currentHuman){
        if (currentHuman.privileges.equals("owner")) {
            return true;
        }
        else if (currentHuman.privileges.equals("user")) {
            switch (currentHuman.action) {
                case "feed":
                    return false;
//                    break;
                case "play":
                    return true;
//                    break;
                case "pat":
                    return true;
//                    break;
                case "kitty":
                    return true;
//                    break;
                case "view":
                    return true;
//                    break;
                default:
                    DoNothing(currentHuman);
            }
        }
        else if ((currentHuman.privileges.equals("guest")) & (currentHuman.action.equals("view"))) {
            return true;
        }
        else return false;
        return null;
    }

    public void DoAction(Human currentHuman){
        switch (currentHuman.action){
            case "feed":
                DoFeed(currentHuman);
                break;
            case "play":
                DoPlay(currentHuman);
                break;
            case "pat":
                DoPat(currentHuman);
                break;
            case "kitty":
                DoKitty(currentHuman);
                break;
            case "view":
                DoView(currentHuman);
                break;
            default: DoNothing(currentHuman);
        }
    }

    private void DoNothing(Human currentHuman) {

        System.out.println("Do nothing");
    }

    private void DoPlay(Human currentHuman){
        System.out.println("Cat play");

    }

    private void DoFeed(Human currentHuman){
        if (ChechOperation(currentHuman)) {
            System.out.println("Cat feed");
        }
        else System.out.println("access denied");
    }

    private void DoPat(Human currentHuman){
        System.out.println("Cat pat");
    }

    private void DoKitty(Human currentHuman){
        System.out.println("Cat Kitty");
    }

    private void DoView(Human currentHuman){

        System.out.println("Cat view");
    }
}

