/**
 * 
 * @author Aime Byiringiro
 *
 * @param <K>
 * 
 * This class sorts the array of words by selection sort
 */
public class SelectionSort<K extends Comparable<K>> {
	K[] arrayWords;
	int counter = 0;
	long runtime;
	
/**
 * Class constructor 
 * @param arrayWords // array to be sorted. 
 */
	SelectionSort(K[] arrayWords) {
		this.arrayWords = arrayWords;
	}
/**
 * This is the calling method of the class
 * It also calculats the run time. 
 */
	public void sortList() {
		long startTime = System.currentTimeMillis();
		selectionSort(arrayWords);
		long endTime = System.currentTimeMillis();
		runtime = endTime - startTime;
		System.out.println();
		
	}
/**
 * This methods sorts the array of words by selection sort. 
 * @param arr // the array to be sorted. 
 */
	private void selectionSort(K arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				counter++;
				if (arr[j].compareTo(arr[min_idx]) < 0) {
					min_idx = j;
				}
			}
			K temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

        print(arr);
	}

	/**
	 * This method method is not used. It's only for checking  purpose. 
	 * @param S
	 */
	private void print(K[] S) {
		for (K i : S) {
			System.out.print(i + " ");
        }
        
	}

	public static void main(String[] args) {
        Integer[] unSortedArray1 = {1, 5, 47, 3, 0, 3, 4}g;
        String[] unSortedArray2 = {"USA", "Japan", "japan", "Rwanda", "Germany", "India", "France", "usa"};
    
        SelectionSort<Integer> myProject1 = new SelectionSort<>(unSortedArray1);
        SelectionSort<String> myProject2 = new SelectionSort<>(unSortedArray2);
        myProject1.sortList();
        myProject2 .sortList();
    }
    

}
