import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Ingrese un numero: ");
        num = scanner.nextInt();
        Factorizador factorizador = new Factorizador(num);
        factorizador.factorizar();}
        while(num!=0 && num>0);
    }
}