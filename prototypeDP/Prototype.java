package prototypeDP;

import org.w3c.dom.ls.LSOutput;

public class Prototype {

    public static void main(String[] args) {

        System.out.println("creating object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("127.0.0.27");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        // we want new object of network connection > so clone >>>

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
