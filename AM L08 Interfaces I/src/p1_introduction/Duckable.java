package p1_introduction;

// an interface is not a concrete class, therefore cannot be instantiated.
public interface Duckable {
	
	// all variables are public, static, final
	double WEIGHT = 10.0; 
	int AGE = 1;
	
	// all methods are public and abstract
	void swim();
	void quack();
	void fly();

}
