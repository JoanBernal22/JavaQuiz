
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
        respuesta = leer.nextLine();

          if (respuesta == "B") {
            System.out.println("Es correcto");
            aciertos++;
          }
         
          else { 
             System.out.println("Incorrecto");
         }
           
        






    }
}
