import java.util.ArrayList;
import java.util.Scanner;

public class Otomasyon {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Musteri> musteriList = new ArrayList<>();
    private int id = 1000;
    public  void baslat(){

        while (true){
            System.out.println("1- Müsteri Ekle\n2- Müsteri Sil\n3- Müsteri Ara\n4-Müsteri Listesini Göster\n5- Çıkş\n"+"Lütfen bir seçim yapınız");
        String islem = sc.nextLine();
        switch (islem){
            case "1":
                musteriEkle();
                break;
            case "2":
                musteriSil();
                break;
            case "3":
                musteriAra();
                break;
            case "4":
                musteriGoster();
                break;
            case "5":
                return;
            default:
                System.out.println("Yanlış değer girdiniz!");
        }
        }

    }

    private void musteriGoster() {
        for (int i = 0; i < musteriList.size(); i++) {
            System.out.println("Musteri ismi : "+musteriList.get(i).isimSoyisim);
            System.out.println("Musteri ID :"+musteriList.get(i).id);

        }
        musteriList.forEach(System.out::println);
    }

    private void musteriAra() {
        System.out.println("İsim giriniz:");
        String isim = sc.nextLine();
        for (int i = 0; i < musteriList.size(); i++) {
            if (musteriList.get(i).isimSoyisim.contains(isim)){
                System.out.println("Musteri ismi : "+musteriList.get(i).isimSoyisim);
                System.out.println("Musteri ID :"+musteriList.get(i).id);
            }

        }
    }

    private void musteriSil() {
        System.out.println("Silmek istediğiniz ID giriniz : ");
        int silinecekId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < musteriList.size(); i++) {
            if (musteriList.get(i).id==silinecekId){
                System.out.println("Silme işlemi başarılı");
                musteriList.remove(i);
                return;
            }

        }
        System.out.println("ID bulunamadı!");
    }

    private void musteriEkle() {
        System.out.println("İsim giriniz :");
        musteriList.add(new Musteri(this.id++,sc.nextLine() ) );

    }
}
