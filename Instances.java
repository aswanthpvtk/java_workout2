public class Instances {
    static int count;
    static int id;


    public Instances()
    {
        count++;
    }

    public static void main(String[] args)
    {
        Instances a=new Instances();
        Instances a2=new Instances();
        Instances a3=new Instances();
        Instances a4=new Instances();
        a=null;
        a2=null;
        Runtime.getRuntime().gc();
        System.out.println("Object created:"+count);
        System.out.println("Object destroyed:"+id);
        System.out.println("Object alive:"+(count-id));
    }
    protected  void finalize()
    {
        id++;
    }
}
