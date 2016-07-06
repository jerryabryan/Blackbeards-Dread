/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackbeards.dread.BlackbeardsDread;
import java.io.PrintWriter;

/**
 *
 * @author jkbry
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = BlackbeardsDread.getOutFile();
    private static final PrintWriter logFile = BlackbeardsDread.getLogFile();
    
    
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "-----------------------------------------"
                  + "\n- Error - " + errorMessage
                  + "\n---------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
}
