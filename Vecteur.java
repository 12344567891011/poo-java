/**
 * Vecteur
 */
public class Vecteur {

    public float[] com ;
    Vecteur (int n)
    {
        com = new float[n] ;
        for(int i = 0; i < n ; i++)
        {
            com[i] = 0;
        }
    }
    void affichage(Vecteur v)
    {
        System.out.println("v =()");
        for(int i = 0 ; i < v.com.length ; i++)
        {
            if (v.com[i] != 0)
            {
                if (v.com[i] > 0)
                {
                    System.out.println("");   
                }
            }
        }
    }
}