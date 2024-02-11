package p1;

class Vechicle 
{
    void Start() 
    {
        System.out.println("Vechile Started");
    }

    void Stop() 
    {
        System.out.println("Vechile stopped");
    }
}

class Car extends Vechicle 
{
    @Override
    void Start() 
    {
        System.out.println("Car started");
    }

    @Override
    void Stop() 
    {
        System.out.println("Car stopped");
    }

    void Accelerate() 
    {
        System.out.println("Accelerating in a car");
    }
}

class SportsCar extends Vechicle 
{
    @Override
    void Start() 
    {
        System.out.println("Sports Car started");
    }

    @Override
    void Stop() 
    {
        System.out.println("Sports Car stopped");
    }

    void Turbo_boost() 
    {
        System.out.println("Turbo boosting in my sportd car");
    }
}

class Truck extends Vechicle 
{
    @Override
    void Start() 
    {
        System.out.println("Truck started");
    }

    @Override
    void Stop() 
    {
        System.out.println("Truck stopped");
    }

    void Load_cargo() 
    {
        System.out.println("Loading cargo into the truck");
    }
}

public class Lab3_A 
{
    public static void main(String[] args) 
    {
        Car c1 = new Car();
        c1.Start();
        c1.Accelerate();
        c1.Stop();
        SportsCar s1 = new SportsCar();
        s1.Start();
        s1.Turbo_boost();
        s1.Stop();
        Truck t1 = new Truck();
        t1.Start(); t1.Load_cargo(); t1.Stop();

    }
}
