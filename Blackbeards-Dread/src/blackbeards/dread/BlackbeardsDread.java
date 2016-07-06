/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackbeards.dread;

import blackBeardsDread.View.BattleSequenceView;
import blackBeardsDread.View.MoveLocationView;
import blackBeardsDread.View.StartProgramView;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jkbry
 */
public class BlackbeardsDread {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BlackbeardsDread.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BlackbeardsDread.inFile = inFile;
    }
    
    public static void main(String[] args) {
    
        try {
        
            BlackbeardsDread.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
    
            BlackbeardsDread.outFile = new PrintWriter(System.out, true);            
            
            String filePath = "log.txt";
            BlackbeardsDread.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
    
            startProgramView.displayStartProgramView();
        
        } 
        
        catch (Throwable te) {
            System.out.println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
        
            te.printStackTrace();
        }        
    
        finally{
            try {
                if (BlackbeardsDread.inFile != null)
                    BlackbeardsDread.inFile.close();
            
                if (BlackbeardsDread.outFile != null)
                    BlackbeardsDread.outFile.close();
                
                if (BlackbeardsDread.logFile != null)
                    BlackbeardsDread.logFile.close();
            } 
            
            catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
        
        
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BlackbeardsDread.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BlackbeardsDread.player = player;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        BlackbeardsDread.logFile = logFile;
    }

}
