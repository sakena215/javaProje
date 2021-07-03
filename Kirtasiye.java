import java.util.*;

class Kirtasiye {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Toplam kac adet mal aldı  ?");
        int malSayisi = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("hangi malldan aldı ? Ve ne kadar?");

        String malTuru = input1.nextLine();
        int malSayi = input2.nextInt();
        System.out.print("Kaç çeşit malı var ?");
        int malCesiti = input.nextInt();
        System.out.println(" Mal Sayisi  " + malSayisi + " Mal turu " + malTuru
                + "Her bir turunun adet sayisi "
                + malSayi + " Cesit mali sayisi " + malCesiti);
    }
}
