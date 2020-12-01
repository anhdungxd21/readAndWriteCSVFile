package csv;


import peron.Student;

import java.io.*;

public class CSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void csvReader(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        String line = "";
        try{
            if(!file.exists()) {
                System.out.println("File not found!");
                return;
            }
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null){
                String[] student = line.split(COMMA_DELIMITER);
                System.out.println("peron.Student [id=" + student[0]+",name="+student[1]+",result="+student[2]+"]");
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bufferedReader !=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void csvWriter(String path, Student student){
        File file = new File(path);
        FileWriter fileWriter = null;
        try{
            if(!file.exists()){
                file.createNewFile();
            }

                fileWriter = new FileWriter(file,true);
                fileWriter.append(student.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getResult());
                fileWriter.append(NEW_LINE_SEPARATOR);



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                try {
                    System.out.println("Write success!");
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
