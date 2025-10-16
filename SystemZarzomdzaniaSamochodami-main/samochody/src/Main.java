import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static abstract class vechicle {
        public String marka;
        public String model;
        public int rok;
        public void randomizeStats() {
            ArrayList<String> marki = new ArrayList<String>();
            marki.add("honda");
            marki.add("cebulion");
            marki.add("fiat");
            marki.add("mazda");
            marki.add("gorrilla");
            marki.add("volks wagen");
            ArrayList<String> modele = new ArrayList<String>();
            modele.add("mobil");
            modele.add("civic");
            modele.add("polonez");
            modele.add("cebula");
            modele.add("joe");
            int markaNum = (int) (Math.random() * 5);
            int modelNum = (int) (Math.random() * 4);
            this.marka = marki.get(markaNum);
            this.model = modele.get(modelNum);
            this.rok = (int) (Math.random() * 3001);
        }
    }

    interface rentable {
        public void rent();
    }

    public static class car extends vechicle {
        public int wheels = 4;
        public int storageSpace = 20;
        public int seats = 5;
        public int speed = 130;

        void wyswietlStatystyki() {
            System.out.println("    o statystykach:");
            System.out.println("        - koła : " + wheels);
            System.out.println("        - prędkość : " + speed);
            System.out.println("        - siedzenia : " + seats);
            System.out.println("        - pojemność : " + storageSpace);
        }

        public void radomizeStuff() {
            this.wheels = (int) (Math.random() * 5);
            if (wheels < 3) {
                while (wheels < 3) {
                    this.wheels = (int) (Math.random() * 5);
                }
            }

            this.storageSpace = (int) (Math.random() * 21);

            this.seats = (int) (Math.random() * 6);
            if (this.seats < 1) {
                while (this.seats < 1) {
                    this.seats = (int) (Math.random() * 6);
                }
            }

            this.speed = (int) (Math.random() * 131);
            if (this.speed < 0) {
                while (this.speed < 0) {
                    this.speed = (int) (Math.random() * 131);
                }
            }
        }
    }
    public static class motorcycle extends vechicle {
        public int wheels = 2;
        public int storageSpace = 5;
        public int seats = 1;
        public int speed = 200;

        void wyswietlStatystyki() {
            System.out.println("    o statystykach:");
            System.out.println("        - koła : " + wheels);
            System.out.println("        - prędkość : " + speed);
            System.out.println("        - siedzenia : " + seats);
            System.out.println("        - pojemność : " + storageSpace);
        }

        public void radomizeStuff() {
            this.wheels = 2;

            this.storageSpace = (int) (Math.random() * 6);

            this.seats = (int) (Math.random() * 3);
            if (this.seats < 1) {
                while (this.seats < 1) {
                    this.seats = (int) (Math.random() * 3);
                }
            }

            this.speed = (int) (Math.random() * 201);
            if (this.speed < 0) {
                while (this.speed < 0) {
                    this.speed = (int) (Math.random() * 201);
                }
            }
        }
    }
    public static class truck extends vechicle {
        public int wheels = 4;
        public int storageSpace = 50;
        public int seats = 2;
        public int speed = 100;

        void wyswietlStatystyki() {
            System.out.println("    o statystykach:");
            System.out.println("        - koła : " + wheels);
            System.out.println("        - prędkość : " + speed);
            System.out.println("        - siedzenia : " + seats);
            System.out.println("        - pojemność : " + storageSpace);
        }

        public void radomizeStuff() {
            this.wheels = (int) (Math.random() * 8);
            if (wheels < 4) {
                while (wheels < 4) {
                    this.wheels = (int) (Math.random() * 8);
                }
            }

            this.storageSpace = (int) (Math.random() * 101);

            this.seats = (int) (Math.random() * 3);
            if (this.seats < 1) {
                while (this.seats < 1) {
                    this.seats = (int) (Math.random() * 3);
                }
            }

            this.speed = (int) (Math.random() * 101);
            if (this.speed < 0) {
                while (this.speed < 0) {
                    this.speed = (int) (Math.random() * 101);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<car> cars = new ArrayList<>();
        car honda = new car();
        honda.randomizeStats();
        honda.radomizeStuff();
        cars.add(honda);
        car carOne = new car();
        carOne.randomizeStats();
        carOne.radomizeStuff();
        cars.add(carOne);
        car carTwo = new car();
        carTwo.randomizeStats();
        carTwo.radomizeStuff();
        cars.add(carTwo);

        ArrayList<motorcycle> motorcycles = new ArrayList<>();
        motorcycle motor1 = new motorcycle();
        motor1.randomizeStats();
        motor1.radomizeStuff();
        motorcycles.add(motor1);
        motorcycle motor2 = new motorcycle();
        motor2.randomizeStats();
        motor2.radomizeStuff();
        motorcycles.add(motor2);
        motorcycle motor3 = new motorcycle();
        motor3.randomizeStats();
        motor3.radomizeStuff();
        motorcycles.add(motor3);

        ArrayList<truck> trucks = new ArrayList<>();
        truck truck1 = new truck();
        truck1.radomizeStuff();
        truck1.randomizeStats();
        trucks.add(truck1);
        truck truck2 = new truck();
        truck2.radomizeStuff();
        truck2.randomizeStats();
        trucks.add(truck2);
        truck truck3 = new truck();
        truck3.radomizeStuff();
        truck3.randomizeStats();
        trucks.add(truck3);


        System.out.println("proszę wybrać typ pojadzu : ");
        System.out.println("    - 1. samochony");
        System.out.println("    - 2. motocykle");
        System.out.println("    - 3. ciężarówka");



        int typPojazdu = scan.nextInt();
        if (typPojazdu == 1) {
            System.out.println("obecne oferty dla 'samochody' : ");
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).marka + " " + cars.get(i).model + " " + cars.get(i).rok);
                cars.get(i).wyswietlStatystyki();
            }
        } else if (typPojazdu == 2) {
            System.out.println("obecne oferty dla 'motorcykle' : ");
            for (int i = 0; i < motorcycles.size(); i++) {
                System.out.println((i + 1) + ". " + motorcycles.get(i).marka + " " + motorcycles.get(i).model + " " + motorcycles.get(i).rok);
            }
        } else if (typPojazdu == 3) {
            System.out.println("obecne oferty dla 'ciemszarufki' : ");
            for (int i = 0; i < trucks.size(); i++) {
                System.out.println((i + 1) + ". " + trucks.get(i).marka + " " + trucks.get(i).model + " " + trucks.get(i).rok);
                trucks.get(i).wyswietlStatystyki();
            }
        }
    }
}