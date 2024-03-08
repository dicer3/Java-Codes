package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Created object using prototype design pattern");
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        try  {
            NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
            networkConnection.getDomains().remove(0);
            System.out.println("networkConnection "+networkConnection);
            System.out.println("networkConnection 2"+networkConnection2);
            System.out.println(networkConnection2 == networkConnection);
            System.out.println(networkConnection2.equals(networkConnection));
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
