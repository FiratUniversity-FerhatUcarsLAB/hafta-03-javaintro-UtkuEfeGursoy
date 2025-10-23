public class CarpimTablosu {
    public static void main(String[] args) {
        // Çarpım tablosunu yazdırma
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" katları:"); // Satır başında çarpanı yazdırma
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // Çarpım sonucunu formatlı şekilde yazdırma
            }
            System.out.println(); // Her satırdan sonra yeni satıra geçme
        }
    }
}
