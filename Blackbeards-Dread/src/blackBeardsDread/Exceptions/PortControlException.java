/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Exceptions;

/**
 *
 * @author jkbry
 */
public class PortControlException extends Exception {

    public PortControlException() {
    }

    public PortControlException(String message) {
        super(message);
    }

    public PortControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PortControlException(Throwable cause) {
        super(cause);
    }

    public PortControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
