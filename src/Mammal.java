public abstract class Mammal extends Animal {
    // field
    protected int speed;
    // constructor
    public Mammal (double age, String name, int speed){
        super(age,name);
        this.speed = speed;
    }
}
