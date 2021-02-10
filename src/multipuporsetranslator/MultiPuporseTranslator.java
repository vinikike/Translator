/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipuporsetranslator;

/**
 *
 * @author Vinicio Enrique Mercado Moreno
 */
public class MultiPuporseTranslator {

    public static void main(String[] args) {
        Translator translator = new Translator();

        if ((args == null) || (args.length == 0)) {
            System.out.println("MultiPuporseTranslator textoATraducir formatoOrigen formatoDestino");
        }
        String textoATraducir = args[0];
        Formato formatoOrigen = Formato.valueOf(args[1]);
        Formato formatoDestino = Formato.valueOf(args[2]);
        String textoTraducido = translator.traducir(textoATraducir, formatoOrigen, formatoDestino);
        System.out.println("Texto traducido: " + textoTraducido);
    }

}
