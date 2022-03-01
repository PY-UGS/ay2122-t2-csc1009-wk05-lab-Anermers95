import java.util.Date;

public abstract class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    GeometricObject()
    {
        this.color = "white";
        this.filled = false;
        dateCreated = new Date();
    }
    
    GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;    
    }

    public abstract double getArea();


    public String getColor()
    {
        return this.color + " and filled: " + this.filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    public boolean isfilled()
    {
        return this.filled;
    }

    public void setfilled(boolean filled)
    {
        this.filled = filled;
    }
    public String toString()
    {
        String date = " created on " + getDateCreated();
        return date;
    }
    public Date getDateCreated()
    {
        return this.dateCreated;
    }





}
