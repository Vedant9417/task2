import java.util.ArrayList;
import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        try (Scanner sobj = new Scanner(System.in)) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            int size = sobj.nextInt();
            int j = 0;
            for(int i = 0 ; i< size ; i++)
            {
                j = sobj.nextInt();
                arr.add(j);
            }
            
            int del = sobj .nextInt();

            for(int i = 0 ; i<arr.size();i++)
            {
                if(del==arr.get(i))
                {
                    arr.remove(i);
                }
            }
            System.out.println(arr);
        }

    }
    
}
