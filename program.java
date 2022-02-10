import java.util.Scanner;

class solution
{
    public int addition(int[] arr)
    {
        int isum = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            isum = isum+ arr[i];
        }
        return isum ;
    }

    public int substraction(int[] arr)
    {
        int isub = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            isub = isub - arr[i];
        }
        return isub ;
    }
    public int multipliaction(int[] arr)
    {
        int imul = 1;
        for(int i = 0 ; i< arr.length ; i++)
        {
            imul = imul * arr[i];
        }
        return imul ;
    }
    public float division(int[] arr)
    {
        float idiv = 0;
        for(int i = 0 ; i< arr.length-1 ; i++)
        {
            if(arr[i]==0)
            {
                System.out.println("Invalid arguments");
                return 0;
            }
            else
            {
                idiv = arr[i] / arr[i+1];
            }
        }
        return idiv ;
    }
}

public class program {
    public static void main(String[] args) {
        try (Scanner sobj = new Scanner(System.in)) {
            System.out.println("Enter the method you want to do");
            String str = sobj.nextLine();

            System.out.println("Enter the elemnts");
            int size = sobj.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the numbers :");
            for(int i = 0 ; i < arr.length; i++)
            {
                arr[i]= sobj.nextInt();
            }

            solution obj = new solution();
            float ret =0 ;

            if(str.equals("addition"))
            {
                 ret =obj.addition(arr);
            }
            else if(str.equals("substraction"))
            {
                ret =obj.substraction(arr);
            }
            else if(str.equals("multipliaction"))
            {
                ret =obj.multipliaction(arr);
            }
            else if(str.equals("division"))
            {
                ret =obj.division(arr);
            }
            System.out.println("Ans ::" +ret);
        }


    

    }


    
}
