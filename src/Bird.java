public abstract class Bird extends Animal {
    // fields
    protected int flightHeight;

    // constructor
    public Bird (double age, String name, int flightHeight){
        super(age,name);
        this.flightHeight = flightHeight;
    }

    public int getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }

}
