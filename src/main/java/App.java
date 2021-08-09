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
        HashMap<List<Product>, Pair<List<Product>,List<Product>>> catalog = new HashMap<>(); // pakeisti

        // filtering by section
        List<Product> First = filterSection(array,"Null");
        List<Product> buitinetechnika = filterSection(array,"4");
        List<Product> tv = filterSection(array,"2");
        List<Product> phones = filterSection(array,"3");
        List<Product> sveikatairgrozis = filterSection(array,"1");
        List<Product> indaploves3 = filterSection(array,"33");
        List<Product> saldytuvai3 = filterSection(array,"31");
        List<Product> garuSurinktuvai3 = filterSection(array,"34");
        List<Product> kavosAparatai3 = filterSection(array,"10");
        List<Product> ledEkranai3 = filterSection(array,"6");
        List<Product> antenos3 = filterSection(array,"32");
        List<Product> smartphones3 = filterSection(array,"5");
        List<Product> telefonuaparatai3 = filterSection(array,"8");
        List<Product> telefonupriedai3 = filterSection(array,"7");
        List<Product> fenai = filterSection(array,"9");

        // grouping together second and third section.
        HashMap<String,List<Product>> indaploves2 = new HashMap<>();
        indaploves2.put(parentIdToString(buitinetechnika,33),indaploves3);
        HashMap<String,List<Product>> saldytuvai2 = new HashMap<>();
        saldytuvai2.put(parentIdToString(buitinetechnika,31),saldytuvai3);
        HashMap<String,List<Product>> garuSurinktuvai2 = new HashMap<>();
        garuSurinktuvai2.put(parentIdToString(buitinetechnika,34),garuSurinktuvai3);
        HashMap<String,List<Product>> kavosAparatai2 = new HashMap<>();
        kavosAparatai2.put(parentIdToString(buitinetechnika,10),kavosAparatai3);
        HashMap<String,List<Product>> ledEkranai2 = new HashMap<>();
        ledEkranai2.put(parentIdToString(tv,6),ledEkranai3);
        HashMap<String,List<Product>> antenos2 = new HashMap<>();
        antenos2.put(parentIdToString(tv,32),antenos3);
        HashMap<String,List<Product>> smartphones2 = new HashMap<>();
        smartphones2.put(parentIdToString(phones,5),smartphones3);
        HashMap<String,List<Product>> telefonuaparatai2 = new HashMap<>();
        telefonuaparatai2.put(parentIdToString(phones,8),telefonuaparatai3);
        HashMap<String,List<Product>> telefonupriedai2 = new HashMap<>();
        telefonupriedai2.put(parentIdToString(phones,7),telefonupriedai3);
        HashMap<String,List<Product>> sveikatairgrozis2 = new HashMap<>();
        sveikatairgrozis2.put(parentIdToString(sveikatairgrozis,9),fenai);












        return catalog;}

public static List<Product> filterSection(ArrayList<Product> array,String parentID){
        return array.stream().filter(product -> product.getParentId().equals(parentID)).collect(Collectors.toList());}

public static String parentIdToString(List<Product> list1,int id){
        return list1.stream().filter(product -> product.getId()==id).map(Product::getName).findFirst().toString();}

//public static HashMap<String,List<Product>> groupBySection(List<Product> productNameInList,int productID,List<Product> sectionProducts,String name){
//    HashMap<String,List<Product>> name =new HashMap<>()
//        return
//}
}
