public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(1,4,5,8,14);
        System.out.println(toplam);

    }

    public static void ekle(){

    }

    public static void sil(){

    }

    public static void güncelle(){

    }

    public static int topla(int sayı1,int sayı2){
        return sayı1+sayı2;

    }

    public static int topla2(int... sayilar){
        int toplam = 0;  //burdaki toplamla maindeki toplamın alakası yoka ayrı ayrı
        for (int sayi : sayilar){
            toplam += sayi;
        }

        return toplam;

    }

    public static String sehirVer(){
        return "Ankara";

    }


}