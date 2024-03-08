package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
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
    public List<String> getDomains() {
        return domains;
    }
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
    public void loadVeryImportantData() throws InterruptedException{
        this.importantData = "Very Very Important Data";
        Thread.sleep(5000);
        System.out.println("nice ");
        // it will take 5 mintues

        domains.add("www.learncodewithdurgesh.com");
        domains.add("www.substring.com");
        domains.add("www.lcwd.com");
        domains.add("www.google.com");
    }


    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]" + this.domains;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for(String d : this.getDomains()){
            networkConnection.getDomains().add(d);
        }

        return networkConnection;
    }

    

    
}
