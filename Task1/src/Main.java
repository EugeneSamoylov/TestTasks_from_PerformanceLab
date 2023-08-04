import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i, j, m , n;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        in.close();

        i = m;
        j = 0;

        System.out.println("1");

        while ((i != 1) && (j != 1))
        {
            if (i <= n)
                System.out.println(i);
            if (i > n)
            {
                while (i > n)
                    i = i - n;
                j = i;
                if (i != 1)
                    System.out.println(i);
            }
            i = i + m - 1;
        }
    }
}