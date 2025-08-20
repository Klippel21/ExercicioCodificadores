package fds.klippel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod1 = new Codificador_Arthur();
        Codificador cod2 = new CodificadorSimples();
        Codificador cod3 = new Codificador_Luthero();


        Factory.codificadores.add(cod1);
        Factory.codificadores.add(cod2);
        Factory.codificadores.add(cod3);

        Scanner s = new Scanner(System.in);

        System.out.println("Indique o nível desejado de segurança");
        int valor = s.nextInt();
        Codificador Ideal = Factory.compara(valor);
        System.out.println("\nO codificador ideal é: "+ Ideal.getNome());

        String texto = Ideal.codifica("frase para codificar");
        System.out.println("\nfrase codificada: "+texto);

        String texto1 = Ideal.decodifica("Ìäcug@àcäc@eqÈkÌkecä");
        System.out.println("frase descodificada: "+texto1);

        s.close();

    }
}
