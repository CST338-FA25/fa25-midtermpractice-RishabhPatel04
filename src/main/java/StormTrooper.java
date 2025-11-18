public class StormTrooper extends Trooper {
    private String name = "";
    private static int soldierCount = 0;

    public StormTrooper(String unit, int number){
        super(unit, number);
        soldierCount++;
        this.trooperKind = "StormTrooper";
        this.marchModifier = 1.10;
    }

    public static int getSoldierCount(){
        return soldierCount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public double march(double duration) {
        return this.marchSpeed * duration * this.marchModifier;
    }

    @Override
    public String toString(){
        return (name.isEmpty() ? "" : name) + "(" + super.toString() + ") a " + trooperKind;
    }
}
