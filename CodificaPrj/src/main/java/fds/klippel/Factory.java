package fds.klippel;
import java.util.stream;

public class Factory {

    public static Codificador compara(int NivelSeguranca){
        return codificadores.stream()
                              .filter(c -> c.getNivelSeguranca() >= NivelSeguranca)
                              .min(Comparator.comparingInt(Codificador::getNivelSeguranca))
                              .orElse(Collections.max(codificadores, Comparator.comparingInt(Codificador::getNivelSeguranca)));
}
}