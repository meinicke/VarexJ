public class DBAccess {
    public static void main(String[] a)	throws Exception {
    	DB.createConnection();
    	DB.createTable();
    	DB.insertAddress(1245, "Lakeside dr.");
    	DB.insertAddress(300, "Bloor street East");
    	DB.shutdown();
    }
}