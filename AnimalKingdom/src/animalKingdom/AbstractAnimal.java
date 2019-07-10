package animalKingdom;

public abstract class AbstractAnimal
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public AbstractAnimal()
    {
        maxId++;
        id = maxId;
    }

    public String eat()
    {
        return "Eating.";
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    private int getId()
    {
        return id;
    }

    private String getName()
    {
        return name;
    }

    private int getYear()
    {
        return year;
    }
}