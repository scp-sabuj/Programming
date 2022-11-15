/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author SABUJ CHANDRA PAUL
 */
public class FileReadAndWrite {


    public static void main(String[] args) throws IOException {
        
        String path = "testfile.txt";

        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        String contents = sb.toString();
        System.out.println(contents);
    }
}
