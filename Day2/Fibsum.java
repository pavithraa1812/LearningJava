import java.util.*;

public class Fibsum
{
    static void fun(int n)
    {
        int a=1,b=1,c;
        System.out.print(a+" "+b);
        n=n-2;
        while(n!=0)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            n--;
        }
    }
     public static void main(String []args){
        Scanner n=new Scanner(System.in);
        fun(n.nextInt());
     }
	
}
