package Ua.Mk;

public abstract class Pet {
	abstract void voice();
	public static void main(String[] args) {
		
		Cow Cow = new Cow ();
		Cat Cat = new Cat ();
		Dog Dog = new Dog ();
		Cow.voice();
		Cat.voice();
		Dog.voice();
		
		
		
	}
}
