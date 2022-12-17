public class palindrome_py 
{
    public static void main(String arg[]) 
    {
        int n=5;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--) 
            {
                System.out.print(k);
                
            }
            for(int o=2;o<=i;o++)
            {
                System.out.print(o);
            }
            System.out.println();
        }
    }

}