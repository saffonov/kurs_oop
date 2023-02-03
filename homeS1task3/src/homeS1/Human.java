package homeS1;

public class Human {
    public String name;
    public String privileges; // права на дотсуп
    public String action;
    public Human(String name, String privileges, String action) {
        this.name = name;
        this.privileges = privileges;
        this.action = action;
    }

    public Human(){
        int iName = (int) (Math.random()*4);
        int iPrivileges = (int) (Math.random()*3);
        int iAction = (int) (Math.random()*5);

        this.name = getRNDName(iName);
        this.privileges = getRNDPrivileges(iPrivileges);
        this.action = getRNDAction(iAction);
    }

    @Override
    public String toString(){
        return "Human: {" +
                " name: " + name +
                " privileges: " + privileges +
                " action: " + action +
                "}" ;
    }
    public String getName() {return name;}
    public String getPrivileges(){return privileges;}
    public String getAction() {return action;}
    public void setName(String name) {this.name = name;}
    public void setPrivileges(String privileges) {this.privileges = privileges;}
    public void setAction(String action) {this.action = action;}

    private String getRNDName(int n) {
        String[]  Names = new String[]{"Ivan", "Maria", "Peter", "Natalia"};
        return Names[n];
    }

    private String getRNDPrivileges(int n) {
        String[]  Privileges = new String[]{"owner", "user", "guest"};
        return Privileges[n];
    }

    static   String[]  Action = new String[]{ "feed",
            "play", "pat", "kitty",  "view"};

    private String getRNDAction(int n) {
        return Action[n];
    }


}


