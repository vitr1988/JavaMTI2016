
public class Specitality {

	public static void main(String[] args) {
		
		double var = 0.44;
		System.out.println(0.44 == var);
		System.out.println(24 * 0.1 == 2.4);
		
		String color = "red";
		switch (color){
			case "red" : {
				System.out.println("red");
			}
			case "blue" : {
				System.out.println("blue");
			}
			case "white" : {
				System.out.println("white");
			}
			case "green" : {
				System.out.println("green");
			}
			default : {
				System.out.println("no color!");
			}
		}
		
		M1 : {
			int i = 5 * 10;
			for (;;) {
				for (int index = 0; index < i; index++ ){
					if (index > 25) break;
				}
				break;
			}
//			System.out.println("no color!");
		}
//		System.out.println("first action!");
	}

	class A {
		int f(){
			return -1;
		}
	}
	
	class B extends A {
		int f (){
			return 0;
		}
	}
	
	class C extends A {
		int f (){
			return 1;
		}
	}
	
//	class D extends B, C {
//		
//	}
}
