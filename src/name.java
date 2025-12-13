import java.util.Scanner;

class rectangle{
    int length;
    int breadth;

    public void enter_rect(){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter length: ");
        this.length= sc.nextInt();

        System.out.println("enter breadth: ");
        this.breadth= sc.nextInt();
    }
    public void read(){
        System.out.println("elements of rectangle: ");
        System.out.println(this.length);
        System.out.println(this.breadth);
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class name {
    public static void main(String[] args){

        rectangle r1= new rectangle();

        r1.enter_rect();
        r1.read();
        float area= r1.area();
        System.out.println("area of rectangle: "+area);

        float perimeter= r1.perimeter();
        System.out.println("perimeter of rectangle: "+perimeter);


    }
}
