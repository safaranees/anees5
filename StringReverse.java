import java.io.*;
import java.util.*;
public StringReverse
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING TO REVERSE");
        String str,revnum="  ";
        str=s.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
              revnum=revnum+str.CharAt(i);
         }
         System.out.println("The Reversed Number is",revnum);
     }
}
         
