import java.util.Scanner;

public class Letter 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] words = input.split("\\s+");
        for (String word : words) 
        {
            if (!word.isEmpty())
            {
                char firstLetter = word.charAt(0);
                System.out.print(firstLetter + " ");
            }
        }
    }
}
