import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        try (Scanner sobj = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int value = sobj .nextInt();
            int fac = 1 ;

            for(int i = value ; i>0 ; i-- )
            {
                fac = i * fac;
                
            }
            System.out.println(fac);
        }
    }

    
}
