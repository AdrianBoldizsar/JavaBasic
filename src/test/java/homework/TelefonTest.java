package homework;

import org.testng.annotations.Test;

public class TelefonTest {
    @Test
    public void phoneTest(){
        System.out.println("===First Example===");
        Iphone Iphone14 = new Iphone("Red", "Iphone 14", 128,
                "IOS",172,"Apple");
        Iphone14.phoneInfo();
        Iphone14.rings();
        Iphone14.volumeOff();
        Iphone14.volumeUp();
        Iphone14.setColour("Blue");
        Iphone14.phoneInfo();
        String stockModel= Iphone14.getModel();
        System.out.println("The model in stock is: " + stockModel);
        Iphone14.setInternalStorage(256);

        System.out.println("===Second Example===");
        Samsung SamsungGalaxyZFlip6 = new Samsung("PINK","SamsungGalaxyZFlip6",
                256);
        SamsungGalaxyZFlip6.phoneInfo();
        SamsungGalaxyZFlip6.rings();
        SamsungGalaxyZFlip6.volumeOff();
        SamsungGalaxyZFlip6.volumeUp();
        SamsungGalaxyZFlip6.setColour("Mint");
        SamsungGalaxyZFlip6.takesPhotos();
        SamsungGalaxyZFlip6.callsPeople();
        SamsungGalaxyZFlip6.textsMessage();

        }
    }
