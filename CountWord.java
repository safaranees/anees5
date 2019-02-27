import java.io.*;
import java.util.*;
class CountWord
{
  public static void main(String args[])
  {
    Scanner Word=new Scanner(System.in);
    String str=Word.next();
    int count=1;
    for(i=0;i<s.length-1;i++)
    {
      if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
      {
        count++;
      }
    }
    System.out.println("Number of words in a string="+" "+count);
  }
}
