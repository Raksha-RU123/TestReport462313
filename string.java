package oops;

public class string 
{
	public static void main(String[] args) 
	{
		String str= "Constructs a new string by decoding the specified subarray of bytes using the charset";
		int count=0;
		char search='s';
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==search)
				count++;
		}
		System.out.println("Total number of character s in the string is: "+count);
		System.out.println("First occurence of character s is at position: "+str.indexOf(search));
		System.out.println("Last occurence of character s is at position: "+str.lastIndexOf(search));
	}
}
