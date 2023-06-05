import java.io.*;
import java.util.*;
public class LokasyonOlustur
{
	public String Ulke;
	public String Sehir;
	public String Havalimani;

	public List<String> LokasyonList = new ArrayList<String>();

	private String TLokasyon = "";

	public LokasyonOlustur()
	{
	    try
	    {
	        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
	        InputStream is = classloader.getResourceAsStream("Lokasyon.txt");
	        if (is != null)
	        {
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

	            while (true)
	            {
	                String[] Dlist;

	                String satir = reader.readLine();

	                if (satir != null)
	                {
	                    Dlist = satir.split(",");

	                    Ulke = Dlist[0];
	                    Sehir = Dlist[1];
	                    Havalimani = Dlist[2];

	                    TLokasyon = Ulke + " - " + Sehir + " - " + Havalimani;
	                    LokasyonList.add(TLokasyon);
	                }
	                else
	                    break;
	            }

	            reader.close();
	        }
	        else
	        {
	            Ulke = "Turkiye";
	            Sehir = "Istanbul";
	            Havalimani = "Ataturk Havalimani";

	            TLokasyon = Ulke + " - " + Sehir + " - " + Havalimani;
	            LokasyonList.add(TLokasyon);
	        }
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	}

	public void setUlke(String ulke)
	{
	    this.Ulke = ulke;
	}

	public String getUlke()
	{
	    return this.Ulke;
	}

	public void setSehir(String sehir)
	{
	    this.Sehir = sehir;
	}

	public String getSehir()
	{
	    return this.Sehir;
	}

	public void setHavalimani(String havalimani)
	{
	    this.Havalimani = havalimani;
	}

	public String getHavalimani()
	{
	    return this.Havalimani;
	}
}
