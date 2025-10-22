public class Dikdortgen {
    public static void main(String[] args) throws Exception {
        //Tanımlamalar 
        Double KisaKenar=4.5;
        Double UzunKenar=7.9;
        Double Cevre=2*(KisaKenar+UzunKenar);
        Double Alan=KisaKenar*UzunKenar;
        //Hesaplamalar ve Ekran Çıktıları
        System.out.printf("Dikdörtgenin cevresi="+"%.2f\n",Cevre);
        System.out.printf("Dikdörtgenin alani="+"%.2f\n",Alan);
    }
}
