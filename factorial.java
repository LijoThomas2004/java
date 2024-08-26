import java.util.Scanner;
public class factorial
{
 public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
int i,n,fact=1;
System.out.println("Enter the number:");
n=sc.nextInt();
sc.close();
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.print("factorial="+fact);
}
}    
      

    

