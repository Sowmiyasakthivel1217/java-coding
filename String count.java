import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String result=" ";
        for(int i=0;i<input.length();i++)
        {
            char value=input.charAt(i);
            int count = value -'0';  //0-48
            char nextvalue=input.charAt(++i);
            for(int j=0;j<count;j++)
            {
                result+=nextvalue;
            }
            
        }
        System.out.println(result);
        
    }
}