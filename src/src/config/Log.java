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
    
    /** 
     * get log instance
     * @return Log reutrn Log instance
     */
    // getinstance use to get only available object
    public static Log getInstance(){
        if(instance == null){
            instance = new Log();
        }
        return instance;
    }
    /**
     * create log with name pasure.log
     */
    public void createLog(){
        try {
            file = new File("pasur.log");
            outStream = new FileWriter(file);
        } catch (Exception e) {
    
        }  
    }
    
    /** 
     * write information to the pasur.log (type string)
     * @param str game information
     */
    public void writeToLog(String str){
        try {
            outStream.write(str);
        } catch (Exception e) {

        }
        
    }
    /**
     * close the opened log to save
     */
    public void closeLog(){
        try {
            outStream.close();
        } catch (Exception e) {

        }
    }
    

}
