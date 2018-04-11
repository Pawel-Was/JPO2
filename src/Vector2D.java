public class Vector2D{
    //VARIABLES
    public double x,y;
    //CONSTRUCTOS
    public Vector2D()
    {
        this.x = 0;
        this.y = 0;
    }
    public Vector2D(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    //METHODS
    public Vector2D sumVect(Vector2D vect)
    {
        return new Vector2D(this.x + vect.x, this.y + vect.y);
    }
    public Vector2D subVect(Vector2D vect)
    {
        return new Vector2D(this.x - vect.x , this.y - vect.y);
    }
    public Vector2D constMultVect(int k)
    {
        return new Vector2D(this.x *k,this.y * k);
    }
    public double length()
    {
        return Math.sqrt((this.x*this.x ) + (this.y *this.y));
    }
    public Vector2D normalize()
    {
        try
        {
            return new Vector2D(this.x/this.length(),this.y/this.length());

        }
        catch (ArithmeticException e)
        {
            System.out.println("Unable to normalize, length equals 0");
            return null;

        }
    }

}
