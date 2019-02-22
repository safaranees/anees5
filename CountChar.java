class CountChar
{
	public void count(String str)
	{
		char[] ch=str.toCharArray();
		for(i=0;i<ch.length();i++)
		{
			String s=" ";
			while(i<ch.length() && ch[i]=' ')
			{
				s=s+ch[i];
				i++;
			}
			if(s.length>0)
			{
				System.out.println(s.length());
			}
		}
	}
public static void main(String args[])
{
 	Scanner ss=new Scanner(System.in);
   String str=ss.nextLine();
	count(str);
}
}
