/**
 * Programmer: 		Christopher Murphy
 * Program/Class: 	Gap Sort/ Gap.java
 * Details:			this class provides the logic behind the sorting actions. It involves methods to determine if an array is in order, and places
 * 					it in order if it is not. It will use a gap method in which the values compared will be five places apart on the array,
 * 					once the array is iterated through, the gap is reduced by two, down to a gap of one.	
 * 
 */
public class Gap {

	public Gap() {

	}

	/**
	 * iterates through the array and swaps the numbers based on which is greater, compares to values spaced apart on the array.
	 * @param data
	 */
	public static void gapSort(int[] data) {
		int scan;
		int gap = 5, size = data.length - 1;

		

		if (isSorted(data) == false) {
			do {
				

				if (gap <= 0)
					gap = 1;
				for (scan = 0; scan <= size - gap; scan++) {
					if (data[scan] > data[scan + gap]) {

						swap(data, scan, scan + gap);
						for (int test : data)
							System.out.print(test + " ");
						System.out.println(" ");
						
					}
				}
				gap-=2;
			} while (isSorted(data) == false);
		}
	}
	
	/**
	 * stores a temporary value to shift the value in one index to another
	 * @param data
	 * @param index1
	 * @param index2
	 */
	public static void swap(int [] data, int index1, int index2) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2 ] = temp;

	}
	
	/**
	 * determines if each value is preceded by a lesser value, that is that the array is in ascending order
	 * @param data
	 * @return
	 */
	public static boolean isSorted(int[] data){
		for(int x = 0; x < data.length-1; x++){
		if(data[x] > data[x+1])
		return false;
		}
		return true;
		} 
}
