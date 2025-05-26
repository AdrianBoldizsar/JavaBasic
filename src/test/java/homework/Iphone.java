package homework;

public class Iphone extends Telefon implements IphoneInterface {
    public String mobileOperatingSystem;
    public Integer weight;
    public String brand;

    public Iphone(String colour, String model, Integer internalStorage,
                  String mobileOperatingSystem, Integer weight, String brand) {
        super(colour, model, internalStorage);
        this.mobileOperatingSystem= mobileOperatingSystem;
        this.weight=weight;
        this.brand=brand;
    }
    public void iphoneInfo(){
        System.out.println("The Iphone's mobile operating system is: " + mobileOperatingSystem + " and this phone has the colour " + colour);
        System.out.println("The Iphone's weight is: " + weight + " grams" + " and the model is: " + model);
        System.out.println("The Iphone's brand is: " + brand + " and the internal storage is: " + internalStorage + " GB");
    }

    @Override
    public void volumeUp() {
        System.out.println("The phone rings louder when volume turned up");
    }

    @Override
    public void volumeOff() {
        System.out.println("The phone doesn't ring when volume turned off");
    }
    public void rings(){
        System.out.println("The phone rings when someone is calling");
    }

}
