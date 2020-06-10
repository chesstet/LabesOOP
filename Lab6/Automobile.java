package Lab6;

public class Automobile {
    private int price;
    private int consumption;
    private int velocity;

    public Automobile(int price, int consumption, int velocity) {
        this.price = price;
        this.consumption = consumption;
        this.velocity = velocity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Automobile [name=" + getClass().getSimpleName() + ", consumption=" + getConsumption() + ", price=" + price + ", velocity=" + velocity + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(velocity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + price;
        result = prime * result + consumption;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Automobile other = (Automobile) obj;
        if (Double.doubleToLongBits(velocity) != Double.doubleToLongBits(other.velocity))
            return false;
        if (price != other.price)
            return false;
        if (consumption != other.consumption)
            return false;
        return true;
    }

    public int getConsumption() {
        return consumption;
    }

    public double getVelocity() {
        return velocity;
    }

}