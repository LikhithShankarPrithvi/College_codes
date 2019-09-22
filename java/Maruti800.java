class car{
public car()
{
System.out.println("Class Car");
}
public void vehicletype()
{
System.out.println("Vehicle Type:CAR");
}
}
class maruti extends car{
public maruti()
{
System.out.println("Class maruti");
}
public void brand()
{
System.out.println("Brand: Maruti");
}
public void speed()
{
System.out.println("MAX SPEED:90 kmph");
}
}
public class Maruti800 extends maruti{
public Maruti800()
{
System.out.println("Maruti Model : 800");
}
public void speed()
{
System.out.println(" MAX SPEED : 80kmph");
}
public static void main(String args[])
{
Maruti800 m=new Maruti800();
m.vehicletype();
m.brand();
m.speed();
}
}