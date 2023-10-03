/**
 * 
 */
package loopsLabExercises;

/**
 * nested for loop
 */
public class Part3Q8 {

	/**
	 * expected output: 1, *2, *3, *4, *5, *6, *7, *8, *9, *10 1, **2, **3, **4,
	 * **5, **6, **7, **8, **9, **10 1, ***2,* **3,* **4,* **5,* **6,* **7,* **8,*
	 * **9,* **10
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		// counter for number of stars to produce
		for (int i = 1; i <= 3; i++) {
			
			//counter for number to output
			for (int i1 = 1; i1 <= 10; i1++) {
				
				//counter for number of stars to append to sb
				for (int i2 = 1; i2 <= i; i2++) {
					sb.append("*");
				}
				sb.append(i1);
				
				//only appends ", " in gaps between i
				if (i1 < 10) {
					sb.append(", ");
				}
			}
			
			//outputs i1 = 1 - 10
			// then increments i (star counter)
			// and begins again
			System.out.println(sb.toString());
			sb.setLength(0);
		}

	}

}
