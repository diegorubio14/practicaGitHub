package practica1;

import java.util.Scanner;

public class notas {
    // Declaración de variables
    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    Scanner entrada = new Scanner(System.in); // Objeto Scanner para entrada de datos

    public void ingresarNotas() {
        System.out.println("Ingrese las notas del estudiante");

        System.out.print("Ingrese nota 1: ");
        uf1 = leerNota();

        System.out.print("Ingrese nota 2: ");
        uf2 = leerNota();

        System.out.print("Ingrese nota 3: ");
        uf3 = leerNota();
    }

    public double leerNota() {
        double nota = entrada.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota ingresada incorrecta, asegúrese de que esté en el rango de 0 a 10.");
            System.out.print("Ingrese nuevamente la nota: ");
            nota = leerNota(); // Llamada recursiva si la nota es incorrecta
        }
        return nota;
    }

    public void calcularNotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    public void mostrarResultados() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

    public void comprobarAprobacion() {
        if (def >= 5 && def <= 10) {
            System.out.println("Aprobado");
        } else if (def >= 0 && def < 5) {
            System.out.println("Suspendió");
        } else {
            System.out.println("Error en las notas");
        }
    }
    
    public void resetearNotas() {
        uf1 = 0;
        uf2 = 0;
        uf3 = 0;
        acu1 = 0;
        acu2 = 0;
        acu3 = 0;
        def = 0;
    }

    public static void main(String[] args) {
        notas notasEstudiante = new notas();
        notasEstudiante.ingresarNotas();
        notasEstudiante.calcularNotas();
        notasEstudiante.mostrarResultados();
        notasEstudiante.comprobarAprobacion();
        notasEstudiante.resetearNotas(); // Se llama al método para restablecer las notas
    }
}