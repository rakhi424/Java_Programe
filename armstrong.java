import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int num, sum = 0, save, rev;

        System.out.println("enter the number which you want to search : ");
        num = r.nextInt();

        save = num;

        while(num>0)
        {
            rev = num%10;
            sum = sum + rev*rev*rev;
            num = num/10;
        }

        System.out.println("sum = "+ sum);

        if(save == sum)
        System.out.println("number is a armstrong number.........");
        else
        System.out.println("numbe is not a armstrong number........");
    }
}
