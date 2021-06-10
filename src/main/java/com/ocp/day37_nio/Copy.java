
package com.ocp.day37_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
    public static void main(String[] args)  throws  Exception{
        //來源端
        Path source = Paths.get("src\\main\\java\\com\\ocp\\day36_io\\files\\car.jpg"); 
        //目的端
        Path dest = Paths.get("src\\main\\java\\com\\ocp\\day37_nio\\car.jpg"); 
        //如目的端有檔案 則出現 FileAlreadyExistsException 錯誤
        //表示檔案已經存在
        //Files.copy(source, dest);
        //如果目的端 有存在同樣檔案的話 就 (取代) 掉
        //StandardCopyOption.REPLACE_EXISTING
        Files.copy(source, dest , StandardCopyOption.REPLACE_EXISTING);
        
    }
    
}
