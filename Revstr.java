import java.io.*;
import java.util.*;
import java.lang.*;
public class Revstr
{
        public static void main(String args[])
        {
                Scanner s=new Scanner(System.in);
                String str=s.nextLine();
                StringBuffer  revnum = new StringBuffer(s);
                System.out.println(revnum.reverse());
        }
}
