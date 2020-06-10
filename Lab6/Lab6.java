package Lab6;

public class Lab6 {
    public static void main(String[] args) {

        Automobile sad = new Sedan(7000, 6 , 130);
        Automobile pick = new Pickup(10000, 8, 120);
        Automobile sport = new Sportcar(100000, 12, 250);
        Automobile cardio = new Cabriolet(20000, 7, 110);

        Autopark autopark = new Autopark(new Automobile[] {sad, pick, sport, cardio});

        autopark.sortByConsumption();
        autopark.sumPrice();
        autopark.velocityRange(120, 150);
        System.out.println("The End");
    }
}
