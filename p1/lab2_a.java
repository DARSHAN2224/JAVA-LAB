package p1;
class Phone 
{
    void dial() 
    {
        System.out.println("Calling a number using regular phone");
    }
}
class CameraPhone extends Phone 
{
    void dial(String name) 
    {
        System.out.println("Calling " + name + " using camera phone");
    }
    void takePhoto() 
    {
        System.out.println("Take a photo");
    }
}
class Smart_Phone extends CameraPhone 
{
    void dial(String name, boolean b) 
    {
        if (b)
            System.out.println("Video calling " + name + " using smart phone");
        else
            System.out.println("Voice calling " + name + " using smart phone");
    }
    void accessInternet() 
    {
        System.out.println("Accessing contents from www");
    }
}

public class lab2_a 
{
    public static void main(String[] args) 
    {
        Phone p = new Phone();
        p.dial();

        CameraPhone c = new CameraPhone();
        c.dial();
        c.dial("Darshan");
        c.takePhoto();

        Smart_Phone s = new Smart_Phone();
        s.dial("arun", true);
        s.accessInternet();
    }
}