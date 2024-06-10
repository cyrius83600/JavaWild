public class Wilder {
 String firstname;
 boolean aware;
 
 public Wilder(String firstname, boolean aware)
 {
	 this.firstname = firstname;
	 this.aware = aware;
 }
 
 public String getFirstname()
 {
	 return this.firstname;
 }
 
 public boolean getAware()
 {
	 return this.aware;
 }
 
 public void setFirstname(String firstname)
 {
	 this.firstname = firstname;
 }
 
 public void setAware(boolean aware)
 {
	 this.aware = aware;
 }
 
 public String whoAmI()
 {
	 if(aware)
		 return "Je m'appelle " + this.firstname + " et je suis aware";
	 return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
 }
}