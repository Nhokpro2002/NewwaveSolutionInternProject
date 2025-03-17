package test.oop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WebE_commerce {

    private static final String COMMA_DELIMITER = ",";
    public static Inventory inventory = Inventory.getInstance();
    public static UserManager userManager = UserManager.getInstance();

    private static WebE_commerce webInstance;

    private WebE_commerce() {}

    public static WebE_commerce getWebInstance() {
        if (webInstance == null) {
            webInstance = new WebE_commerce();
        }
        return webInstance;
    }

    public void readListDataProduct(String filePathProductTxt) throws FileNotFoundException {
        try (BufferedReader dataReader = new BufferedReader(new FileReader(filePathProductTxt))) {
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);


                try {
                    String name = dataList.get(1);
                    double price = Double.parseDouble(dataList.get(2));
                    String category = dataList.get(3);
                    int quantity = Integer.parseInt(dataList.get(4));

                    if (dataList.get(0).equals("Clothing")) {
                        int size = Integer.parseInt(dataList.get(5));
                        String material = dataList.get(6);
                        Clothing clothingProduct = new Clothing(name, price, category, quantity, size, material);
                        inventory.getProductList().add(clothingProduct);
                    }
                    else if (dataList.get(0).equals("Laptop")) {
                        String brand = dataList.get(5);
                        String date = dataList.get(6);
                        Electronics electronicsProduct = new Electronics(name, price, category, quantity, brand, date);
                        inventory.getProductList().add(electronicsProduct);
                    }
                    else {
                        System.out.println("Invalid data");
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void readListDataUser(String filePathUserTxt) throws FileNotFoundException {
        try (BufferedReader dataReader = new BufferedReader(new FileReader(filePathUserTxt))) {
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                try {
                    String name = dataList.get(1);
                    String email = dataList.get(2);
                    String password = dataList.get(3);
                    if (dataList.get(0).equals("Admin")) {
                        boolean isAdmin = Boolean.parseBoolean(dataList.get(4));
                        User admin = new Admin(name, email, password,null, null);
                        UserManager.getInstance().getUserList().add(admin);

                    }
                    else if (dataList.get(0).equals("Customer")) {
                        boolean isAdmin = Boolean.parseBoolean(dataList.get(4));
                        User customer = new Customer(name, email, password, null);
                        UserManager.getInstance().getUserList().add(customer);

                    }
                    else {
                        System.out.println("Invalid data");
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

     */


    public List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (String data : splitData) {
                result.add(data.trim());
            }
        }
        return result;
    }

    public void init() throws FileNotFoundException {
        String fileProductTxt = "D:\\ProjectJava\\NewwaveSolutionInternProject\\src\\newwavesolution\\basic\\Product.txt";
       // String fileUserTxt = "D:\\ProjectJava\\NewwaveSolutionInternProject\\src\\newwavesolution\\basic\\User.txt";
        readListDataProduct(fileProductTxt);
       // readListDataUser(fileUserTxt);
    }

    public static Inventory getInventory() {
        return inventory;
    }


}
