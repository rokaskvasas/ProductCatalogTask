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

        // Perskaitom CSV faila ir sukeliame i masyva.
        ArrayList<ProductGroup> allproducts = new ArrayList<>();
        String productsPath = ".\\src\\main\\java\\files\\Product_groups.csv";
        try{
        CSVHelper.readCsv(allproducts,productsPath);}catch (IOException e){
            e.printStackTrace();
        }

        buildCatalog(allproducts);



        printArray(allproducts);


    }



//    public static void printArray(ArrayList<String> array, Integer whatElementToPrint){
//        System.out.println(array.get(whatElementToPrint));
//
//        if(array.size() > whatElementToPrint){
//            printArray(array, whatElementToPrint + 1);
//        }
//    }
    // Surasti ir priskirti giminigus rysius(ParentId=Id) naudojant for cikla.

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

    public static void printArray(ArrayList<ProductGroup> array){

        for (ProductGroup pg: array) {
            // atlikti pagrindini veikla su vaiku
            if(pg.getChildren().size() > 0){
                // jeigu vaike yra vaiku vaikai - tai spausdint vaiku vaikus.
                printArray(pg.getChildren());
            }
        }
    }

}
