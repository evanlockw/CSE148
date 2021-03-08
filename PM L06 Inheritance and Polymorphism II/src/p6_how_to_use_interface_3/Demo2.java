package p6_how_to_use_interface_3;

public class Demo2 {

	public static void main(String[] args) {
		Displayable2 duck2 = (str) -> {
			System.out.println(str);
		};
		
		duck2.display("Hello World!");
		duck2.display("Hello!");
		duck2.display("Goodbye!");
	}

}
