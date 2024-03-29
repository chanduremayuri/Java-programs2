import java.util.Scanner;
class PalindromeString
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the name : ");
		 String name = sc.next().toUpperCase();
		 String revName = " ";
		 for (int i = name.length()-1; i>=0 ; i--)
		 {
		 	revName = revName + name.charAt(i);
		 }
		 System.out.println((revName.equals(name))?name +"is a palindrome ." : name + " is not a palindrome .");
	}
}