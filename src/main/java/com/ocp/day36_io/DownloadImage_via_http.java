package com.ocp.day36_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownloadImage_via_http {

    public static void main(String[] args) throws Exception {
        String frompath = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(frompath);

        String savePath = "C:\\Users\\ABC\\javacode\\Java0316\\src\\main\\java\\com\\ocp\\day36_io\\files\\car.jpg";
        try (//讀
                InputStream is = url.openConnection().getInputStream();) {

            //寫入
            FileOutputStream fos = new FileOutputStream(savePath, false);

            int ch = 0;
            //byte [] ch = new byte [is.available()];//available 資料長度
            //邊讀邊寫
            while ((ch = is.read()) != -1) { //邊讀
                System.out.print(ch); //邊寫
                fos.write(ch);
            }
        } catch (Exception e) {
        }
    }

}
