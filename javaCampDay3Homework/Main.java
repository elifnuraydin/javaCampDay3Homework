package javaCampDay3Homework;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin ");
		instructor1.setLastName("Demirog");
		instructor1.setUserId(1);
		instructor1.setId(1);

		User user1 = new User(3, "Ahmet", "Yilmaz", "ahmet.yilmaz799@hotmail.com", "ahmet123456789");

		Student student1 = new Student();
		student1.setFirstName("Elifnur");
		student1.setLastName("Aydin");
		student1.setEmail("elifnraydn@gmail.com");
		student1.setId(2);
		student1.setUserId(1);

		Student student2 = new Student("Ayse", "Kaya", 3);
		student2.setEmail("Aysekayaa@outlook.com");
		student2.setId(4);


		UserManager userManager = new UserManager();
		userManager.add(student2);
		User users[] = { user1, student1, student2 };
		userManager.Multiaddd(users);

		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCouse(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.changedFirstName(student1);

	

	}

}
