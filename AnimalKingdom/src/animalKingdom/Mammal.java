package animalKingdom;

public class Mammal extends AbstractAnimal
{
    private String name;
    private int year;

    public Mammal(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}