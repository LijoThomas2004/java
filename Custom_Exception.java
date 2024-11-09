import java.util.Scanner;
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}
public class Custom_Exception{
    static void Agevalidity(int age) throws AgeException{   
        if(age<18){
            throw new AgeException("Age must be above 18 years");
        }
                System.out.println("Age is valid  " +age);
            }
            
public static void main(String[] args) {    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter yor age:");
    int age=sc.nextInt();
             
 try{
    Agevalidity(age);
 } 
 catch(AgeException e){
    System.out.println("Error:" +e.getMessage());
    sc.close();
 }
}
}





        
        
            
