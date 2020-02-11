package Lab6;

import java.util.*;
import java.io.*;

public class Lab6_3 {

    public static void main(String[] args) throws IOException {
        try {
            File fil = new File("data.txt");
            Scanner in = new Scanner(fil);
            int sum = 0, i = 0, j = 0;
            while (in.hasNextLine()) {
                String data = in.nextLine();
                StringTokenizer str = new StringTokenizer(data, " ");
                sum += str.countTokens();
                i++;
                while(str.hasMoreTokens()) {
                    String tat = str.nextToken();
                    j += tat.length();
                }
            }
            System.out.println("The No Of Words: " + sum);
            System.out.println("The No Of Lines: " + i);
            System.out.println("The No Of Characters: " + j);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
