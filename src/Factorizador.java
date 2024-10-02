public class Factorizador {


    private int numero;


    public Factorizador(int numero) {
        this.numero = numero;
    }

    public void factorizar(){
        int i = 2;
        while (numero > 1) {
            if (numero % i == 0) {
                System.out.println(i);
                numero = numero / i;
            } else {
                i++;
            }
        }
    }
}
