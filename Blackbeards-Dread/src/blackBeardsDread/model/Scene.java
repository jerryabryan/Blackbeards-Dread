/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;

/**
 *
 * @author Evan
 */
public class Scene {
    private LocationScene locationScene;
    private Battle battle;
    private String description;
    private String mapSymbol;

    public LocationScene getLocationScene() {
        return locationScene;
    }

    public void setLocationScene(LocationScene locationScene) {
        this.locationScene = locationScene;
    }

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
    
}
