package homework;

public class Samsung extends Telefon implements SamsungInterface {
    public String material;

    public Samsung(String colour, String model, Integer internalStorage) {
        super(colour, model, internalStorage);
    }
    public void samsungInfo(){
        System.out.println("The Samsung's material is made of: " + material + " and this phone has the colour " + colour);
        System.out.println("The Samsung's model is: " + model);
        System.out.println("The Iphone's internal storage is: " + internalStorage + " GB");
    }

    @Override
    public void volumeUp() {
        System.out.println("The phone rings louder when volume turned up");
    }

    @Override
    public void volumeOff() {
        System.out.println("The phone doesn't ring when volume turned off");
    }

    public void takesPhotos(){
        System.out.println("We can take photos with phone after we access the camera icon");
    }

    public void callsPeople(){
        System.out.println("We can call people on the phone only if we still have battery");
    }

    public void textsMessage() {
        System.out.println("We can text message and send them to people only if we have signal");

    }
}
