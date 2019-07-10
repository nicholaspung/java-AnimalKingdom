package animalKingdom;

public class Bird extends AbstractAnimal
{
    public String name;
    public int year;

    public Bird(String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}