import java.io.*;
import java.util.*;
public class CharCount
{
  public static void main(String[] args)
  {
    Scanner Char=new Scanner(System.in);
    String s=Char.nextLine();
    int count=0;
    
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=' ')
      count++;
    }
    
    System.out.println("the number of characters in the string:"+" " +count);
  }
}
    
