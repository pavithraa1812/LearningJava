import java.util.Scanner;

public class funmatrix {

    public static void fun(int[] a,int size,int n)
    {
        for (int j = 0; j < size; j++)
        {
                int temp=a[0];
                for (int i = 0; i < n - 1; i++)
                    a[i] = a[i + 1];
                a[n-1] = temp;
            print(a,n);
            }
    }

    public static void print(int[] a,int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();

    }

    public static void main(String[]args)
    {
        int[] a = new int[20];
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            a[i] =i;
        print(a,n);
        fun(a,n-1,n);

    }
}
