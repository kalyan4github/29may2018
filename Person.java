
public class Person {

	 String firstName;
	 
	public void setFirstName(String fName){
		this.firstName = fName;
	}
	public String getFirstName(){
		return this.firstName;
	}


	/*Person(){
		this.name="Kalyan mazumder";
	}*/
		public static void main(String[] args) {

			Person p = new Person ();
			//p.firstName = "Hardiki";
			p.setFirstName("Kalyan");
			
			System.out.println(p.getFirstName());
		



		/*G:\RISHI\bbt_pro\bbi_collabdemo>javac Person.java

          G:\RISHI\bbt_pro\bbi_collabdemo>java Person
               Kalyan	

                */ 
		}

}
