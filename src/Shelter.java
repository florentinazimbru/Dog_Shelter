import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Shelter {
	
	private static final Scanner SCANNER = new Scanner(System.in);
	String Name;	//Shelter name 
	List<Cage> cages =new ArrayList<Cage>(); 	// Cages Array, will store all the Cages form the Shelter
	
	public Shelter() {
		super();
		System.out.println("Enter a shelter name"); 
		this.Name =SCANNER.next();
		this.cages = null;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
		
	}
	
	public void printShelter () {
		System.out.println("Shelter name: " + this.Name);
		if (cages != null){
			for (int i=0; i<cages.size(); i++){
				this.cages.get(i).printCage(i);
			}	
		}
		else {
			System.out.println("This shelter has no cages!");
		}
	}
	
	public void addCage() {
		System.out.println("Please insert a cage Id");
		int cageIdInput = SCANNER.nextInt(); //input cage id	
		if(this.cages == null)
		{
		
	
			this.cages = new ArrayList<Cage>();
			this.cages.add(new Cage(cageIdInput,0,false,"large"));
		}
		else
		{
			this.cages.add(new Cage(cageIdInput, 0,false,"large")); // add a new cage to cages list	
		}
		System.out.println("New cage added at cages list");
		
	}
	
	public void removeCage(int cageId){
		for (int i=0; i<this.cages.size(); i++){
			
			if (this.cages.get(i).cageID == cageId){
				System.out.println("You want to delete cage: " + this.cages.get(i).cageID );
				this.cages.remove(this.cages.get(i));
			
			}
		}
		
	}
}
