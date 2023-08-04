
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader = new BufferedReader(new FileReader("Text1.txt")); //reading first file
        String str;

        double[] numbers = new double[3];
        int counter = 0;
        String[] numbersString;

        ArrayList<String> list = new ArrayList<String>();
        try {
            while ((str = reader.readLine()) != null) { //read each line separately
                if (!str.isEmpty()) {
                    list.add(str);
                    numbersString = str.split( " " ); //dividing the line into an array of string by a space

                    for(String number : numbersString){ //parsing an array of strings into an array of numbers
                        numbers[counter] = Double.parseDouble(number);
                        counter += 1;
                    }
                }
            }
        } catch (IOException e) {

            System.out.println("Ошибка!");
        }


        reader = new BufferedReader(new FileReader("Text2.txt"));  //reading second file

        double[] numbers2 = new double[2];

        try {
            while ((str = reader.readLine()) != null) {
                if (!str.isEmpty()) {
                    list.add(str);
                    numbersString = str.split( " " );

                    counter = 0;

                    for(String number2 : numbersString){
                        numbers2[counter] = Double.parseDouble(number2);
                        counter += 1;
                    }

                    double ox, oy, r, x1, y1;

                    ox = numbers[0]; oy = numbers[1];
                    r = numbers[2];

                    x1 = numbers2[0]; y1 = numbers2[1];

                    double vec; //vector length calculations
                    vec = Math.sqrt(Math.pow((ox - x1), 2) + Math.pow((oy - y1),2));

                    if (vec == r)
                        System.out.print("0\n");
                    if (vec < r)
                        System.out.print("1\n");
                    if (vec > r)
                        System.out.print("2\n");

                }
            }
        } catch (IOException e) {

            System.out.println("Ошибка!");
        }

    }
}
