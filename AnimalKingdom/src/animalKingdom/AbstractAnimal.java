package animalKingdom;

public abstract class AbstractAnimal
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    public String eat()
    {
        return "Eating.";
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }
}