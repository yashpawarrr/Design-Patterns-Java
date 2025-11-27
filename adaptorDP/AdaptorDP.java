package adaptorDP;

public class AdaptorDP {

    public static void main(String[] args) {

        // we don't have apple > kaa > charger object !!! only android charger is avail > use "Adapter" >>>
//        AppleCharger charger = new ChargerXYZ();

        AppleCharger charger = new AdapterCharger(new DkCharger());
        Iphone13 iphone13 = new Iphone13(charger);

        iphone13.chargeIphone();
    }
}
