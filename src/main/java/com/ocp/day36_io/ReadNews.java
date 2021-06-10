
package com.ocp.day36_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadNews {
    public static void main(String[] args) {
        String newpath = "src\\main\\java\\com\\ocp\\day36_io\\files\\news.txt";
        //老師寫法
        try (FileInputStream fir = new FileInputStream(newpath)){
            InputStreamReader inputstream = new InputStreamReader(fir , "UTF-8");
            BufferedReader br = new BufferedReader(inputstream);
            
            String data = null;
            while((data = br.readLine()) != null){
                System.out.println(data);
            }
        } catch (Exception e) {
        }
        /*
        try (FileReader fr = new FileReader(newpath)){
            InputStream inputstream = new FileInputStream(newpath);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
            
            String data = null;
            
            while((data = br.readLine()) != null){ //data逐行讀取 如果內容不為空直
                System.out.println(data); // 就印出 data 內容
            }
        } catch (Exception e) {
        }
*/
    }
    
}
