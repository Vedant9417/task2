import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        try (Scanner sobj = new Scanner(System.in)) {
            System.out.println("Enter the number of elements ::");
            int value = sobj .nextInt();
            int no1 = 0;
            int no2 = 1;
            int no3 = 0;
            System.out.print(no1+" "+no2);        
            for(int i = 2 ; i < value ; i++)
            {   
                no3 = no2 +no1;
                System.out.print(" "+no3);
                no1 = no2;
                no2 =no3; 


            }
        }
    }

    
}
