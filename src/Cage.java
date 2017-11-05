
public class Cage {
	int cageID;		// store the cageID
	int dogID;		// store the dogID if is not empty, otherwise 0
	boolean clean_flag;	// true if cage is clean, otherwise false
	String size;		// size of the cage
	
	public Cage (){
		super();
		this.cageID = 0;
		this.dogID = 0;
		this.clean_flag = false;
		this.size = null;
	}

	public Cage(int cageID, int dogID, boolean clean_flag, String size) {
		super();
		this.cageID = cageID;
		this.dogID = dogID;
		this.clean_flag = clean_flag;
		this.size = size;
	}
	


	public int getCageID() {
		return cageID;
	}

	public void setCageID(int cageID) {
		this.cageID = cageID;
	}

	public int getDogID() {
		return dogID;
	}


	public void setDogID(short dogID) {
		this.dogID = dogID;
	}


	public boolean isClean_flag() {
		return clean_flag;
	}
	
	public void setClean_flag(boolean clean_flag) {
		this.clean_flag = clean_flag;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	
	public void printCage(int i) {
		System.out.println("Cage: " + i + 
				" Cage Id: " + this.getCageID() + 
				" Dog_Id: " + this.getDogID() + 
				" Clean: " + this.isClean_flag() + 
				" Size: " + this.getSize()); 
	}
	
	
	
	}
