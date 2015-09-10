/**
 * Programmer: 		Christopher Murphy
 * Program/Class: 	Gap Sort/ GapSortDriver.java
 * Details:			In this class, the array to be sorted is instantiated, and a few lines of text guide the user through the operation
 * 					that is performed, a gap sort. 
 */
public class GapSortDriver {
public static int [] testArray= {11,26, 8, 365, 338, 296, 3, 2, 87, 7, 6, 56, 22, 76, 14};

	
	public GapSortDriver() {
		
	}

	public static void main(String[] args) {
	
		/**
		 * user prompt
		 */
		System.out.println("This is an array that is out of order, and is sorted using a gap sort\nstarting at a gap of five places, incrementing the gap by two per iteration.  ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("The original array is: ");
		
		for (int test : testArray)
			System.out.print(test + " ");
		System.out.println(" ");
		
		/**
		 * user prompt
		 */
		System.out.println("\nBegin gap sort: ");
		
		/**
		 * operation to sort the array
		 */
		Gap.gapSort(testArray);
		
		
		/**
		 * user prompt
		 */
		System.out.println(" ");
		System.out.println("Final sorted array is: ");
		for (int test : testArray)
			System.out.print(test + " ");
		System.out.println(" ");
		System.out.println(" ");
		
	}

	
}
