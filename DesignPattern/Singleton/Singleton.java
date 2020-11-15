package tutorial;

public class Singleton {

	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1 == c2);
	}

}
class Company {
	private static Company instance = new Company();
		
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}