import java.util.Scanner;
public class MusteriOlustur
{
	public String TC;
	public String Ad;
	public String Soyad;
	public String Telefon;
	public int Cinsiyet;
	public int Engel;

	public Musteri musteri()
	{
	    Scanner input = new Scanner(System.in);
		while (true)
		{
		    String Temp = "";

		    System.out.print("T.C. Kimlik Numaranizi Giriniz: ");
		    Temp = input.nextLine();

		    if (Boyut_Kontrol(Temp) && Number_Kontrol(Temp))
		    {
		        TC = Temp;
		        break;
		    }
		}

		System.out.print("Adinizi Giriniz: ");
		Ad = input.nextLine();

		System.out.print("Soyadinizi Giriniz: ");
		Soyad = input.nextLine();

		while (true)
		{
		    String Temp = "";

		    System.out.print("Telefon Numaranizi Giriniz: ");
		    Temp = input.nextLine();

		    if (Boyut_Kontrol(Temp) && Number_Kontrol(Temp))
		    {
		        Telefon = Temp;
		        break;
		    }
		}

		while (true)
		{
		    String Temp = "";

		    System.out.print("Cinsiyetinizi Giriniz (e, k): ");
		    Temp = input.nextLine().toLowerCase();

		    if (Temp.equals("e"))
		    {
		        Cinsiyet = 1;
		        break;
		    }
		    else if (Temp.equals("k"))
		    {
		        Cinsiyet = 2;
		        break;
		    }
		    else
		    {
		        System.out.println("Yanlis Deger");
		    }
		}

		while (true)
		{
		    String Temp = "";

		    System.out.print("Engel Durumunuz Var Mi? (e, h): ");
		    Temp = input.nextLine().toLowerCase();

		    if (Temp.equals("e"))
		    {
		        Engel = 1;
		        break;
		    }
		    else if (Temp.equals("h"))
		    {
		        Engel = 2;
		        break;
		    }
		    else
		    {
		        System.out.println("Yanlis Deger");
		    }
		}

	    Musteri musteri = new Musteri(TC, Ad, Soyad, Telefon, Cinsiyet, Engel);

	    return musteri;
	}

	public boolean Boyut_Kontrol(String deger)
	{
	    boolean Kontrol = false;

	    if (deger.length() == 11)
	    {
	        Kontrol = true;
	    }
	    else
	    {
	        System.out.println("Alan 11 Haneden Olusmaktadir");
	    }

	    return Kontrol;
	}

	public boolean Number_Kontrol(String deger)
	{
	    boolean Kontrol = false;

	    try
	    {
	        Long.parseLong(deger);
	        Kontrol = true;
	    }
	    catch (NumberFormatException e)
	    {
	        System.out.println("Sayi Giriniz");
	    }

	    return Kontrol;
	}
}