import java.util.*;

class krishnamurti{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, rev, i, save, f;

        System.out.println("enter the number which you want to search : ");
        num = sc.nextInt();

        save = num;

        while(num>0)
        {
            rev = num%10;
            f = 1;
            for(i=1; i<=rev; i++)
            {
                f = f*i;
            }
            sum = sum + f;
            num = num/10;
        }

        System.out.println("number = "+sum);

        if(save == sum)
        System.out.println("number is a krishnamurti number....");
        else
        System.out.println("number is not a krishnamurti number.....");
    } 
}