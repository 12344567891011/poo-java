public class Math
{
    int val;
    public  Math(){}
    public Math(int val)
    {
        this.val = val;
    }

    static Math add(Math n1, Math n2)
    {
        Math n3 = new Math();
        n3.val = n1.val + n2.val;
        return n3;
    }
    
}