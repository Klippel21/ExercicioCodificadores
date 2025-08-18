package fds.klippel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod1 = new Codificador_Arthur();
        Codificador cod2 = new CodificadorSimples();

        Factory.codificadores.add(cod1);
        Factory.codificadores.add(cod2);

        Scanner s = new Scanner(System.in);

        System.out.println("Indique um valor de 1 a 100");
        int valor = s.nextInt();
        Codificador Ideal = Factory.compara(valor);
        System.out.println("o codificador ideal é: "+ Ideal.getNome());

        s.close();

        /*System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);*/

    }
}
