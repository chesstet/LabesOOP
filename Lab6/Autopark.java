package Lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Autopark {
    private Automobile[] automobiles;

    public Autopark(Automobile[] automobiles) {
        this.automobiles = automobiles;
    }

    public void sortByConsumption() {
        List<Automobile> automobilesList = new ArrayList();
        for (Automobile auto : automobiles) {
            automobilesList.add(auto);
        }
        automobilesList.sort(Comparator.comparing(Automobile::getConsumption));
        System.out.println(automobilesList);
    }

    public void sumPrice() {
        double parkPrice = 0;
        for (Automobile auto : automobiles) {
            parkPrice += auto.getPrice();
        }
        System.out.println("Summary price of the autopark: " + parkPrice);
    }

    public void velocityRange(int a, int b) {
        for (Automobile auto : automobiles) {
            if (auto.getVelocity() >= a && auto.getVelocity() <= b) {
                System.out.println(auto + " is in the range from " + a + " to " + b + ", with velocity: " + auto.getVelocity());
            }
        }
    }
}