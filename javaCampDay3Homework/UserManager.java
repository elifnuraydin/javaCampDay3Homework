package javaCampDay3Homework;

public class UserManager {
   public void add(User user) {
	   System.out.println(user.getFirstName()+" "+user.getLastName()+" is user added");
   }
	
	public void Multiaddd(User[] users) {
		for(User user:users) {
	add(user);
		}
	}
	
	
}
