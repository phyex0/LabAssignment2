package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperaitons  {

    public static void readFile(ProductArray p,String s, boolean sortedInsertionFunc) throws IOException {
        int i=0;
        //src/com/company/ProductList.txt
        //src/com/company/Products.txt
        String path="src/com/company/"+s;
        File f = new File(path);
        if(!f.exists())
            f.createNewFile();
        else{

            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while((line=br.readLine())!=null){
                String[] input = line.split(",");

                Product product = new Product(input[0],input[1],Double.parseDouble(input[2]));
                if(sortedInsertionFunc)
                    p.sortedInsert(product);
                else
                    p.insert(product);
            }
            br.close();
            fr.close();
        }

    }


}
