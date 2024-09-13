package workshop_2;

import java.util.Scanner;

public class CaesarCipher {

    Scanner sc = new Scanner(System.in);

    char[] alphabet = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
    };

    public CaesarCipher() {
        System.out.println("CIFRADO CÉSAR");

        System.out.print("Mensaje: ");
        String message = sc.nextLine().toLowerCase();

        System.out.print("Desplazamiento: ");
        int value = Integer.parseInt(sc.nextLine());

        String encryptedMessage = encryptMessage(message, value);
        System.out.println("Mensaje cifrado: " + encryptedMessage);
    }

    public String encryptMessage(String message, int value) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char s : message.toCharArray()) {
            if (Character.isLetter(s)) {
                int originalPosition = findPositionInAlphabet(s);
                if (originalPosition != -1) {
                    int newPosition = (originalPosition + value) % 26;
                    encryptedMessage.append(alphabet[newPosition]);
                }
            } else {
                encryptedMessage.append(s);
            }
        }

        return encryptedMessage.toString();
    }

    public int findPositionInAlphabet(char letter) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == letter) {
                return i;
            }
        }
        return -1;
    }
}
