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
 * @author Evan
 */
public class Player implements Serializable{
    private String name;
    private String coveName;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoveName() {
        return coveName;
    }

    public void setCoveName(String coveName) {
        this.coveName = coveName;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", coveName=" + coveName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.coveName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.coveName, other.coveName)) {
            return false;
        }
        return true;
    }
    
    
    
}
