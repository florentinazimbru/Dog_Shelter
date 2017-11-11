public class Main {

	public static void main(String[] args) {
	
		Shelter s1 = new Shelter();
		s1.addCage();
		s1.addCage();
		s1.addCage();

		//s1.removeCage(1);
		s1.addCagePosition(2);
		s1.printShelter();
		
}
}