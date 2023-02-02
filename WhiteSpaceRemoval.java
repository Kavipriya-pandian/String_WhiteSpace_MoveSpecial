package dxc;

public class WhiteSpaceRemoval {
	static void removeWhiteSpaces(String str)
	{
		String s1=new String("India is my country");
		s1=s1.replaceAll(" ","");
		System.out.println("White Space Removal String :"+s1);
		
	}
	
	
	static void moveSpecialCharacters(String str)
	{
		String input="!@#$Wel$%&*Come*()^%";
		String regex="[a-zA-Z0-9\s+]";
		String specialChars = "";
	      String inputData = "";
		for(int i=0; i< input.length(); i++) 
		{
	         char ch = input.charAt(i);
	         if(String.valueOf(ch).matches(regex)) 
	         {
	            inputData = inputData + ch;
	         } else 
	         {
	            specialChars = specialChars+ ch;
	         }
	      }
	      System.out.println("Moving Special Characters to the end of the String "+inputData+specialChars);

	}

	public static void main(String[] args)
	{
		
		String str = null;
		removeWhiteSpaces(str);
		moveSpecialCharacters(str);

	}

	
}
