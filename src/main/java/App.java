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
        System.out.println("test");
    }
    public static HashMap<List<Product>, Pair<List<Product>,List<Product>>> catalogs(ArrayList<Product> array){
        HashMap<List<Product>, Pair<List<Product>,List<Product>>> catalog = new HashMap<>();
        List<Product> First = array.stream().filter(product -> product.getParentId().equals("Null")).collect(Collectors.toList());
        List<Product> buitinetechnika = array.stream().filter(product -> product.getParentId().equals("4")).collect(Collectors.toList());
        List<Product> tv = array.stream().filter(product -> product.getParentId().equals("2")).collect(Collectors.toList());
        List<Product> phones = array.stream().filter(product -> product.getParentId().equals("3")).collect(Collectors.toList());
        List<Product> sveikatairgrozis = array.stream().filter(product -> product.getParentId().equals("1")).collect(Collectors.toList());
        List<Product> indaploves2 = array.stream().filter(product -> product.getParentId().equals("33")).collect(Collectors.toList());
        List<Product> saldytuvai = array.stream().filter(product -> product.getParentId().equals("31")).collect(Collectors.toList());
        List<Product> garuSurinktuvai = array.stream().filter(product -> product.getParentId().equals("34")).collect(Collectors.toList());
        List<Product> kavosAparatai = array.stream().filter(product -> product.getParentId().equals("10")).collect(Collectors.toList());
        List<Product> ledEkranai = array.stream().filter(product -> product.getParentId().equals("6")).collect(Collectors.toList());
        List<Product> antenos = array.stream().filter(product -> product.getParentId().equals("32")).collect(Collectors.toList());
        List<Product> smartphones = array.stream().filter(product -> product.getParentId().equals("5")).collect(Collectors.toList());
        List<Product> phoneDevices = array.stream().filter(product -> product.getParentId().equals("8")).collect(Collectors.toList());
        List<Product> telefonuApratai = array.stream().filter(product -> product.getParentId().equals("7")).collect(Collectors.toList());
        List<Product> fenai = array.stream().filter(product -> product.getParentId().equals("9")).collect(Collectors.toList());
        Pair<List<Product>,List<Product>> indaploves1 =Pair.of(buitinetechnika,indaploves2);
        catalog.put(First,indaploves1);




//        catalog.forEach(First.stream().filter(product -> product.getName().equals("Buitine technika")),buitine.forEach(Product::getName),indaploves.forEach(Product::getName));
//
//
        return catalog;}

//    public static List<Product> arrayfactory(ArrayList<Product> array,String arrName, String identify){
//    return List<Product> arrName= array.stream().filter(product -> product.getParentId().equals(identify)).collect(Collectors.toList()); }
}
