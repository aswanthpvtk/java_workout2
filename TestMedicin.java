class medicine
{
    void displayLabel()
    {
        System.out.println("Name=solo pharma");
        System.out.println("Adress=Vadakara,kozhikode");
    }
}

class Tablet extends medicine{
    void displayLabel()
    {
        System.out.println("store in cool dry place");
        System.out.println("For external use only");
    }
}
class syrup extends medicine{
    void displayLabel()
    {
        System.out.println("store in cool dry place");
        System.out.println("use only after doctors prescription");
    }
}
class oinment extends medicine{
    void displayLabel()
    {
        System.out.println("avoid contact from eyes");
        System.out.println("incase of irritation immediately contact doctor");
    }
}

public class TestMedicin {
    public static void main(String[] args)
    {
        double i = Math.random() * 4;
        int j = (int) i;
        System.out.println(j);
        switch (j) {
            case 1:
                medicine f1 = new medicine();
                Tablet t1 = new Tablet();
                f1.displayLabel();
                t1.displayLabel();
                break;
            case 2:
                medicine f2 = new medicine();
                syrup t2 = new syrup();
                f2.displayLabel();
                t2.displayLabel();
                break;
            case 3:
                medicine f3 = new medicine();
                oinment t3=new oinment();
                f3.displayLabel();
                t3.displayLabel();
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
