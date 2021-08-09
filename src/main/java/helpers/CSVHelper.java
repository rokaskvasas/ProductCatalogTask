package helpers;

import models.ProductGroup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVHelper {

    public static void readCsv(ArrayList<ProductGroup> array,String path) throws IOException {

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
                String[] productData = textLine.split(";");

                array.add( new ProductGroup(Integer.parseInt(productData[0]), (productData[1].equals("Null"))? 0 : Integer.parseInt(productData[1]), productData[2]));
                //array.add(new ProductGroup(Integer.parseInt(productData[0]),Integer.parseInt((productData[1].equals("Null"))? "0" : productData[1]),productData[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            br.close();
        }


    }
}
