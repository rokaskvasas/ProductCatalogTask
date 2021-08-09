import helpers.CSVHelper;
import models.ProductGroup;
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
        ArrayList<ProductGroup> allproducts = new ArrayList<>();
        String productsPath = ".\\src\\main\\java\\files\\Product_groups.csv";
        try{
        CSVHelper.readCsv(allproducts,productsPath);}catch (IOException e){
            e.printStackTrace();
        }
        buildCatalog(allproducts);

    }

    public static ArrayList<ProductGroup> buildCatalog(ArrayList<ProductGroup> allproducts){
        for(ProductGroup g:  allproducts){
            g.setChildren(allproducts.stream().filter((x) -> x.getParentId() == g.getId()).collect(Collectors.toCollection(ArrayList::new)));
        }
        return allproducts;
    }

    /*
      1 - Grupei rasti vaikus.
      2 - Turim patikrinti ar grupiu sarasas baigesi?
      3 - Jeigu baigesi - nieko nedarom, jeigu sarasas dar nesibaige - kvieciam grupei rasti vaikus.

     */



}
