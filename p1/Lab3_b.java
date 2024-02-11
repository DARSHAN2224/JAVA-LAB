package p1;
interface Power_management 
{
    void powerOn();
    void powerOff();
    boolean isPowerOn();
}
class Electronic_Devices implements Power_management 
{
    boolean state = false;
   @Override
    public void powerOn() 
   {
        state = true;
        System.out.println("Electronic device is turned on");
    }
    @Override
    public void powerOff() 
    {
        state = false;
        System.out.println("Electronic device is turned off");
    }
    @Override
    public boolean isPowerOn() 
    {
        return state;
    }
}
class smartPhone extends Electronic_Devices 
{
    @Override
    public void powerOn() 
    {
        state = true;
        System.out.println("Smart phone is turned on");
    }
    @Override
    public void powerOff() 
    {
        state = false;
        System.out.println("Smart phone is turned off");
    }
    void dial() 
    {
        if (isPowerOn())
            System.out.println("Call my friend using Smart phone");
        else
            System.out.println("hi Idoit, first turn on the phone");
    }
}
class laptop extends Electronic_Devices 
{
    @Override
    public void powerOn() 
    {
        state = true;
        System.out.println("Laptop is turned on");
    }
    @Override
    public void powerOff() 
    {
        state = false;
        System.out.println("Laptop is turned off");
    }
    void accessInternet() 
    {
        if (isPowerOn())
            System.out.println("Accessing internet using laptop");
        else
            System.out.println("Please first turn on the laptop");
    }
}
class Tablet extends Electronic_Devices 
{
    @Override
    public void powerOn() 
    {
        state = true;
        System.out.println("Tablet is turned on");
    }
    @Override
    public void powerOff() 
    {
        state = false;
        System.out.println("Tablet is turned off");
    }
    void takePhoto() 
    {
        if (isPowerOn())
            System.out.println("Taking photo using Tablet");
        else
            System.out.println("Please first turn on the Tablet");
    }
}
public class Lab3_b 
{
    public static void main(String[] args) 
    {
        smartPhone samsung = new smartPhone();
        samsung.powerOn();
        samsung.dial();
        samsung.powerOff();
        samsung.dial();
        System.out.println();
        laptop microsoft = new laptop();
        microsoft.powerOn();
        microsoft.accessInternet();
        microsoft.powerOff();
        microsoft.accessInternet();
        System.out.println();
        Tablet ipad = new Tablet();
        ipad.powerOn();
        ipad.takePhoto();
        ipad.powerOff();
        ipad.takePhoto();
    }
}

