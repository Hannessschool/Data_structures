import utils.IntegerProducer;

public class Main {

    public static void main(String[] args)
    {
        int myInt = IntegerProducer.getIntInput("Tillsätt ett heltal: ");
        System.out.println("Du tillsatte talet: " + myInt);
    }
}
