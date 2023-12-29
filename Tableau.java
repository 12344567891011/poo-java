import java.util.Scanner;

public class Tableau {
    private int T[];
    private int n;
    Tableau(int n)
    {
        this.n = n;
        T = new int [n];
    }
    public void lecture()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner les elemnts de tableau :");
        for(int i = 0; i < T.length; i++)
        {
            t[i] = sc.nextInt();
        }
    }
    public void affichage()
    {
        for(int i; i < T.length; i++)
        {
            System.out.print(T[i]+", ");
        }
    }
    
}