public class Palindrom{
	public static void main (String args[])
	{
	String ss = "eyo";
	
	String rev = "";

	for(int i= ss.length() - 1; i >= 0; i--){
		rev += ss.charAt(i);
		}	
	if(rev.equals (ss)){
	System.out.println("String is Palindrom");
	} else {
	System.out.println("String is not Palindrom");	
	}
   }
}