package animalKingdom;

public class Mammal extends AbstractAnimal
{
    public String name;
    public int year;

    public Mammal(String name, int year)
    {
        this.name = name;
        this.year = year;
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