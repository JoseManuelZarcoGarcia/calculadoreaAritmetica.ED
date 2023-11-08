package calculadoreaAritmetica.Controladores;

import java.util.Scanner;

//import calculadoreaAritmetica.Servicios.calculosImplementacion;
import calculadoreaAritmetica.Servicios.*;

public class Inicio {
	
	public static void main(String[] args) {
			
			Scanner comunicacionTecladoM = new Scanner(System.in);

			menuInterfaz im = new menuImplementacion();
			calculosInterfaz ic = new calculosImplementacion();


			
			boolean cerrarMenu = false;
            int opcionSeleccionada;

            while (!cerrarMenu)
            {
                opcionSeleccionada = im.mostratMenuYSeleccion(comunicacionTecladoM);
                System.out.println(opcionSeleccionada);
                switch (opcionSeleccionada)
                {
                    case 1:
                    	System.out.println("[info] - se cerrara el programa");
                        cerrarMenu = true;
                        break;

                    case 2:
                    	System.out.println("[info] - suma");
                        ic.suma();
                        break;

                    case 3:
                    	System.out.println("[info] - resta");
                        ic.resta();
                        break;

                    case 4:
                    	System.out.println("[info] - multiplicacion");
                        ic.multiplicacion();
                        break;

                    case 5:
                    	System.out.println("[info] - division");
                        ic.division();
                        break;
                        
                    case 6:
                    	System.out.println("[info] - módulo de una división");
                        ic.resto();
                        break;

                    default:
                    	System.out.println("[info] - la opcion deseada no existe.");
                        break;
                }

            }
			
			
			
			
			
		}

}
