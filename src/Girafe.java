public class Girafe extends Mammal implements Prey {
    // fields
    final String info;

    // constructor
    public Girafe (double age, String name, int speed, String info){
        super(age,name,speed);
        this.info = info;
    }

    // methods
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", speed : " + speed + ", " + info);
    }

    public String getName(){
        return this.name;
    }
}
