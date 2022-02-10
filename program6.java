
public class program6{  
    public static void main(String args[]){  
   
    int original[][]={{11,11,12},{13,14,15},{16,17,18}};    
 
    int trans[][]=new int[3][3];  
        
    for(int i=0;i<3;i++)
    {    
        for(int j=0;j<3;j++)
        {    
            trans[i][j]=original[j][i];  
        }    
    }    
      
    for(int i=0;i<3;i++)
    {    
        for(int j=0;j<3;j++)
        {    
            System.out.print(original[i][j]+" ");    
        }    
            System.out.println();   
    }    
    System.out.println("-------------");
    for(int i=0;i<3;i++)
    {    
        for(int j=0;j<3;j++)
        {    
            System.out.print(trans[i][j]+" ");    
        }    
        System.out.println();  
    }    
    }
}  
