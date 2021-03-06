//DEV 276x EDX Java Course Module 3 Project
//Max Larner
//Encrypts and decrypts with a simple cipher
//~1hr to complete

public class Crypto {

    public static void main(String args[]) {

        System.out.println("Who will win the electioni?");
        String cypherText = encrypt("Who will win the electioni?", 5, 3);
        System.out.println(cypherText);
        String decrypted = decrypt(cypherText, 5);
        System.out.println(decrypted);
    }

    public static String normalizeText(String spaces) {

        String noSpaces = "";
        for (int i = 0; i < spaces.length(); i++) {

            char characterAt = spaces.charAt(i);
            if (Character.isLetter(characterAt)) {
                noSpaces += Character.toUpperCase(characterAt);
            }
        }
        return noSpaces;
    }

    public static String obify(String toObify) {

        String obified = "";
        String vowels = "AEIOUY";
        for (int i = 0; i < toObify.length(); i++) {

            if (vowels.indexOf(toObify.charAt(i)) != -1) {
                obified += "OB";
            }

            obified += toObify.charAt(i);
        }
        return obified;
    }


    public static String caesarify(String toShift, int key) {

        String caesarified = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = shiftAlphabet(key);

        for (int i = 0; i < toShift.length(); i++) {

            char letter = toShift.charAt(i);
            int charLocation = alphabet.indexOf(letter);

            if (charLocation + key >= 26) {
                charLocation = charLocation % 26;
            }
            caesarified += shiftedAlphabet.charAt(charLocation);
        }
        return caesarified;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String groupify(String toBreak, int perGroup) {

        String groupified = "";

        for (int i = 0; i < toBreak.length(); i++) {
            groupified += toBreak.charAt(i);
            if (i % perGroup == 0 && i != toBreak.length() - 1) {
                groupified += " ";
            }
        }
        groupified += "x";

        return groupified;

    }

    public static String encrypt(String toEncrypt, int shift, int groupSize) {

        return (groupify(caesarify(obify(normalizeText(toEncrypt)), shift), groupSize));
    }

    public static String ungroupify(String toUngroup) {

        String ungroupified = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < toUngroup.length(); i++) {

            if (alphabet.indexOf(toUngroup.charAt(i)) != -1) {
                ungroupified += toUngroup.charAt(i);
            }
        }
        return ungroupified;
    }

    public static String unobify(String toUnobify) {

        String unobified = "";

        for (int i = 0; i < toUnobify.length(); i++) {

            if (i + 1 >= toUnobify.length()) {
                unobified += toUnobify.charAt(i);
                break;
            }

            String toComp = Character.toString(toUnobify.charAt(i)) + Character.toString(toUnobify.charAt(i + 1));

            if (toComp.equals("OB")) {
                unobified += toUnobify.charAt(i + 2);
                i = i + 2;
            } else {
                unobified += toUnobify.charAt(i);
            }

        }
        return unobified;
    }

    public static String decrypt(String toDecrpyt, int shift) {
        return (unobify(caesarify(ungroupify(toDecrpyt), -shift)));
    }
}
