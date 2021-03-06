package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	public static boolean isValid(String pin) {

            boolean resultado = false;
            if (pin.matches("^\\d+$")) {
                int numCaracter = pin.length();
                if(numCaracter == 4 || numCaracter == 6){
                    resultado = true;
                }else{
                    resultado = false;
                }
            }else {
                resultado = false;
            }
		return resultado;
	}

}
