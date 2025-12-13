import java.util.Scanner;
class box{
    int height;
    int breadth;
    int length;
    public int volume(){
        return height*length*breadth;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        box b = new box();

        System.out.print("Enter length: ");
        b.length = sc.nextInt();

        System.out.print("Enter width: ");
        b.breadth = sc.nextInt();

        System.out.print("Enter height: ");
        b.height = sc.nextInt();

        double vol = b.volume();

        System.out.println("Volume of the box = " + vol);

        sc.close();
    }
}
