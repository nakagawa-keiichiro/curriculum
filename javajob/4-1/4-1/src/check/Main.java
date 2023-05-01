package check;

import constants.Constants;

public class Main {	
	
	private String firstName;
	private String lastName;
	
	public Main(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main Name = new Main("中川","景一朗");
		printName(Name.firstName,Name.lastName);
		
		Constants name = new Constants();
		
		Pet pet = new Pet(name.CHECK_CLASS_JAVA,name.CHECK_CLASS_HOGE);
		
		pet.introduce();
		
		RobotPet rp = new RobotPet(name.CHECK_CLASS_R2D2,name.CHECK_CLASS_LUKE);
		
		rp.introduce();
		
	}
	
	private static void printName(String firstName,String lastName) {
		System.out.println("PrintNameメソッド → " + firstName + lastName );
	}
}
