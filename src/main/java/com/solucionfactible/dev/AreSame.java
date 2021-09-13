package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same
 * multiplicities. "Same" means, here, that the elements in b are the elements
 * in a squared, regardless of the order.
 *
 * @author developer
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        boolean resultado = false;
        int largoCadenaA = 0, largoCadenaB = 0;
        double ValorArray = 0;
        String ValorArrayString = "";

        largoCadenaA = a.length;
        largoCadenaB = b.length;

        if (largoCadenaA == largoCadenaB) {
            double valor1 = 0;
            valor1 = Math.sqrt(b[0]);
            String cadena = String.valueOf(valor1);
            if (cadena.matches("^[0-9]+([.][0]+)?$")) {
                if (a[0] == b[0]) {
                    for (int i = 0; i < b.length; i++) {
                        if (i == 0) {
                        } else {
                            ValorArrayString = "";
                            ValorArray = 0;
                            ValorArray = Math.sqrt(b[i]);
                            if (ValorArray == (a[i - 1])) {
                                i++;
                                resultado = true;
                            } else {
                                resultado = false;
                            }
                        }
                    }
                } else {
                    resultado = false;
                }

            } else {
                resultado = false;
            }
        } else {
            resultado = false;
        }

        return resultado;
    }

}
