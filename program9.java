import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {

        try (Scanner sobj = new Scanner(System.in)) {
            int j = sobj.nextInt();
            int r = sobj.nextInt();
            
            int fac = 1 ;

            for(int i = j ; i>0 ; i-- )
            {
                fac = i * fac;
                
            }
            System.out.println(fac);

            int k = j-r;
            
            int fac1 = 1 ;

            for(int i = k ; i>0 ; i-- )
            {
                fac1 = i * fac1;
                
            }
            
            int  p = fac / fac1;
            System.out.println("permutation is "+p);
        }

        
    }
    
}
