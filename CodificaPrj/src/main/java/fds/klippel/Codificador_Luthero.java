package fds.klippel;
import java.time.LocalDate;

public class Codificador_Luthero implements Codificador {
    
    public String getNome() {
        return "Codificador_Luthero";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 13);
    }

    public int getNivelSeguranca() {
        return 1;
    }

    public String codifica(String str) {
   
        return codifica(str, 1);
    }

    public String decodifica(String str) {
   
        return decodifica(str, 1);
    }

    public String codifica(String str, int opc) {
        StringBuilder encoded = new StringBuilder();

        switch (opc) {
            case 1:
                for (char c : str.toCharArray()) {
                    encoded.append((char) (c + 1));
                }
                break;

            case 2:
                for (char c : str.toCharArray()) {
                    encoded.append((char) (c + 2));
                }
                break;

            case 3:
                for (char c : str.toCharArray()) {
                    encoded.append((char) (c + 3));
                }
                break;

            case 4:
                for (char c : str.toCharArray()) {
                    encoded.append((char) (c * 2));
                }
                break;

            default:
                System.out.println("Essa opção não existe");
                return str;
        }
        return encoded.toString();
    }

    public String decodifica(String str, int opc) {
        StringBuilder decoded = new StringBuilder();

        switch (opc) {
            case 1:
                for (char caractere : str.toCharArray()) {
                    decoded.append((char) (caractere - 1));
                }
                break;

            case 2:
                for (char caractere : str.toCharArray()) {
                    decoded.append((char) (caractere - 2));
                }
                break;

            case 3:
                for (char caractere : str.toCharArray()) {
                    decoded.append((char) (caractere - 3));
                }
                break;

            case 4:
                for (char caractere : str.toCharArray()) {
                    decoded.append((char) (caractere / 2));
                }
                break;

            default:
                System.out.println("Não foi possível realizar essa operação");
                return str;
        }
        
        return decoded.toString();
    }
}