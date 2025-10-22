public class Daire {
     public static void main(String[] args) throws Exception {
    //Tanımlamalar 
    Double Pi=Math.PI;
    System.out.printf("%.4f\n",Math.PI);
    Double YariCap=5.5;
    Double Cevre=2*YariCap*Pi;
    Double Alan=Pi*YariCap*YariCap;
    //Hesaplamalar ve Ekran Çıktıları
        System.out.printf("Dairenin cevresi="+"%.4f\n",Cevre);
        System.out.printf("Dairenin alani="+"%.4f\n",Alan);
    }
}
