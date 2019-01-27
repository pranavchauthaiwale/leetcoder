import java.util.Scanner;

public class JavaEssentials {

    public static void main(String[] args){

        System.out.println("Hello World");

        String sampleString = "This is a sample string";

        char[] arr = sampleString.toCharArray();

        System.out.println((char)( 2 +  'A' + 2) );

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println(s);
    }
}
