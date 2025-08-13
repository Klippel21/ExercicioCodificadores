package fds.klippel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());

        Scanner ent = new Scanner(System.in);
        System.out.println("digite a palavra a ser codificada: ");
        String entrada = ent.nextLine();
        System.out.println("Qual a codificação que você quer?\n 1- +1 letra\n 2- +2 letras\n 3- +3 letras\n 4- *2 letras");
        int opcao = ent.nextInt();
        String codificado = cod.codifica(entrada, opcao);
        String decodificado = cod.decodifica(codificado, opcao);

        System.out.println("Texto original: "+entrada);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);
    }
}
