package calculadoreaAritmetica.Servicios;

import java.util.Scanner;

public class calculosImplementacion implements calculosInterfaz{
	
	
	public int dameUnNum (Scanner comunicacionTecladoM)
    {
        int numEscrito;

        System.out.println("Escriba un numero: ");
        numEscrito = comunicacionTecladoM.nextInt();

        return numEscrito;

    }
	
	public int dameOtroNum(Scanner comunicacionTecladoM)
    {
        int numEscrito;

        System.out.println("Escriba otro numero: ");
        numEscrito = comunicacionTecladoM.nextInt();

        return numEscrito;

    }
	
	public void suma() 
    {
        int num1, num2, resultado;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);
        resultado=num1 + num2;

        System.out.println(resultado);
    }
	
	public void resta()
    {
        int num1, num2, resultado;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);
        resultado = num1 - num2;

        System.out.println(resultado);
    }
	
	public void multiplicacion()
    {
        int num1, num2, resultado;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);
        resultado = num1 * num2;

        System.out.println(resultado);
    }
	
	public void division()
    {
        int num1, num2, resultado;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);
        resultado = num1 / num2;

        System.out.println(resultado);
    }


	public void resto()
    {
        int num1, num2, resultado;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);
        resultado = num1 % num2;

        System.out.println(resultado);
    }

}
