package fds.klippel;

import java.time.LocalDate;

public class CodificadorSimples implements Codificador {
    public String getNome() {
        return "Codificador Simples";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca() {
        return 1;
    }

    public String codifica(String str, int opc) {
        
        StringBuilder encoded = new StringBuilder();

        switch (opc) {
            case 1:
                // StringBuilder encoded = new StringBuilder();

                for (char c : str.toCharArray()) {
                    encoded.append((char) (c + 1)); // andando um pra frente
                }

                // return encoded.toString();
                break;

            case 2:
                // +2
                // StringBuilder encoded = new StringBuilder();

                for (char c : str.toCharArray()) {
                    encoded.append((char) (c + 2)); // andando um pra frente
                }

                // return encoded.toString();
                break;

            case 3:
                // +3
                // StringBuilder encoded = new StringBuilder();

                for (char c : str.toCharArray()) {
                    encoded.append((char) (c + 3)); // andando um pra frente
                }

                // return encoded.toString();

                break;

            case 4:
                // *2
                // StringBuilder encoded = new StringBuilder();

                for (char c : str.toCharArray()) {
                    encoded.append((char) (c * 2)); // andando um pra frente
                }

                // return encoded.toString();
                break;

            default:
                System.out.println("essa opção não existe");
                break;

        }
        return encoded.toString();
    }

    public String decodifica(String str, int opc) {
        StringBuilder encoded = new StringBuilder();
        switch (opc) {
            case 1:
                for (char c : str.toCharArray()) {
                    encoded.append((char) (c - 1));
                }

                break;
            case 2:
                for (char c : str.toCharArray()) {
                    encoded.append((char) (c - 2));
                }
                break;

            case 3:
                for (char c : str.toCharArray()) {
                encoded.append((char) (c - 3));
            }
            break;

            case 4:
            for (char c : str.toCharArray()) {
                encoded.append((char) (c / 2));
            }
            break;

            default:
            System.out.println("não foi possivel realizar essa operação");
                break;
        }

        return encoded.toString();
    }
}