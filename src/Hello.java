import java.util.Scanner;

/*


public class Hello {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}*/

//2

class Box{
    int height;
    int breadth;
    int length;

    public void volume(){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter height: ");
        this.height= sc.nextInt();

        System.out.println("enter length: ");
        this.length= sc.nextInt();

        System.out.println("enter breadth: ");
        this.breadth= sc.nextInt();

        int volume= height*length*breadth;

        System.out.println("Volume="+volume);
    }
}

public class Hello {
    public static void main(String[] args){
        Box box1= new Box();
        box1.volume();
    }
}