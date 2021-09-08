package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
            boolean repetidos = false;

            for (int i=0; i<a.length; i++){
                for (int j=0; j<b.length; j++){
                    if (a[i]==b[j])
                        repetidos = true;
                        break; 
                }                       
            } 
      
                
		return repetidos;
	}

}
