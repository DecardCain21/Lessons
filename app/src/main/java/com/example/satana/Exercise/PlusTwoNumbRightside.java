package com.example.satana.Exercise;

import java.util.Scanner;

public class PlusTwoNumbRightside {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Chislo;
        int Ostatok = 0;
        int PredChislo = 0;
        int i = 0;
        System.out.println("Press ur number");
        Chislo = scan.nextInt();
        while (Chislo > 0) {
            PredChislo = (PredChislo + Ostatok) * 10;
            Ostatok = Chislo % 10;
            Chislo = Chislo / 10;
            i++;
            if (i >= 2) {//Заменить 2 на 1 если нужна лишь первая цифра справа
                System.out.println("Two numb on the right side:" + Ostatok );
                break;
            }
            scan.close();
        }
    }
}
//System.out.print(Reverse)
