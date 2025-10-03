import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static abstract class vechicle {
        public String marka;
        public String model;
        public int rok;
    }

    interface vechicleFunc {
        public void rent();
    }

    public static class car extends vechicle {
        public int wheels = 4;
        public int storageSpace;
        public int seats;
    }
    public static class motorcycle extends vechicle {
        public int wheels = 2;
        public int seats;
    }
    public static class truck extends vechicle {
        public int wheels = 4;
        public int storageSpace;
        public int seats;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        car honda = new car();
        honda.marka = "honda";
        honda.seats = 5;

        ArrayList<vechicle> cars = new ArrayList<>();
        cars.add(honda);
        System.out.println(honda.marka);

    }
}