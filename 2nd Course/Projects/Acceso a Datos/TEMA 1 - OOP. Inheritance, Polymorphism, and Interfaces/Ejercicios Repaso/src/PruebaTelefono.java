/**
 * Created by Stanislav Krastev
 * ${PROJECT_NAME}
 * Date: ${MONTH_FULL_NAME} / ${YEAR}
 */
public class PruebaTelefono {
    public static void main(String[] args) {
        Telefono modeloBarato = new Telefono(2);
        Telefono modeloMedio = new Telefono(4);

        modeloBarato.llamar("670879078");
        modeloBarato.llamar("670674590");
        System.out.println(modeloBarato.ultimaLlamada());
        modeloBarato.llamar("670234590");
        modeloBarato.llamar("670069423");
        System.out.println(modeloBarato.llamada(1));

        modeloMedio.llamar("670879078");
        modeloMedio.llamar("670674590");
        System.out.println(modeloMedio.ultimaLlamada());
        modeloMedio.llamar("670234590");
        modeloMedio.llamar("670069423");
        modeloMedio.llamar("670069498");
        modeloMedio.llamar("670069499");
        System.out.println(modeloMedio.llamada(1));
        // esto es comentario

    }

    public static class Telefono {
        private int maxLlamadas;
        private String[] llamadasHechas;
        private int numLlamadaHecha = -1;

        Telefono(int maxLlamadas) {
            this.maxLlamadas = maxLlamadas;
            llamadasHechas = new String[maxLlamadas];
        }

        public void llamar(String Numero) {
            // Hacer la llamada
            numLlamadaHecha = (numLlamadaHecha + 1) % maxLlamadas;
            llamadasHechas[numLlamadaHecha] = Numero;
        }

        public String ultimaLlamada() {
            return llamada(0);
        }

        public String llamada(int n) {// La ultima llamada es n=0
            if (n <= numLlamadaHecha)
                return llamadasHechas[numLlamadaHecha - n];
            else
                return llamadasHechas[maxLlamadas - (n - numLlamadaHecha)];
        }
    }

}