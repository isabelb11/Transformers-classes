package basics;

public class INterviewQPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "dad";
     System.out.println(isPalindrome(str));
     
	}
   public static boolean isPalindrome(String str) {
	 String rev = "";
	 
	 for(int i = str.length()-1; i>= 0; i--) {
		 rev += str.charAt(i);	 
	 
 }
	 return rev.equals(str);
   }
   
   public static boolean isPalindrome2(String str) {
	   StringBuilder sb = new StringBuilder(str);
	   String rev = String.valueOf(sb.reverse());
	   return rev.equals(str);
   }
   public static boolean isPanlindrome3(String str) {
	   for(int fwr = 0, bck = str.length()-1; fwr < str.length(); bck--) {
		   if(fwr > bck ||)
	   }
	   
   }
}
