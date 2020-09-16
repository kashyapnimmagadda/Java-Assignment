package program4;
//4.	write a Java program to search for an element of an integer array of 10 elements
public class Search {
	public int searching(int[] array, int element){
		int index=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==element){
				
				index++;
				break;
			}
		}
		return index;
	}
}
