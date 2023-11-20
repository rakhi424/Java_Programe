import java.util.*;

class fibonachhi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int i, s=1, x=0, y=1, num;

        System.out.println("enter the number : ");
        num = sc.nextInt();

        for(i=1; i<=num; i++)
        {
            System.out.println("\n"+s);

            s= x+y;
            x= y;
            y= s;
        }
    }
}
