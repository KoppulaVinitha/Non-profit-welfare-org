/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Logger {
    private static Logger logs;
    private FileWriter writer;
    private File file;
    private final String LOG_FILE_PATH = "./Logs.txt";
    private final String EXCEPTION_LOG_FILE_PATH = "./ExceptionLogs.txt";
    private Logger(){
        file = new File(LOG_FILE_PATH);
            if(file.exists()){
                file.delete();
            }
    }
    public static Logger getInstance(){
        if(logs == null){
            logs = new Logger();
        }
        return logs;
    }
    public void writeLogs(String s){
        String logs = "";
        try {
            FileWriter writer = new FileWriter(LOG_FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            bufferedWriter.write(s);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    public void exceptionLogs(Exception ex){
        String logs = "";
        try {
            FileWriter writer = new FileWriter(EXCEPTION_LOG_FILE_PATH, true);
                PrintWriter pw = new PrintWriter (writer);
                pw.println("-----------------------------------------------------------------------------");
                pw.println(new Date());
                ex.printStackTrace (pw);
                pw.close();
                JOptionPane.showMessageDialog(null, "Exception Occured. View exception logs for details.","Error",JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
            }
 
    }
}
