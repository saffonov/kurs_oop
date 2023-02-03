package homeS1;

import java.util.ArrayList;

public class Box {
    public String state;
    public ArrayList items;

    public Box(String state, ArrayList items){
        this.state = state;
        this.items = items;
    }

    static String[] stateBox = new String[]{
            "open", "close", "empty", "full", "busy"
    };


    public Box(){
        this.state = stateBox[1];
        this.items = new ArrayList();
    }

    public Boolean ChechOperation(Human currentHuman){
        if (currentHuman.privileges.equals("owner")) {
            return true;
        }
        else if (currentHuman.privileges.equals("user")) {
            switch (currentHuman.action) {
                case "open":
                    return false;
//                    break;
                case "close":
                    return false;
//                    break;
                case "push":
                    return true;
//                    break;
                case "pull":
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
            case "open":
                DoOpen(currentHuman);
                break;
            case "close":
                DoClose(currentHuman);
                break;
            case "push":
                DoPush(currentHuman);
                break;
            case "pull":
                DoPull(currentHuman);
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

    private void DoOpen(Human currentHuman){
        System.out.println("Box open");

    }

    private void DoClose(Human currentHuman){
        if (ChechOperation(currentHuman)) {
            System.out.println("Box close");
        }
        else System.out.println("access denied");
    }

    private void DoPush(Human currentHuman){
        System.out.println("Box push");
    }

    private void DoPull(Human currentHuman){
        System.out.println("Box pull");
    }

    private void DoView(Human currentHuman){
        System.out.println("Box view");
    }



}
