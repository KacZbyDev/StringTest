import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        String middle = "";
        String beggin = "";
        String end = "";
        if( test.length() > 2) {
            middle = test.substring((test.length() /2)-1, (test.length()/2) +1);
            beggin = test.substring(0,test.length()/2 -1);
            end = middle +  beggin + test.substring((test.length()/2) +1);
        }
        System.out.println(end);
    }

}