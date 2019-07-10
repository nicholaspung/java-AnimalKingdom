package animalKingdom;

public class Main
{
    public static void main(String[] args)
    {
        Fish fish = new Fish("Pigeon", 1837);
        Bird bird = new Bird("Salmon", 1758);
        Mammal mammal = new Mammal("Panda", 1869);

        System.out.println(fish.getId());
        System.out.println(bird.getName());
        System.out.println(mammal.getYear());
    }
}