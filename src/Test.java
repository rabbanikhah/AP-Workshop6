import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Parrot(3, "parrot1", 46, "can fly"));
        animals.add(new Eagle(10, "eagle1", 1000, "can hight flying"));
        animals.add(new Cheetah(35, "cheetah1", 50, "can hunt"));
        animals.add(new Girafe(5, "giraffe1", 50, "can eat"));

        for (Animal a : animals)
            a.show();
        Cheetah c = new Cheetah(66, "cheetah2", 52, "can hunt");
        c.hunt((Parrot)animals.get(0));
    }
}
