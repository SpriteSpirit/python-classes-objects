public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Car() {

    }

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = (brand != null && !brand.isEmpty()) ? brand : "default";
        this.model = (model != null && !model.isEmpty()) ? model : "default";
        this.engineVolume = (engineVolume > 0) ? engineVolume : 1.5f;
        this.color = (color != null && !color.isEmpty()) ? color : "White";
        this.year = (year > 0) ? year : 2000;
        this.country = (country != null && !country.isEmpty()) ? country : "default";
    }

    @Override
    public String toString() {
        return String.format("Brand: %s%nModel: %s%nEngine volume: %.1f%nColor: %s%nYear: %d%nCountry: %s%n", this.brand, this.model, this.engineVolume, this.color, this.year, this.country) + "***********************************************";
    }
}
