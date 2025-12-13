import java.util.Scanner;




public class q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int arr[] = new int[10];
        System.out.println("enter 10 inputs: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the even elements are: ");
        for(int i=0;i<10;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}