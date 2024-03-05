public class ExpectionClass {
    public static void main(String[] args) {
        int arr1[] = new int[20];
        try {
            arr1[21] = 3;
        } catch(Exception e){
            e.printStackTrace();

            System.out.println("pragun -->");
            System.out.println("see "+e);
        }

    }
}
