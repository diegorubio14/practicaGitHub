package practica1;

import java.util.Scanner;

public class notas {
    // Declaración de variables
    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    Scanner entrada = new Scanner(System.in); // Objeto Scanner para entrada de datos

    
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante");

        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

   
    public void comprobacion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

   
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

  
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendió");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

   
    public static void main(String[] args) {
        notas fc = new notas();
        fc.IngresaNotas();
        fc.comprobacion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}



