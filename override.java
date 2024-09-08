import java.util.Scanner;
class Employe{
double DA,HRA,salary1,salary;
Employe(double salary,double HRA,double DA){
this.salary=salary;
this.DA=DA;  
this.HRA=HRA;
}  
void display(){
System.out.println("Employee....");
}
void calc(){
salary1=salary+salary*(DA/100)+salary*(HRA/100);
System.out.println("Gross salary=" +salary1);
}}
class Engineering extends Employe{
Engineering(double salary,double HRA,double DA){  
super(salary,HRA,DA);}
void display(){
super.display();
super.calc();
System.out.println("Engineering....");
}
void calc(){
System.out.println("Gross salary of engineer="+salary1*2);
}}
public class override {
public static void main(String[] args) {
double salary,HRA,DA;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the basic salary of Employe:");
salary=sc.nextDouble();
System.out.print("Enter DA% of Employe:");
DA=sc.nextDouble();
System.out.print("Enter HRA% of Employe:");
HRA=sc.nextDouble();
Engineering m=new Engineering(salary,HRA,DA);
m.display();
m.calc();
sc.close();
}}

    
    






    
