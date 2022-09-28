import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * JuegoSTARWARS
 * Date: NOVIEMBRE / 2021
 * <p>
 * Desarrollar un pequeño videojuego educativo para adolescentes llamado ‘Star Wars Códigos Secretos’ que fomente la
 * comprensión lectora y la competencia matemática. Estará ambientado en el universo de Star Wars con un estilo de
 * aventura conversacional sencillo en el que el usuario tendrá que superar varias pruebas matemáticas para conseguir destruir la estrella de la muerte.
 */
public class STARWARS_codigos_secretos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long respuestaUsuario, respuestaCorrecta = 0; // variables en las que almacenaré la respuesta del usuario y la respuesta correcta
        boolean hasperdido = false; // booleana para imprimir un único mensaje según 2 condiciones "Ha ganado / Ha perdido"
        // --------------- INICIO ---------------
        String comandoInicio = ".";
        System.out.print("""

                ====== STAR WARS CÓDIGOS SECRETOS ======
                                
                Hace mucho tiempo, en una galaxia muy, muy lejana…
                La Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2
                viajan en una nave imperial robada en una misión secreta para infiltrarse
                en otra estrella de la muerte que el imperio está construyendo para destruirla.

                """);
        // Comprobación si el usuario presiona Intro
        do {
            System.out.print("Presiona Intro para continuar: ");
            comandoInicio = scanner.nextLine();
        } while (!comandoInicio.equals(""));
        System.out.print("\n¡E M P I E Z A    E L    J U E G O!\n");

        // BUCLE DO WHILE QUE ENGLOBARÁ EL EJERCICIO ENTERO
        do {
            // --------------- NIVEL 1  ---------------
            int sistema1, sector1;
            // formula (int) (MIN + Math.random() * (MAX - MIN + 1))
            sistema1 = (int) (1 + Math.random() * (10 - 1 + 1)); // generar número aleatorio entre el 1 y el 10
            sector1 = (int) (20 + Math.random() * (30 - 20 + 1)); // "" 20 y el 30
            for (int i = sistema1; i <= sector1; i++) {  // recorrer desde el primer número hasta el último
                respuestaCorrecta += i; //  guardo el resultado de cada vuelta en la variable
            }
            System.out.println("\n====== NIVEL 1 ======");
            System.out.printf("Respuesta correcta: %d%n", respuestaCorrecta);
            System.out.printf("%nLos problemas empiezan cuando deben realizar un salto hiperespacial %nhasta al " +
                    "sistema %d en el sector %d, pero el %nsistema de navegación está estropeado y el computador tiene problemas " +
                    "%npara calcular parte de las coordenadas de salto. Chewbacca, %npiloto experto, se da cuenta que falta el cuarto número de la serie." +
                    "%nRecuerda de sus tiempos en la academia de pilotos que para calcularlo hay que %ncalcular el sumatorio entre el nº del sistema %ny " +
                    "el nº del sector (ambos inclusive).%n", sistema1, sector1);
            System.out.print("\n¿Has calculado el salto necesario?\nPiénsalo bien porque solamente tienes 1 oportunidad, si fallas, se acabó, si aciertas, pasarás al siguiente nivel.\n");
            System.out.print("¿Dime, que salto es necesario hacer?: ");
            respuestaUsuario = scanner.nextLong(); // leo respuesta del usuario
            if (respuestaUsuario != respuestaCorrecta) { // comparo si la respuesta del usuario es distinta a la respuesta correcta
                hasperdido = true;  // si se cumple, cambio el valor de la booleana a True y termino el programa, el usuario ha perdido, se sale del programa
                break;
            } else { // si no se cumple lo anterior, solo queda que haya acertado, usuario pasa al siguiente nivel
                System.out.println("¡Que listo eres! ¡VAMOS A POR EL SIGUIENTE NIVEL!\n");
            }
            // --------------- NIVEL 2  ---------------
            int puerto1, puerto2; // variables para el 2º nivel
            puerto1 = ThreadLocalRandom.current().nextInt(1, 8);
            puerto2 = ThreadLocalRandom.current().nextInt(8, 31);

            respuestaCorrecta = 1;
            for (double i = puerto1; i <= puerto2; i++) { // recorro con paso 1
                respuestaCorrecta *= i;  // guardo el resultado de cada vuelta en la variable
            }
            System.out.println("\n====== NIVEL 2 ======");
            System.out.printf("Respuesta correcta: %d%n", respuestaCorrecta);
            System.out.printf("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte.\n" +
                    "Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos.\n" +
                    "De repente suena el comunicador. “Aquí agente de espacio puerto %d contactando con nave imperial %d.\n" +
                    "No están destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n" +
                    "“Eh… tenemos un fallo en el… eh… condensador de flujo... Solicitamos permiso para atracar y reparar la nave”. \n" +
                    "El agente, que no se anda con tonterías, responde “Proporcione código de acceso o abriremos fuego”.\n" +
                    "Han Solo ojea rápidamente el manual del piloto que estaba en la guantera y da con la página correcta.\n" +
                    "El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive)..", puerto1, puerto2);
            System.out.print("\n¿Has calculado el código?\nPiénsalo bien porque solamente tienes 1 oportunidad, si fallas, se acabó, si aciertas, pasarás al siguiente nivel.\n");
            System.out.print("¿Dime, que código es necesario?: ");
            respuestaUsuario = scanner.nextLong();
            if (respuestaUsuario != respuestaCorrecta) { // misma comprobación que el anterior nivel
                hasperdido = true;
                break;
            } else {
                System.out.println("¡Que listo eres! ¡VAMOS A POR EL SIGUIENTE NIVEL!\n");
            }
            // --------------- NIVEL 3  ---------------
            int nivel3; // variable para el nivel 3
            nivel3 = ThreadLocalRandom.current().nextInt(50, 101);
            nivel3 = nivel3 / 10; // me quedo con la parte entera de la división (Ejemplo: 54 / 10 = 5, ya que tratamos con integer)
            respuestaCorrecta = 1;
            for (int i = 1; i <= nivel3; i++) { // recorro desde 1 hasta la parte entera de la division
                respuestaCorrecta *= i; //  guardo el resultado de cada vuelta en la variable
            }
            System.out.println("\n====== NIVEL 3 ======");
            System.out.printf("Respuesta correcta: %d%n", respuestaCorrecta);
            System.out.printf("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se equipan con trajes de soldados\n" +
                    "imperiales que encuentran en la nave para pasar desapercibidos y bajan. Ahora deben averiguar en qué nivel de los\n" +
                    "%d existentes se encuentra el reactor principal. Se dirigen al primer panel computerizado que encuentran y la Princesa\n" +
                    "Leia intenta acceder a los planos de la nave pero necesita introducir una clave de acceso. Entonces recuerda la información\n" +
                    "que le proporcionó Lando Calrissian “La clave de acceso a los planos de la nave \nes el factorial de %d/10 (redondeando %d hacia abajo)," +
                    " donde %d es el nº de niveles”.", nivel3, nivel3, nivel3, nivel3);
            System.out.print("\n¿Has calculado el nivel?\nPiénsalo bien porque solamente tienes 1 oportunidad, si fallas, se acabó, si aciertas, pasarás al siguiente nivel.\n");
            System.out.print("¿Dime, que nivel es el correcto?: ");
            respuestaUsuario = scanner.nextLong(); // leo respuesta del usuario
            if (respuestaUsuario != respuestaCorrecta) { // misma comprobación que los niveles anteriores
                hasperdido = true;
                break;
            } else {
                System.out.println("¡Que listo eres! ¡VAMOS A POR EL SIGUIENTE NIVEL!\n");
            }
            // --------------- NIVEL 4  ---------------
            int primo, divisores = 0; // variables para el nivel 4
            primo = ThreadLocalRandom.current().nextInt(10, 101);
            for (int i = 1; i <= primo; i++) { // recorro desde 1 hasta el número aleatorio generado
                if (primo % i == 0) {   //condicional, si el resto = 0, aumento valores de la variable almacen/contador con 1 unidad
                    divisores++;
                }
            }
            if (divisores == 2) { // una vez terminado el bucle for, compruebo
                respuestaCorrecta = 1; // si se cumple la respuesta que debe introducir el usuario es 1, es decir el número generado aleatoriamente es un número primo
            } else if (divisores > 2) { // si no se cumple lo anterior, es un número no primo
                respuestaCorrecta = 0; // respuesta correcta es 0
            }
            System.out.println("\n====== NIVEL 4 ======");
            System.out.printf("Respuesta correcta: %d%n", respuestaCorrecta);
            System.out.printf("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta acorazada que da al reactor principal.\n" +
                    "R2D2 se conecta al panel de acceso para intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita verificar\n" +
                    "si el número %d es primo o no. Si es primo introduce un 1, si no lo es introduce un 0.", primo);
            System.out.print("\n¿Has calculado si es primo?? ?\nPiénsalo bien porque solamente tienes 1 oportunidad, si fallas, se acabó, si aciertas, pasarás al siguiente nivel.\n");
            System.out.print("¿Dime, es primo? Introduce un 1, si no es primo introduce un 0?: ");
            respuestaUsuario = scanner.nextLong(); // leo respuesta del usuario
            if (respuestaUsuario != respuestaCorrecta) { // misma comprobación que los niveles anteriores
                hasperdido = true;
                break;
            } else {
                System.out.println("¡Que listo eres! ¡VAMOS A POR EL SIGUIENTE NIVEL!\n");
            }
            // --------------- NIVEL 5  ---------------
            int minutos, segundos, almacenMinutos = 1, almacenSegundos = 1; // variables para el nivel 5
            minutos = ThreadLocalRandom.current().nextInt(5, 11);
            segundos = ThreadLocalRandom.current().nextInt(5, 11);
            for (int i = 1; i <= minutos; i++) { // bucle for desde 1 hasta los minutos
                almacenMinutos = almacenMinutos * i; //  guardo el resultado de cada vuelta en la variable
            }
            for (int i = 1; i <= segundos; i++) { // mismo procedimiento que el bucle anterior pero para los segundos
                almacenSegundos = almacenSegundos * i;
            }
            respuestaCorrecta = almacenSegundos + almacenMinutos; // respuesta correcta es la suma de ambas variables
            System.out.println("\n====== NIVEL 5 ======");
            System.out.printf("Respuesta correcta: %d%n", respuestaCorrecta);
            System.out.printf("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba, programe el temporizador y salir\n" +
                    "de allí corriendo. Necesita programarlo para que explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n" +
                    "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y desactive la bomba. Pero el temporizador utiliza\n" +
                    "un reloj Zordgiano un tanto peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar el factorial de %d y el\n" +
                    "factorial de %d. ¿Qué valor debe introducir?", minutos, segundos);
            System.out.print("\n¿Has calculado el valor? ?\nPiénsalo bien porque solamente tienes 1 oportunidad, si fallas, se acabó, si aciertas, pasarás al siguiente nivel.\n");
            System.out.print("Dime, el valor: ");
            respuestaUsuario = scanner.nextLong();  // leo respuesta del usuario
            if (respuestaUsuario != respuestaCorrecta) {    // misma comprobación que los niveles anteriores
                hasperdido = true;
                break;
            } else {
                break;
            }
        } while (!hasperdido);

        /*
         Si está aquí el programa, hay dos opciones, o se ha salido del programa con un cambio de la variable booleana <hasperdido = True> y un break para terminar el programa o el usuario ha ganado, ha pasado por todos los niveles
         y la variable booleana ha mantenido su asignación que tenía al comienzo del programa
        */

        // condicional si la booleana == True (HA FALLADO EN ALGÚN NIVEL)
        if (hasperdido) {
            System.out.println("""

                    Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(
                    Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!\s
                    GRACIAS POR JUGAR <3""");
        } else { // Booleana == False (HA SUPERADO LOS NIVELES)
            System.out.println("""

                    Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a sonar las alarmas.
                    Salen de allí corriendo, no hay tiempo que perder.\s
                    La nave se convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea consiguen llegar a la nave y salir de allí a toda prisa.
                    A medida que se alejan observan por la ventana la imagen de la colosal estrella de la
                    muerte explotando en el silencio del espacio, desapareciendo para siempre junto a los restos del malvado imperio.
                    ¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D
                    GRACIAS POR JUGAR <3""");
        }


    }
}
