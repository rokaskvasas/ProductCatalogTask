import helpers.CSVHelper;
import models.Product;
import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> allproducts = new ArrayList<>();
        String productsPath = ".\\src\\main\\java\\files\\Product_groups.csv";
        try{
        CSVHelper.readCsv(allproducts,productsPath);}catch (IOException e){
            e.printStackTrace();
        }
//        ArrayList<Product> sortedArray = allproducts.stream().sorted(Comparator.comparing(Product::getId)).collect(Collectors.toCollection(ArrayList::new));
catalogs(allproducts);

        ArrayList<Product> ss = allproducts.stream().filter(product -> product.getParentId().equals("Null")).collect(Collectors.toCollection(ArrayList::new));
    }
    public static HashMap<String, Pair<String,String>> catalogs(ArrayList<Product> array){
        HashMap<String, Pair<String,String>> catalog = new HashMap<>();
        List<Product> First = array.stream().filter(product -> product.getParentId().equals("Null")).collect(Collectors.toList());
        List<Product> buitine = array.stream().filter(product -> product.getParentId().equals("4")).collect(Collectors.toList());
        List<Product> indaploves = array.stream().filter(product -> product.getParentId().equals("33")).collect(Collectors.toList());
        List<Product> tv = array.stream().filter(product -> product.getParentId().equals("2")).collect(Collectors.toList());
        List<Product> phones = array.stream().filter(product -> product.getParentId().equals("3")).collect(Collectors.toList());


//        catalog.forEach(First.stream().filter(product -> product.getName().equals("Buitine technika")),buitine.forEach(Product::getName),indaploves.forEach(Product::getName));
//
//

        return null;}

}
