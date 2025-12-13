import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    float cgpa;

    public void Student_info() {
        Scanner sc = new Scanner(System.in);


        System.out.print("enter roll_no: ");
        this.roll_no = sc.nextInt();
        sc.nextLine();

        System.out.print("enter name: ");
        this.name = sc.nextLine();

        System.out.print("enter cgpa: ");
        this.cgpa = sc.nextFloat();
    }
    public void print_info(){
        System.out.println(this.roll_no);
        System.out.println(this.name);
        System.out.println(this.cgpa);
    }


}

public class student_cgpa {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();

        Student[] s= new Student[n];
        for(int i=0;i<n;i++){
            s[i]=new Student();
            System.out.println("enter details of student "+ (i+1));
            s[i].Student_info();
        }
        System.out.println("student details are: ");
        for (int i=0;i<n;i++){
            s[i].print_info();

        }
        int minindex=0;
        for(int i=0;i<n;i++){
            if(s[i].cgpa<s[minindex].cgpa){
                minindex=i;
            }
        }
        System.out.println("lowest cgpa: "+ s[minindex].name);

    }
}
