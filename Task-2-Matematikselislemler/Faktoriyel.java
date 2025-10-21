public class Faktoriyel {
    public static void main(String[] args) throws Exception {
        //Faktoriyel Hesaplama
        int sayi=5;
        int faktoriyel=1;
        for (int i=1; i<=sayi; i++){
            faktoriyel=faktoriyel*i;
        }

        //Sonucu Yazdırma
        System.out.println(sayi+" sayısının faktoriyeli: "+faktoriyel);
    }
}
