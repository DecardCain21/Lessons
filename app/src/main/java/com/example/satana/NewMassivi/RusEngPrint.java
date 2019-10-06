package com.example.satana.NewMassivi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RusEngPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] russian = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "z", "x", "c", "v", "b", "n", "m", ",", "."};
        String[] latin = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ъ", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю"};
        StringBuffer strBuffer = new StringBuffer();
        System.out.println("Введите символы:");
        String strScan = scan.nextLine();
        char cstrScan;
        for (int z = 0; z < strScan.length(); z++) {
            cstrScan = strScan.charAt(z);
            for (int i = 0; i < russian.length; i++) {
                System.out.println(strScan.charAt(z));
                if (russian[i].equals(String.valueOf(cstrScan))) {
                    strBuffer.append(latin[i]);
                }
            }
        }
        System.out.println("Символ на латинице:" + strBuffer);
        scan.close();
    }
}

//String.valueOf(String.valueOf(cstrScan)); Ctrl+V