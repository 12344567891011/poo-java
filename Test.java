/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        ManipTab[] T1 = new ManipTab[5];
        ManipTab[] T2 = new ManipTab[9];

        for (int i = 0; i < T1.length; i++)
        {
            T1[i] = new ManipTab(1);
            T1[i].saisiTableau();
        }


        for (int i = 0; i < T2.length; i++)
        {
            T2[i] = new ManipTab(1);
            T2[i].saisiTableau();
        }

        System.out.println("Contents of T1:");

        for (int i = 0; i < T1.length; i++)
        {
            System.out.print("T1[" + i + "]: ");
            T1[i].affichage();
        }

        System.out.println("Contents of T2:");
        
        for (int i = 0; i < T2.length; i++)
        {
            System.out.print("T2[" + i + "]: ");
            T2[i].affichage();
        }
        float t1[] = {1, -4};
        float t2[] = {4, 1, 0,-4,8};
        boolean found = TableauInclus(t1,t2);

    //     boolean isT1IncludedInT2 = true;

    //     // Check if each element of T1 is included in T2
    //     for (int i = 0; i < T1.length; i++)
    //     {
    //         boolean found = false;
    //         for (int j = 0; j < T2.length; j++)
    //         {
    //             if (T1[i].TableauInclus(T1[i].T, T2[j].T))
    //             {
    //                 found = true;
    //                 break;
    //             }
    //         }
    //         if (!found)
    //         {
    //             isT1IncludedInT2 = false;
    //             break;
    //         }
    //     }

        if (found)
        {
            System.out.println("T1 is included in T2");
        }
        else
        {
            System.out.println("T1 is not included in T2");
        }
    }

    }

