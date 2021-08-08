package helpers;

import models.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVHelper {

    public static void readCsv(ArrayList<Product> array,String path) throws IOException {

        BufferedReader br=null;
        String textLine;
        int counter =0;
        try{
            br = new BufferedReader(new FileReader(path));
            while((textLine = br.readLine())!=null){
                counter++;
                if(counter ==1){
                    continue;
                }
                String[]productData = textLine.split(";");
                if(productData[1].equals("Null")){
                    productData[1]="0";
                }
                array.add(new Product(Integer.parseInt(productData[0]),Integer.parseInt(productData[1]),productData[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert br != null;
            br.close();
        }


    }
}
