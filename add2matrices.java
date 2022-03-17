import java.util.Scanner;
public class add2matrices 
{
      
    public static void main(String args[])
    {   
        int r,c,i,j;
        int arr1[][] = new int[10][10];
        int arr2[][] = new int[10][10];
        int arr3[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter Total number of rows: ");
        r = sc.nextInt();
        System.out.println("Enter Total number of columns: ");
        c  = sc.nextInt();
        System.out.println("Enter  "+r * c+" elements for matrix 1");
        for (i=0;i<r;i++)
        for (j=0;j<c;j++)
        arr1[i][j] = sc.nextInt();
  
        System.out.println("Enter  "+r * c+" elements for matrix 2 ");
        for (i=0;i<r;i++)
        for (j=0;j<c;j++)
        arr2[i][j] = sc.nextInt();
        System.out.println("*******************************");
        System.out.print("***The addition of Matrix 1 and Matrix 2 is Matrix 3***\n"); 
        for(i=0;i<r;i++)
        {    
            for(j=0;j<c;j++)
            {     
                System.out.print("\t"+arr1[i][j]+"  ") ;
            }    
            System.out.println(" ");  
        } 
        System.out.println(" + \n"); 
        for(i=0;i<r;i++)
        {    
            for(j=0;j<c;j++)
            {     
                System.out.print("\t"+arr2[i][j]+"  ") ;
            }    
            System.out.println(" ");  
        } 
        System.out.println(" = \n"); 
        System.out.println("--------------------------");
        for(i=0;i<r;i++)
        {    
            for(j=0;j<c;j++)
            {    
                arr3[i][j]=arr1[i][j]+arr2[i][j];   
                System.out.print("\t"+arr3[i][j]+"  ") ;
            }    
            System.out.println();  
        }    
        System.out.println("*******************************");
    }
}
