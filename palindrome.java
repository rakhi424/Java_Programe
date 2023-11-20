import java.util.*;

/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, rev, save;

        System.out.println("enter the number which you want to search : ");
        num = sc.nextInt();

        save = num;
        
        while(num>0)
        {
            rev = num%10;
            sum = sum*10+rev;
            num = num/10;
        }

        System.out.println("sum = "+ sum);

        if(sum == save)
        System.out.println("number is a palindrome number.......");
        else
        System.out.println("number is not a palindrome number.....");
    }
}