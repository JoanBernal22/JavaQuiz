
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



        //////////////////////////Integrante B ////////////////////////
       
        //Inicio de ronda 4 - Integrante B
        System.out.println("--- RONDA 4 ---");
        System.out.println("\1n ¿Qué estructura se utiliza para tomar decisiones en Java?");
        System.out.println("A) if");
        System.out.println("B) Scanner");
        System.out.println("C) System");
       
        System.out.print("La respuesta es:");
        respuesta = leer.next();

        if (respuesta.equals("A")) {
            System.out.println("Correcto!");
            aciertos++;
         }
        
         else{
            System.out.println("Incorrecto");
        }
        
        //Inicio de ronda 5 - Integrante B
        System.out.println("--- RONDA 5 ---");
        System.out.println("\1n ¿Qué bucle se ejecuta mientras se cumpla una condición?");
        System.out.println("A) if");
        System.out.println("B) while");
        System.out.println("C) switch");
       
        System.out.print("La respuesta es:");
        respuesta = leer.next();

        if (respuesta.equals("B")) {
            System.out.println("Correcto!");
            aciertos++;
         }
        
         else{
            System.out.println("Incorrecto");
        }

        //Inicio de ronda 6 - Integrante B
        System.out.println("--- RONDA 6 ---");
        System.out.println("\1n ¿Qué método permite conocer la longitud de un String?");
        System.out.println("A) size()");
        System.out.println("B) length()");
        System.out.println("C) count()");
       
        System.out.print("La respuesta es:");
        respuesta = leer.next();

        if (respuesta.equals("B")) {
            System.out.println("Correcto!");
            aciertos++;
         }
        
         else{
            System.out.println("Incorrecto");
        }

        System.out.println("Acertaste un total de: " + aciertos + " preguntas");

    leer.close();

        
        
    
        






    }
}
