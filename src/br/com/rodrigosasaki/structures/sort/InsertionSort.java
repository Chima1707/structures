package br.com.rodrigosasaki.structures.sort;

import static br.com.rodrigosasaki.structures.util.ArrayUtil.swap;

/**
 * @author Rodrigo Sasaki
 */
public class InsertionSort{
	
	public static <T extends Comparable<T>> void sort(T[] elements){
		sort(elements, 1);
	}
	
	protected static <T extends Comparable<T>> void sort(T[] elements, int h){
		for(int i = 0 ; i < elements.length ; i++){
			for(int j = i ; j > 0 ; j -= h){
				if(elements[j - 1].compareTo(elements[j]) > 0){
					swap(elements, j, j - 1);
				}
			}
		}
	}
	
}