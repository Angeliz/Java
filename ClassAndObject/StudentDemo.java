import std.info.Student;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name="Tom";
		System.out.println(s.name);
		s.number=700;
		System.out.println(s.number);
		s.sexual="man";
		System.out.println(s.sexual);
		s.age=17;
		System.out.println(s.age);
		
		s.setName("Tom");
		System.out.println(s.getName());
		s.setNumber(700);
		System.out.println(s.getNumber());
		s.setSexual("man");
		System.out.println(s.getSexual());
		s.setAge(17);
		System.out.println(s.getAge());
	}

}
