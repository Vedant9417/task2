import java.util.Scanner;

public class program10 {
    public static String sol(String str)
    {
        char[] ch= str .toCharArray();
        char [] arr = new char[str.length()];
        
        int j = ch.length -1 ;
        for(int i = 0 ; i < ch.length ; i++)
        {
            arr[i]=ch[j];
            j--;
        }
        String arg = String.valueOf(arr);

        return arg;

    }
    public static void main(String[] args) {
        try (Scanner sobj = new Scanner(System.in)) {
            String str = sobj.nextLine();

            String ret = sol(str);
            System.out.println(ret);
        }
    }

    
}

