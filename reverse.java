import java.util.*;

public class reverse {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int num, rev, sum=0;

        System.out.println("enter the number which you want to search : ");
        num = sc.nextInt();

        while(num>0)
        {
            rev = num%10;
            sum = sum*10+rev;
            num = num/10;
        }

        System.out.println("Number is : = " + sum);
    }
}
