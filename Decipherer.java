import java.util.Arrays;

public class Decipherer {
 public static String Dechiffrer(String chaine)
 {
	 int length = chaine.length()/2;
	 String extract = "";
	 for(int  i = 5; i < length+5; i++)
	 {
		 extract += chaine.charAt(i);
	 }
	 extract = extract.replace("@#?"," ");
	 String result = "";
     for(int i = extract.length() - 1; i >= 0; i--)
	 {
		result += extract.charAt(i);
	 }
	 return result;
	 
 }
 public static void main(String [] args)
 {
	 System.out.println(Dechiffrer("0@sn9sirppa@#?ia'jgtvryko1"));
	 System.out.println(Dechiffrer("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
	 System.out.println(Dechiffrer("aopi?sedohtém@#?sedhtmg+p9l!"));
 }
}