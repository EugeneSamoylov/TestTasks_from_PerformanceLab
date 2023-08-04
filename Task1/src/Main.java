import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i, j, m , n;

        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        in.close();

        i=m;
        j = 0;

        System.out.print("1");

        while ((i != 1) && (j != 1))
        {
            if (i <= n)
                System.out.print(i);
            if (i > n)
            {
                while (i > n)
                    i = i - n;
                j = i;
                if (i != 1)
                    System.out.print(i);
            }
            i = i + m - 1;
        }
    }
}