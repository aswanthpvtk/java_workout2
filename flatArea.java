class OneBHK
{
    float roomArea;
    float hallArea;
    float price;
    OneBHK()
    {
//        roomArea=0;
//        hallArea=0;
//        price=0;
    }

    public OneBHK(float x,float y,float z)
    {
        roomArea=x;
        hallArea=y;
        price=z;
    }
    void show(String x)
    {
        System.out.println(x);
        System.out.println("Room Area: "+roomArea);
        System.out.println("Hall Area: "+hallArea);
        System.out.println("price: "+price);

    }
}
class TwoBHK extends OneBHK
{
    float room2Area;
    public TwoBHK()
    {

    }
    public TwoBHK(float x,float y,float z,float a)
    {
        roomArea=x;
        hallArea=y;
        price=z;
        room2Area=a;
    }

    void show(String x)
    {
        super.show(x);
        System.out.println("Room Area: "+room2Area);
        System.out.println("\n");

    }

}


public class flatArea {

    public static void main(String[] args)
    {
        OneBHK one=new OneBHK();
        OneBHK one2=new OneBHK();
        TwoBHK two=new TwoBHK();
        TwoBHK f1=new TwoBHK(326,567,321,678);
        TwoBHK f2=new TwoBHK(453,875,345,678);
        TwoBHK f3=new TwoBHK(100,120,150,200);

        f1.show("flat1");
        f2.show("flat2");
        f3.show("flat3");
    }
}
