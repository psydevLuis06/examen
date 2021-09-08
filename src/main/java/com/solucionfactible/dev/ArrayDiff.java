package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
//            ArrayList<Integer> al = new ArrayList<Integer>();
//            al = a ;
//                for (int i=0; i<a.length; i++){
//                for (int j=0; j<b.length; j++){
//                    if (a[i]==b[j])
//                        //removeTheElement(a,a[i]);
//                        al.remove(i);
//                        //System.Out.Println(a[i]);
//                        
//                        break; 
//                }                       
//            } 
//      
	//	return al;
                return a;
	}


public static int[] removeTheElement(int[] arr, int index)
    {
  
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
            || index < 0
            || index >= arr.length) {
  
            return arr;
        }
  
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
  
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
  
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
  
            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }
  
        // return the resultant array
        return anotherArray;
    }

}
