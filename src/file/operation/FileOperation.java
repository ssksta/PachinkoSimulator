package file.operation;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {

    private File file;
    private boolean isFile;
    private boolean existsFile;
    private Charset charset = StandardCharsets.UTF_8;

    public FileOperation(String filePath){
        file = new File(filePath);
        isFile = file.isFile();
        existsFile = file.exists();
    }

    public void setCharset(String charset){
        this.charset = Charset.forName(charset);
    }
    public void saveFile(List<String>txtList){
        saveFile(txtList,true);
    }

    public void overwriteFile(List<String>txtList){
        saveFile(txtList,false);
    }

    private void saveFile(List<String>txtList, boolean isNewFile){
        if(!existsFile){
            System.out.println("Does not exist : "+file.getPath());
            return;
        }
        if(!isFile){
            System.out.println("Not a File : "+file.getPath());
            return;
        }
        try{
            FileWriter filewriter = new FileWriter(file, charset, isNewFile);
            for(String txt:txtList){
                filewriter.write(txt+"\r\n");
            }
            filewriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<String> readFile(){
        if(!existsFile){
            System.out.println("Does not exist : "+file.getPath());
            return null;
        }
        if(!isFile){
            System.out.println("Not a File : "+file.getPath());
            return null;
        }
        List<String> lines = new ArrayList<>();
        String readFilePath = file.getPath();
        try {
            lines = Files.readAllLines(Paths.get(readFilePath), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

}

