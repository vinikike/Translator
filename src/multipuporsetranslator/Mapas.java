/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipuporsetranslator;

import java.util.LinkedHashMap;

/**
 *
 * @author Vinicio Enrique Mercado Moreno
 */
public class Mapas {

    public static final LinkedHashMap<Integer, String> TEXT_MAP = new LinkedHashMap<Integer, String>() {
        {
            put(0x41, "A"); // A
            put(0x42, "B"); // B
            put(0x43, "C"); // C
            put(0x44, "D"); // D
            put(0x45, "E"); // E
            put(0x46, "F"); // F
            put(0x47, "G");
            put(0x48, "H");
            put(0x49, "I");
            put(0x4A, "J");
            put(0x4B, "K");
            put(0x4C, "L");
            put(0x4D, "M");
            put(0x4E, "N");
            put(0x4F, "O");
            put(0x50, "P");
            put(0x51, "Q");
            put(0x52, "R");
            put(0x53, "S");
            put(0x54, "T");
            put(0x55, "U");
            put(0x56, "V");
            put(0x57, "W");
            put(0x58, "X");
            put(0x59, "Y");
            put(0x5A, "Z");
            //
            put(0x61, "a"); // a
            put(0x62, "b"); // b
            put(0x63, "c");
            put(0x64, "d");
            put(0x65, "e");
            put(0x66, "f");
            put(0x67, "g");
            put(0x68, "h");
            put(0x69, "i");
            put(0x6A, "j");
            put(0x6B, "k");
            put(0x6C, "l");
            put(0x6D, "m");
            put(0x6E, "n");
            put(0x6F, "o");
            put(0x70, "p");
            put(0x71, "q");
            put(0x72, "r");
            put(0x73, "s");
            put(0x74, "t");
            put(0x75, "u");
            put(0x76, "v");
            put(0x77, "w");
            put(0x78, "x");
            put(0x79, "y");
            put(0x7A, "z");
            //
            put(0x13, "   ");
        }
    };

    public static final LinkedHashMap<Integer, String> MORSE_MAP = new LinkedHashMap<Integer, String>() {
        {
            put(0x41, ".-"); // A
            put(0x42, "-..."); // B
            put(0x43, "-.-."); // C
            put(0x44, "-.."); // D
            put(0x45, "."); // E
            put(0x46, "..-."); // F
            put(0x47, "--."); // G
            put(0x48, "...."); // H
            put(0x49, ".."); // I
            put(0x4A, ".---"); // J
            put(0x4B, "-.-"); // K
            put(0x4C, ".-.."); // L
            put(0x4D, "--"); // M
            put(0x4E, "-."); // N
            put(0x4F, "---"); // O
            put(0x50, ".--."); // P
            put(0x51, "--.-"); // Q
            put(0x52, ".-."); // R
            put(0x53, "..."); // S
            put(0x54, "-"); // T
            put(0x55, "..-"); // U
            put(0x56, "...-"); // V
            put(0x57, ".--"); // W
            put(0x58, "-..-"); // X
            put(0x59, "-.--"); // Y
            put(0x5A, "--.."); //Z
            //
//            put(0x61, ".-"); // a
//            put(0x62, "-..."); // b
//            put(0x63, "-.-."); // c
//            put(0x64, "-.."); // d
//            put(0x65, "."); // e
//            put(0x66, "..-."); // f
//            put(0x67, "--."); // g
//            put(0x68, "...."); // h
//            put(0x69, ".."); // i
//            put(0x6A, ".---"); // j
//            put(0x6B, "-.-"); // k
//            put(0x6C, ".-.."); // l
//            put(0x6D, "--"); // m
//            put(0x6E, "-."); // n
//            put(0x6F, "---"); // o
//            put(0x70, ".--."); // p
//            put(0x71, "--.-"); // q
//            put(0x72, ".-."); // r
//            put(0x73, "..."); // s
//            put(0x74, "-"); // t
//            put(0x75, "..-"); // u
//            put(0x76, "...-"); // v
//            put(0x77, ".--"); // w
//            put(0x78, "-..-"); // x
//            put(0x79, "-.--"); // y
//            put(0x7A, "--.."); //z
            //
            put(0x13, "   ");
        }
    };

    public static final LinkedHashMap<Integer, String> BINARY_MAP = new LinkedHashMap<Integer, String>() {
        {
            put(0x41, "01000001"); // A
            put(0x42, "01000010"); // B
            put(0x43, "01000011"); // C
            put(0x44, "01000100"); // D
            put(0x45, "01000101"); // E
            put(0x46, "01000110"); // F
            put(0x47, "01000111");
            put(0x48, "01001000");
            put(0x49, "01001001");
            put(0x4A, "01001010");
            put(0x4B, "01001011");
            put(0x4C, "01001100");
            put(0x4D, "01001101");
            put(0x4E, "01001110");
            put(0x4F, "01001111");
            put(0x50, "01010000");
            put(0x51, "01010001");
            put(0x52, "01010010");
            put(0x53, "01010011");
            put(0x54, "01010100");
            put(0x55, "01010101");
            put(0x56, "01010110");
            put(0x57, "01010111");
            put(0x58, "01011000");
            put(0x59, "01011001");
            put(0x5A, "01011010");
            //
            put(0x61, "01100001"); // a
            put(0x62, "01100010"); // b
            put(0x63, "01100011");
            put(0x64, "01100100");
            put(0x65, "01100101");
            put(0x66, "01100110");
            put(0x67, "01100111");
            put(0x68, "01101000");
            put(0x69, "01101001");
            put(0x6A, "01101010");
            put(0x6B, "01101011");
            put(0x6C, "01101100");
            put(0x6D, "01101101");
            put(0x6E, "01101110");
            put(0x6F, "01101111");
            put(0x70, "01110000");
            put(0x71, "01110001");
            put(0x72, "01110010");
            put(0x73, "01110011");
            put(0x74, "01110100");
            put(0x75, "01110101");
            put(0x76, "01110110");
            put(0x77, "01110111");
            put(0x78, "01111000");
            put(0x79, "01111001");
            put(0x7A, "01111010");
            //
            put(0x13, "   ");
        }
    };
}
