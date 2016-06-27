/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jkbry
 */
public class Sea implements Serializable{
    
    //class instance variables
    private Location startLocation;
    private Location endLocation;

    public Sea() {
    }
    

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    @Override
    public String toString() {
        return "Sea{" + "startLocation=" + startLocation + ", endLocation=" + endLocation + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.startLocation);
        hash = 97 * hash + Objects.hashCode(this.endLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sea other = (Sea) obj;
        if (!Objects.equals(this.startLocation, other.startLocation)) {
            return false;
        }
        if (!Objects.equals(this.endLocation, other.endLocation)) {
            return false;
        }
        return true;
    }
    
    
    
}
