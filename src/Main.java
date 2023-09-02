public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    static void task1() {
        System.out.println("TASK 1");
        Car lada1 = new Car();
        lada1.brand = "Lada";
        lada1.model = "Granta";
        lada1.engineVolume = 1.7f;
        lada1.color = "Yellow";
        lada1.year = 2015;
        lada1.country = "Russia";

        System.out.println(lada1);
    }

    static void task2() {
        System.out.println("TASK 2");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "Black", 2020, "German");
        Car bmw = new Car("BMW", "Z8", 3.0f, "Black", 2021, "German");
        Car kia = new Car("Kia", "Sportage 4-th", 2.4f, "Red", 2018, "South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "Orange", 2016, "South Korea");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

    static void task3() {
        System.out.println("TASK 3");
        Car car = new Car(null, "ОКА ЛАСТОЧКА", 0.9f, "ЗЕЛЕНЫЙ", 1965, "РОССИЯ");
        System.out.println(car);
    }

}