import java.util.Scanner;
class Example10
{
	public static void main(String[] args)
	{	
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(Character.isUpperCase(c))
		{
			System.out.println(c+"->"+Character.toLowerCase(c));
		}
		else
		{
			System.out.println(c+"->"+Character.toUpperCase(c));
		}
	}
}
