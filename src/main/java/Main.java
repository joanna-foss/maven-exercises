import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");

        String input = scanner.nextLine();

        boolean isStrNum = StringUtils.isNumeric(input);
        String flippedCase = StringUtils.swapCase(input);
        String reversedStr = StringUtils.reverse(input);

        System.out.println("isStrNum = " + isStrNum);
        System.out.println("flippedCase = " + flippedCase);
        System.out.println("reversedStr = " + reversedStr);
    }
}
