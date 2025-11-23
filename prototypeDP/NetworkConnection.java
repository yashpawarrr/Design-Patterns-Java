package prototypeDP;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very very imp Data";

        domains.add("www.learndurgesh.com");
        domains.add("www.google.com");
        domains.add("www.wemakedev.com");
        domains.add("www.enggdig.com");

        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}' + this.domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // Own Logic for Cloning > for Deep Copy >
        NetworkConnection networkConnection = new NetworkConnection();

        // Now we do >
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for (String d : this.getDomains()) {
            networkConnection.getDomains().add(d);
        }

        return networkConnection;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
}
