import java.util.*;
public class UcusOlustur
{
	public String Musteri;
	public String Ucak;
	public String Lokasyon;
	public Date Tarih;
	public int KoltukSayisi;

	Random random = new Random();

	public UcusOlustur(String Ad, String Soyad)
	{
	    Musteri = Ad + " " + Soyad;

	    UcakOlustur ucakOlustur = new UcakOlustur();
	    Ucak = ucakOlustur.Model;

	    System.out.println("\nAktif Ucuslar: ");
	    LokasyonOlustur lokasyonOlustur = new LokasyonOlustur();

	    int LSayac = 1;
	    for (String item : lokasyonOlustur.LokasyonList)
	    {
	        System.out.println(LSayac + ". Lokasyon => " + item);
	        LSayac++;
	    }

	    while (true)
	    {
	        System.out.print("Lokasyon Seciniz: ");
	        Scanner input = new Scanner(System.in);
			int secim = input.nextInt();

			if (secim >= 1 && secim <= 9)
			{
			    Lokasyon = lokasyonOlustur.LokasyonList.get(secim - 1);
			    break;
			}
	    }

	    System.out.println("\nAktif Tarihler: ");

	    int TSayac = 1;
	    Date[] dates = TarihOlustur();
	    for (Date date : dates)
	    {
	        System.out.println(TSayac + ". Tarih => " + date.toString());
	        TSayac++;
	    }

	    while (true)
	    {
	        System.out.print("Tarih Seciniz: ");
	        Scanner input = new Scanner(System.in);
	        
			int secim = input.nextInt();

			if (secim >= 1 && secim <= 14)
			{
			    Tarih = dates[secim - 1];
			    break;
			}			
	    }

	    int max = random.nextInt(ucakOlustur.YolcuKapasitesi / 2, ucakOlustur.YolcuKapasitesi);
	    max = max - random.nextInt(1, max);
	    KoltukSayisi = KoltukSecim(max);
	}

	public String UcusDondur()
	{
	    Rezervasyon rezervasyon = new Rezervasyon();

	    String Temp = "\nSayin " + Musteri + ";\nUcaginiz: " + Ucak + "\nLokasyonunuz: " + Lokasyon + "\nUcus Tarihiniz: " + Tarih + "\nKoltugunuz: " + KoltukSayisi + "\nUcretiniz: " + rezervasyon.ucret;
	    return Temp;
	}

	public Date[] TarihOlustur()
	{
	    Date[] dates = new Date[14];
	    Date now = new Date();

	    for (int i = 0; i < dates.length; i++)
	    {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(now);
	        cal.add(Calendar.DATE, i + 1);
	        dates[i] = cal.getTime();
	    }

	    return dates;
	}

	public int KoltukSecim(int max)
	{
	    int secim;

	    ArrayList<Integer> koltuklar = new ArrayList<Integer>();
	    int j = random.nextInt(1, max);

	    System.out.print("\nAktif Koltuklar: ");

	    for (int i = 1; i <= max; i+=j)
	    {
	        koltuklar.add(i);
	        System.out.print(i + " ");
	    }

	    System.out.print("\nKoltuk Seciniz: ");
	    
	    Scanner input = new Scanner(System.in);
	    
		secim = input.nextInt();

		while(!koltuklar.contains(secim))
		{
		    System.out.println("Yanlis Deger");

		    System.out.print("Aktif Koltuklar: ");

		    for (int item : koltuklar)
		    {
		        System.out.print(item + " ");
		    }

		    System.out.print("\nKoltuk Seciniz: ");
		    secim = input.nextInt();
		}
		
	    return secim;
	}
}