package first;

public class HelloWorldModification1 {

	HelloWorldModification1() {

	}

	static void starLinePrint(int numberOfStars) {
		int totalWidth = 11;
		int totalBlankSpace = totalWidth - numberOfStars;

		int blankSpaceOnEachSide = totalBlankSpace / 2;

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < blankSpaceOnEachSide; i++) {
			str.append(" ");
		}

		for (int i = 0; i < numberOfStars; i++) {
			str.append("*");
		}

		for (int i = 0; i < blankSpaceOnEachSide; i++) {
			str.append(" ");
		}

		System.out.println(str.toString());
	}
	
	
	static void xmasTree(int heightOfXmasTree) {
		for (int i = 1; i < heightOfXmasTree * 2  ; i = i+2 ) {
			int numberOfStars = i;
			starLinePrint(numberOfStars);
			System.out.println();
		}
		System.out.println("Happy Christmas");
	}

	public static void main(String[] args) {

//		System.out.println("Hello\tworld!");
//		System.out.println("This\tis\ta\ttab\texample.");
		

		String helloAlive = "Hello World! I am alive";

		System.out.println(helloAlive);
		System.out.println();
		System.out.println(
				helloAlive + "\nI can write on two lines!" + "\n\n" + helloAlive + "\n\nI can write on two lines!");
		
		System.out.println();
		
		xmasTree(5);
		
		
		System.out.println("\n\n\n");
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("First Witch" + "\t" + "When shall we three meet again?"
				+ "\n" + "\t\t" + "In thunder, lightning or in rain?");
		
		System.out.println();
		
		System.out.println("Second Witch" + "\t" + "When the hurlyburly's done,"
				+ "\n" + "\t\t" + "When the battle's lost and won.");
		
		System.out.println();
		
		System.out.println("Third Witch" + "\t" + "That will be ere the set of sun");
		
		System.out.println("-----------------------------------------------------");
	}

}
