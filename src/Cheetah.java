public class Cheetah extends Mammal implements Hunter{
    // fields
    final String info;

    // constructor
    public Cheetah (double age, String name, int speed, String info){
        super(age,name,speed);
        this.info = info;
    }

    // methods
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", speed : " + speed + ", " + info);
    }
}
