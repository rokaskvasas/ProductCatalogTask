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
        List<Product> First = filterSection(array,"Null");
        List<Product> buitinetechnika = filterSection(array,"4");
        List<Product> tv = filterSection(array,"2");
        List<Product> phones = filterSection(array,"3");
        List<Product> sveikatairgrozis = filterSection(array,"1");
        List<Product> indaploves2 = filterSection(array,"33");
        List<Product> saldytuvai = filterSection(array,"31");
        List<Product> garuSurinktuvai = filterSection(array,"34");
        List<Product> kavosAparatai = filterSection(array,"10");
        List<Product> ledEkranai = filterSection(array,"6");
        List<Product> antenos = filterSection(array,"32");
        List<Product> smartphones = filterSection(array,"5");
        List<Product> phoneDevices = filterSection(array,"8");
        List<Product> telefonuApratai = filterSection(array,"7");
        List<Product> fenai = filterSection(array,"9");
        Pair<List<Product>,List<Product>> indaploves1 =groupingSection(buitinetechnika,indaploves2);
//        Pair<List<Product>,List<Product>>
        HashMap<String,List<Product>> indaploves3 = new HashMap<>();
        indaploves3.put(parentIdToString(buitinetechnika,33),indaploves2);


        catalog.put(First,indaploves1);

        return catalog;}

public static List<Product> filterSection(ArrayList<Product> array,String parentID){
        return array.stream().filter(product -> product.getParentId().equals(parentID)).collect(Collectors.toList());
}
public static Pair<List<Product>,List<Product>> groupingSection(List<Product> first,List<Product> second){
        return Pair.of(first, second);
}
public static String parentIdToString(List<Product> list1,int id){
        return list1.stream().filter(product -> product.getId()==id).map(Product::getName).findFirst().toString();
}

}
