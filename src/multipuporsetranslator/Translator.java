/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipuporsetranslator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vinicio Enrique Mercado Moreno
 */
public class Translator {

    private static final HashMap[] ARRAY_MAPAS = new HashMap[]{Mapas.TEXT_MAP, Mapas.MORSE_MAP, Mapas.BINARY_MAP};

    public String traducir(String textoATraducir, Formato formatoOrigen, Formato formatoDestino) {
        String resultado = "";
        HashMap<Integer, String> mapaOrigen = ARRAY_MAPAS[formatoOrigen.ordinal()];
        HashMap<Integer, String> mapaDestino = ARRAY_MAPAS[formatoDestino.ordinal()];

        List<String> valoresOrigen = new ArrayList<>(mapaOrigen.values());
        List<String> valoresDestino = new ArrayList<>();

        do {
            for (String valor : valoresOrigen) {
                if (textoATraducir.startsWith(valor)) {
                    valoresDestino.add(valor);
                    textoATraducir = textoATraducir.replaceFirst(valor, "");
                }
            }
        } while (!textoATraducir.isEmpty());

        List<Integer> claves = new ArrayList<>();
        for (String valor : valoresDestino) {
            Iterator<Map.Entry<Integer, String>> iterador = mapaOrigen.entrySet().iterator();
            while (iterador.hasNext()) {
                Map.Entry<Integer, String> e = iterador.next();
                if (valor.equals(e.getValue())) {
                    claves.add(e.getKey());
                }
            }
        }

        for (Integer clave : claves) {
            resultado += mapaDestino.get(clave);
        }
        return resultado;
    }
}
