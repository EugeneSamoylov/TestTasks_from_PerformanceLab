import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in); //scan file name from console
        String fileName = in.nextLine();
        in.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName)); //reading first file
        String str;

        int[] num = new int[250000000];
        int counter = 0;
        String[] numbersString;

        ArrayList<String> list = new ArrayList<String>();
        try {
            while ((str = reader.readLine()) != null) { //read each line separately
                if (!str.isEmpty()) {
                    list.add(str);
                    numbersString = str.split(" "); //dividing the line into an array of string by a space

                    for (String number : numbersString) { //parsing an array of strings into an array of numbers
                        num[counter] = Integer.parseInt(number);
                        counter += 1;
                    }
                }
            }
        } catch (IOException e) {

            System.out.println("Ошибка!");
        }

        int[] numSort = new int[counter]; //create a clean array for sorting
        System.arraycopy(num, 0, numSort, 0, counter);

        Arrays.sort(numSort);

        int sum = 0;
        for (int element : numSort) //sum the difference of each array element with its median
             sum += Math.abs(element-numSort[counter / 2]);

        System.out.println(sum);

    }
}