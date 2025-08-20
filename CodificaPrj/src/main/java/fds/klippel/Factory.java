package fds.klippel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Factory {

    public static List<Codificador> codificadores = new ArrayList<>();

    public static Codificador compara(int segurancaPedido){ 
    return codificadores.stream()
            .filter(c -> c.getNivelSeguranca() >= segurancaPedido)
            .min(Comparator.comparingInt(Codificador::getNivelSeguranca))
            .orElseGet(() -> codificadores.stream()
            .max(Comparator.comparingInt(Codificador::getNivelSeguranca))
            .orElse(null));
}                                                                     
}