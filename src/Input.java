import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, sum=0;

        System.out.print("Enter number in a: ");
        a = input.nextInt();
        System.out.print("Enter number in b: ");
        b = input.nextInt();
        System.out.print("Enter number in c: ");
        c = input.nextInt();

        if(a>b && a>c)
            System.out.println("a is the biggest number");
        else if(b>a && b>c)
            System.out.println("b is the biggest number");
        else
            System.out.println("c is the biggest number");
    }
}
