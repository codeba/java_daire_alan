package patika;

import java.util.Scanner;

public class Daire_Cevre_Alan {
    public static void main(String[] args) {
        int r,aci;
        double cevre,alan,pi=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.println("yarıçapı giriniz:");
        r=scan.nextInt();
        System.out.println("Merkez açıyı giriniz:");
        aci=scan.nextInt();
        cevre=2*pi*r;
        alan=(pi*r*r*aci)/360;
        System.out.println("Dairenin çevresi:"+cevre);
        System.out.println("Dairenin "+aci+" dercelik alanı:"+alan);


    }
}
