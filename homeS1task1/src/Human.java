
/**
 *
 */
public class Human {

    public String generation;
    public String name;
    public String family;
    public String relationship; // отношение вверх


    public Human(String generation, String name, String family, String relationship) {
        this.generation = generation;
        this.name = name;
        this.family = family;
        this.relationship = relationship;
    }

    public Human(){

        int iGeneration = (int) (1+Math.random()*3);
        int iName = (int) (Math.random()*4);
        int iFamaly = (int) (Math.random()*4);
        int iRelationship = (int) (Math.random()*8);
        this.generation = String.valueOf(iGeneration);
        this.name = getRNDName(iName);
        this.family = getRNDFamaly(iFamaly);
        this.relationship = getRNDRelationship(iRelationship);
    }

    @Override
    public String toString(){
        return "Human: {" +
                "generation: " + generation +
                " name: " + name +
                " famile: " + family +
                " relationship: " + relationship +
                "}" ;
    }

    public String getGeneration() {return generation; }
    public String getName() {
        return name;
    }

    public String getFamily(){
        return family;
    }

   public String getRelationship() { return relationship; }

    public void setName(String name) {
        this.name = name;
    }

    private String getRNDName(int n) {
        String[]  Names = new String[]{"Ivan", "Maria", "Peter", "Natalia"};
        return Names[n];
    }

    private String getRNDFamaly(int n) {
        String[]  Famaly = new String[]{"Ivanov", "Sidorov", "Peterov", "Nataliaov"};
        return Famaly[n];
    }

    static   String[]  Relationship = new String[]{ "grandfather",
            "grandmother", "father", "mother",  "son", "daughter",  "grandson", "granddaughte"};

    private String getRNDRelationship(int n){
//        String[]  Relationship = new String[]{ "grandfather",
//                "grandmother", "father", "mother",  "son", "daughter",  "grandson", "granddaughte"};
        return Relationship[n];

    }


}


