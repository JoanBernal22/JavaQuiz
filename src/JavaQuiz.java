
import java.util.Scanner;
public class JavaQuiz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aciertos = 0;
        String respuesta;

        System.out.println("========== JAVAQUIZ ==========");
        System.out.println("Concurso de preguntas sobre Java");
        System.out.println("Responde escribiendo A, B o C.");

        //Inicio de ronda 1 - Integrante A
        System.out.println("--- RONDA 1 ---");
        System.out.println("\1n ¿Qué tipo de dato almacena números enteros?");
        System.out.println("A) Double");
        System.out.println("B) Int");
        System.out.println("C) String");
       
        System.out.print("La respuesta es:");
        respuesta = leer.next();

        if (respuesta.equals("B")) {
            System.out.println("Correcto!");
            aciertos++;
         }
        
         else{
            System.out.println("Incorrecto");
        }
       
         //Inicio de ronda 2 - Integrante A
        System.out.println("--- RONDA 2 ---");
        System.out.println("\1n ¿Cuál es el primer índice de un array en Java?");
        System.out.println("A) 1");
        System.out.println("B) -1");
        System.out.println("C) 0");
       
        System.out.print("La respuesta es:");
        respuesta = leer.next();

        if (respuesta.equals("C")) {
            System.out.println("Correcto!");
            aciertos++;
         }
        
         else{
            System.out.println("Incorrecto");
        }
       
      //Inicio de ronda 3 - Integrante A
        System.out.println("--- RONDA 3 ---");
        System.out.println("\1n ¿Qué instrucción permite mostrar texto en pantalla?");
        System.out.println("A) Scanner");
        System.out.println("B) System.out.println()");
        System.out.println("C) import");
       
        System.out.print("La respuesta es:");
        respuesta = leer.next();

        if (respuesta.equals("B")) {
            System.out.println("Correcto!");
            aciertos++;
         }
        
         else{
            System.out.println("Incorrecto");
        }
       
    
        






    }
}
