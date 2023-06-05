import java.util.Random;
public class Rezervasyon
{
	public int ucret;

	Random random = new Random();

	public Rezervasyon()
	{
	    ucret = random.nextInt(70000 - 1000) + 1000;
	}
}