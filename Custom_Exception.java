import java.util.Scanner;
class NegativeException extends Exception{
    public NegativeException(String message){
        super(message);
    }
}
public class Custom_Exception{
    static void Numbervalidity(int num) throws NegativeException{   
        if(num<0){
            throw new NegativeException("Number must be postive");
        }
                System.out.println("Number is valid "  +num);
            }
            
public static void main(String[] args) {    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter yor Number:");
    int num=sc.nextInt();
             
 try{
    Numbervalidity(num);
 } 
 catch(NegativeException e){
    System.out.println("Error:" +e.getMessage());
    sc.close();
 }
}
}





        
        
            
