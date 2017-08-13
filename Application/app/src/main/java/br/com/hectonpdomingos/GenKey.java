package br.com.hectonpdomingos;

import java.util.Random;

/**
 * Created by Hecton_Domingos on 30-Oct-16.
 */

public class GenKey extends MainActivity{

    public static String chave;
    private static final Random random = new Random();
    private static final String CHARS = "TUVWabcdefgh}&ijkmn234567opqrstuvwxyz<>!@#$ABCDEFGHJKLM[]^%NOPQRSXY1Z890(){*";




        public static String getToken(int length) {
            StringBuilder token = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                token.append(CHARS.charAt(random.nextInt(CHARS.length())));
            }


            chave = token.toString();
            return token.toString();
        }
    }
