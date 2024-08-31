import java.util.Scanner;
class employe
{
String name,phonenumber,address,department;
int age;
double salary;
employe(String name1,String phonenumber1,String address1,String department1,int age1,double salary1){
name=name1;
address=address1;
age=age1;
department=department1;
salary=salary1;
phonenumber=phonenumber1;
}
void employedetails(){
System.out.println("name:"+name);
System.out.println("phonenumber:"+phonenumber);
System.out.println("address:"+address);
System.out.println("department:"+department);
System.out.println("age"+age);
System.out.println("salary"+salary);
}
}
class officer extends employe {
officer(String name1,String phonenumber1,String address1,String department1,int age1,double salary1) { 
super(name1,phonenumber1, address1,department1,age1,salary1);
}
}
class manager extends officer{
 manager(String name1,String phonenumber1,String address1,String department1,int age1,double salary1){
super(name1,phonenumber1, address1,department1,age1,salary1);   
 }
}
public class inheritance{
public static void main(String[]args){    
Scanner sc=new Scanner(System.in);
String name,phonenumber,address,department;
int age;
double salary;
System.out.println("Enter the details of officer");
System.out.println("Enter the name");
name=sc.next();
System.out.println("Enter the age");
age=sc.nextInt();
System.out.println("enter the phonenumber");
phonenumber=sc.next();
System.out.println("Enter the adddress");
address=sc.next();
System.out.println("enter the department");
department=sc.next();
System.out.println("enter the salary");
salary=sc.nextDouble();

officer o=new officer(name,phonenumber,address,department,age,salary);   
System.out.println("Enter the details of manager");
System.out.println("Enter the name");
name=sc.next();
System.out.println("Enter the age");
age=sc.nextInt();
System.out.println("enter the phonenumber");
phonenumber=sc.next();
System.out.println("Enter the adddress");
address=sc.next();
System.out.println("enter the department");
department=sc.next();
System.out.println("enter the salary");
salary=sc.nextDouble();
manager m=new manager(name,phonenumber,address,department,age,salary);
System.out.println("details of officer");
o.employedetails();
System.out.println("details of manager");
m.employedetails();
}
}




    




