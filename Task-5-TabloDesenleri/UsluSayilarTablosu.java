public class UsluSayiTablosu {
    public static void main(String[] args) {
        // Üslü sayı tablosunu yazdırma
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " üzeri n:   "); // Satır başında taban sayısını yazdırma
            for (int j = 0; j <= 5; j++) {
                System.out.print(i+"^"+j+" =");
                System.out.print( Math.pow(i, j));
                System.out.print("    "); // Üslü sayı sonucunu formatlı şekilde yazdırma
            }
            System.out.println(); // Her satırdan sonra yeni satıra geçme
        }
    }
}
