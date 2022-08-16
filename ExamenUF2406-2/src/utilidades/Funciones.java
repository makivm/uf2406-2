/**
 * @author Macarena Villalba
 * Clase creada para desarrollar funciones sobre operaciones/comprobaciones de numeros enteros.
 */

package utilidades;

public class Funciones {
	/**
	 *Funcion que calcula cual es el numero que ocupa la posicion central (segun su valor) de los 3 numeros pasados como parametros
	 *Es decir, si tenemos los numero 3,1 y 4, debe devolver 3.
	 *@param pasamos 3 numeros enteros
	 *@return devuelve numero que ocupa dicha posicion
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	

	/**
	 *Funcion que calcula devuelve true si el año pasado como parametro es bisiesto. 
	 *este año debe estar comprendido entre 1700 y 2500; en caso contrario, se controla mediante excepcion
	 *@param pasamos año entero
	 *@throws puede devolver ArithmeticException
	 *@return devuelve boolean sobre si es o no bisiesto
	 */
	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
}
