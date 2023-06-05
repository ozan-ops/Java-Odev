import java.util.Scanner;
public class mainClass
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Rezervasyon Sistemine Hos Geldiniz.\n");

		MusteriOlustur musteriOlustur = new MusteriOlustur();
		Musteri musteri = musteriOlustur.musteri();

		UcusOlustur ucusOlustur = new UcusOlustur(musteri.Ad, musteri.Soyad);
		System.out.print(ucusOlustur.UcusDondur());

		System.out.print("\n\nIyi Gunler Dileriz.");

		input.nextLine();
	}
}
