import java.util.Scanner;

public class ManipTab {
    private float []T;

    ManipTab (int n)
    {
        T = new float [n];
    }

    void saisiTableau()
    {
        Scanner tab = new Scanner(System.in);
        System.out.println("donner les elements de tablau :");
        for(int i = 0; i < T.length ;i++)
        {
            T[i] = tab.nextFloat();
        }
    }
    void affichage()
    {
        for (int i = 0; i < T.length; i++)
        {
            System.out.println(T[i]+" , ");
        }
    }
    void affichage(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(T[i]+" , ");
        }
    }
    void affichage(int n,int m)
    {
        for (int i = 0; (i > n) && (i < m); i++)
        {
            System.out.println(T[i]+" , ");
        }
    }
    static void affichage(int []t)
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
    }
    static void affichage(ManipTab p)
    {
        p.affichage();
    }
    boolean TestOrdreTab()
    {
        for (int i = 0; i < T.length ; i++)
        {
            if ( T[i] < T[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    int NombreRepitition(float y)
    {
        int count = 0;
        for(int i = 0; i < T.length; i++)
        {
            if (T[i] == y)
            {
                count++;
            }
        }
        return count;
    }
    int [] Indicevaleur(float y)
    {
        int IT[];
        int nb = NombreRepitition(y);
        IT = new int[nb];
        if (nb == 0)
        {
            return null;
        }
        int j = 0;
        for(int i = 0; i < T.length ; i++)
        {
            if(T[i] == y)
            {
                IT[j] = i;
                j++;
            }

        }
        return IT;
    }
   public static boolean  TableauInclus(float T1[],float T2[])
    {
        if (T1.length > T2.length)
        {
            return false ;
        }
            for(int i = 0; i < T1.length; i++)
            {
                boolean found = false ;
                for (int j = 0; j < T2.length; j++)
                {
                    if (T1[i] == T2 [j])
                    {
                        found = true ;
                        break;
                    }
                }
                if (!found)
                {
                    return false ;
                }
            }
            return true ;
    }

}