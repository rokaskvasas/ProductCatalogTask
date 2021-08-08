import helpers.CSVHelper;
import models.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> allproducts = new ArrayList<>();
        String productsPath = ".\\src\\main\\java\\files\\Product_groups.csv";
        try{
        CSVHelper.readCsv(allproducts,productsPath);}catch (IOException e){
            e.printStackTrace();
        }
        ArrayList<Product> sortedARrayid = allproducts.stream().sorted(Comparator.comparing(Product::getId)).collect(Collectors.toCollection(ArrayList::new));

//        HashMap<Product,Pair<String,String>> catalog

    }
}
