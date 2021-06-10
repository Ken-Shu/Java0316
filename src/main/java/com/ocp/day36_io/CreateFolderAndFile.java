
package com.ocp.day36_io;

import java.io.File;

public class CreateFolderAndFile {
    public static void main(String[] args) throws Exception{
        //想在 day36_io 資料夾下面建立 files 的資料夾
        File folder = new File("src\\main\\java\\com\\ocp\\day36_io/files");
        if(!folder.exists()){ //如果 folder 不存在的話
            folder.mkdir(); //建立資料夾
        }
        //然後 day36_io/files 資料夾下面建立 salary.txt 的檔案
        if(folder.exists()){
           File f = new File("src\\main\\java\\com\\ocp\\day36_io/files/salary.txt");
           if(!f.exists()){
               f.createNewFile(); //建立檔案
           }
        }
        File f2 = new File("src\\main\\java\\com\\ocp\\day36_io/files/salary.txt");
        System.out.println(f2.isDirectory()); //是否為目錄
        System.out.println(f2.isFile()); //是否為檔案
    }
    
}
