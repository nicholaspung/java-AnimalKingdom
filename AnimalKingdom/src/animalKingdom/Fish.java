package animalKingdom;

public class Fish extends AbstractAnimal
{
    public String name;
    public int year;

    public Fish(String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breath()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}