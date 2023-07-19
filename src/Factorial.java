import java.util.Scanner;
public class Factorial {
    static int fact(int number)
    {
        if(number==1)
        {
            return 1;
        }
        return fact(number-1)*number;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fact(n));
    }
}
