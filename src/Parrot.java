public class Parrot extends Bird implements Prey{
    // fields
    final String info;

    // constructor
    public Parrot (double age, String name, int flightHeight, String info){
        super(age,name,flightHeight);
        this.info = info;
    }

    // methods
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", flightHeight : " + flightHeight + ", " + info);
    }

    public String getName(){
        return this.name;
    }
}
