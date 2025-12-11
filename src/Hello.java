import java.util.Scanner;

class Student{
    String name;
    int roll_no;
    String section;
    String branch;
    public void info(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name: ");

        this.name=sc.next();

        System.out.println("enter roll number: ");
        this.roll_no=sc.nextInt();

        System.out.println("enter section: ");
        this.section=sc.next();

        System.out.println("enter branch: ");
        this.branch=sc.next();


            }
    public void Student_info(){
        System.out.println("Student details are: ");
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.section);
        System.out.println(this.branch);
    }

}

public class Hello {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Student student1= new Student();

        student1.info();

        student1.Student_info();
    }
}
