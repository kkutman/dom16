public class Main {
    public static void main(String[] args) {


        Animal []animals={
                new Shark("akulla"),
                new Shark("akkula2"),
                new Turtle("turtle"),
                new Turtle("turtle2"),
                new Eagle("eagle"),
                new Eagle("eagle2"),

        };
        for (Animal animal:animals){
           if(animal instanceof Shark)((Shark) animal).attack();
           else if (animal instanceof Turtle)((Turtle) animal).swim();
           else if (animal instanceof Eagle)((Eagle) animal).fly();
        }
    }
}