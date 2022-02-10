import java.util.*;

public class program7 {

    public static void main(String[] args) {
         
        {
            try (Scanner sobj = new Scanner(System.in)) {
                int size =  sobj.nextInt();
                int [] arr = new int[size];

                for(int i = 0 ; i< size ; i++)
                {
                    arr[i]=sobj.nextInt();
                }
                int j=arr.length-1;
                for(int i = 0 ; i< arr.length/2 ; i++,j--)
                {
                    if(arr[i]==arr[j])
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("false");
                        System.exit(0);
                        break;
                        
                    }
                }
            }
            System.out.println("true");
            
        }

    }
}
