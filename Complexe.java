public class Complexe
{
    private double re;
    private double im;
    
    public Complexe conjugue()
    {
        return new Complexe(this.re,-this.im);
    }
    Complexe (double re, double im)
    {
        this.re = re;
        this.im = im;
    }
    Complexe plus(Complexe z)
    {
        return new Complexe(z.re + this.re) , (z.im + this.im);
    
    }

    Complexe soustraction(Complexe z)
    {
        z = (z.re - this.re) + (z.im - this.im);
        return z;
    }
}