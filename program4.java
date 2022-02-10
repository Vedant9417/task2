import java.util.Scanner;

public class program4 {
    public static boolean sol(String str)
    {
        char[] ch= str .toCharArray();
        char temp ;
        int j = ch.length -1 ;
        for(int i = 0 ; i < ch.length ; i++)
        {
                temp = ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                j--;  
        }
        String arr = String.valueOf(ch);

        if(str.equals(arr))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner sobj = new Scanner(System.in)) {
            String str = sobj.nextLine();

            boolean ret = sol(str);
            System.out.println(ret);
        }
    }

    
}
