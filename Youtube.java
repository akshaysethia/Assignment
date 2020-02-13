import java.util.*;

public class Youtube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The YouTube Link: ");
        String str = in.next();
        System.out.println("The Youtube Link is: ");
        System.out.println("youtu.be/" + str.substring(32));
        in.close();
    }
}