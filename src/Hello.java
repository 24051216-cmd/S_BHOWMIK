import java.util.Scanner;


public class Hello {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("enter grade of student: ");
        int grade=sc.nextInt();

        if(grade>=90 && grade <= 100){
            System.out.println("O");
        }
        else if(grade<=89 && grade >=80){
            System.out.println("E");
        }
        else if(grade<=79 && grade >=70 ){
            System.out.println("A");
        }
        else if(grade<=69 && grade >= 60){
            System.out.println("B");
        }
        else if (grade <=59 && grade >=50){
            System.out.println("C");
        }
        else if(grade <=49){
            System.out.println("failed");
        }


    }
}
