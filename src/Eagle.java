public class Eagle extends Bird implements Hunter{
    // fields
    final String info;

    //constructor
    public Eagle (double age, String name,int flightHeight, String info){
        super(age,name,flightHeight);
        this.info = info;
    }

    // methods
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", flightHeight : " + flightHeight + ", " + info);
    }

}
