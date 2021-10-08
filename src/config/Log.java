package config;
/**
 * use singleton pattern to implemnt write log class.
 */
import java.io.File;
import java.io.FileWriter;

public class Log {
    private static Log instance = new Log();
    private FileWriter outStream;
    private File file;
    // private constructor to avoding other class access this constructor 
    private Log(){

    }
    // getinstance use to get only available object
    public static Log getInstance(){
        if(instance == null){
            instance = new Log();
        }
        return instance;
    }
    // create Pasure.log file and assign to outstream
    // for wrtting later on
    public void createLog(){
        try {
            file = new File("Pasure.log");
            outStream = new FileWriter(file);
        } catch (Exception e) {
    
        }
        
        
    }
    // write corresponding information to the outStream
    public void writeToLog(String str){
        try {
            outStream.write(str);
        } catch (Exception e) {

        }
        
    }
    // close the outStream to save the file
    public void closeLog(){
        try {
            outStream.close();
        } catch (Exception e) {

        }
    }
    

}
