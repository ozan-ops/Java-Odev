import java.util.Random;
public class UcakOlustur implements IUcak
{
    public String Model;
    public int YolcuKapasitesi;
    public int BagajKapasitesi;
    public int MotorSayisi;
    public int Hiz;

    private Random random = new Random();

    public UcakOlustur()
    {
        int randomNumber = random.nextInt(3);

        switch (randomNumber)
        {
            case 0:
                Model = "Airbus A320";
                YolcuKapasitesi = 180;
                BagajKapasitesi = 4000;
                MotorSayisi = 2;
                Hiz = 850;
                break;

            case 1:
                Model = "Boeing 737";
                YolcuKapasitesi = 200;
                BagajKapasitesi = 5000;
                MotorSayisi = 2;
                Hiz = 900;
                break;

            case 2:
                Model = "Boeing 777";
                YolcuKapasitesi = 350;
                BagajKapasitesi = 7000;
                MotorSayisi = 4;
                Hiz = 950;
                break;

            default:
                break;
        }
    }

    public String getModel()
    {
        return Model;
    }

    public void setModel(String model)
    {
        Model = model;
    }

    public int getYolcuKapasitesi()
    {
        return YolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi)
    {
        YolcuKapasitesi = yolcuKapasitesi;
    }

    public int getBagajKapasitesi()
    {
        return BagajKapasitesi;
    }

    public void setBagajKapasitesi(int bagajKapasitesi)
    {
        BagajKapasitesi = bagajKapasitesi;
    }

    public int getMotorSayisi()
    {
        return MotorSayisi;
    }

    public void setMotorSayisi(int motorSayisi)
    {
        MotorSayisi = motorSayisi;
    }

    public int getHiz()
    {
        return Hiz;
    }

    public void setHiz(int hiz)
    {
        Hiz = hiz;
    }
}