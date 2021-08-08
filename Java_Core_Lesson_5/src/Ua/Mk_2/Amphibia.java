package Ua.Mk_2;

public class Amphibia {
	
	public  void eat () {
		System.out.println("Жаби їдять комарів");
	}
	public void sleep () {
		System.out.println("Жаби вбадають у зимову сплячку");
	}
	public void swim () {
		System.out.println("Жаби вміють плавати");
	}
	public void walk () {
		System.out.println("Жаби в основному плавають або гріються на сонці");
		
	}

	public String toString() {
		return "Amphibia [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
