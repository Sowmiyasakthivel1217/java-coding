import java.util.Scanner;

public class WordLength
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println("Length of \"" + word + "\": " + word.length());
            if (word.length() % 2 == 0) {
                System.out.println("Word with even length: " + word);
            }
        }
    }
}
