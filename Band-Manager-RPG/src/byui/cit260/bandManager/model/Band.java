/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Wendi
 */
public class Band implements Serializable {
    
    // class instance variables
    private String name;
    private String bandMembers;
    private String location;

    public Band() {
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(String bandMembers) {
        this.bandMembers = bandMembers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.bandMembers);
        hash = 23 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "Band{" + "name=" + name + ", bandMembers=" + bandMembers + ", location=" + location + '}';
    }
       
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Band other = (Band) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.bandMembers, other.bandMembers)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
   
    
}
