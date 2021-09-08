package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
        public static char [] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static char findMissingLetter(char[] array) {
            
            int posicionInicial = 0; 
            int tamanoArrayEntrada = 0;
            tamanoArrayEntrada = (array.length)+1;
            for (int i = 0; i < alfabeto.length; i++) {
                if(array[0] == alfabeto[i]){                
                    posicionInicial = i;
                }            
            }
            char [] cadena2 = new char[tamanoArrayEntrada];
            char valor = ' ';

            System.arraycopy(alfabeto, posicionInicial, cadena2, 0, tamanoArrayEntrada);
        
            for (int i=0; i<cadena2.length; i++){
                if (cadena2[i]!=array[i]){
                    valor = cadena2[i];
                    break;
                }                        
            } 
        
          
		return valor;
	}

}
