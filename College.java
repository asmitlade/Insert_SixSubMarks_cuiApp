import java.util.Scanner;
class College {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Scanner sc = null;
		Student s1 = new Student();
		System.out.print("Enter English Marks :");
		s1.setEngMarks(sc.nextDouble());
		System.out.print("Enter Hindi Marks :");
		s1.setHindiMarks(sc.nextDouble());
		System.out.print("Enter Marathi Marks :");
		s1.setMarathiMarks(sc.nextDouble());
		System.out.print("Enter Mathematics Marks :");
		s1.setMathMarks(sc.nextDouble());
		System.out.print("Enter Science Marks :");
		s1.setScienceMarks(sc.nextDouble());
		System.out.print("Enter Social Science Marks");
		s1.setSocialMarks(sc.nextDouble());
		s1.display();
	}
}