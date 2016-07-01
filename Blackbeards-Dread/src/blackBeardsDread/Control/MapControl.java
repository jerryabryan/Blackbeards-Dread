/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Battle;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.LocationScene;
import blackBeardsDread.model.LocationScene.StoreType;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Scene;
import blackBeardsDread.model.SceneType;
import blackBeardsDread.model.Ship;
import blackBeardsDread.model.Ship.ShipType;
import blackbeards.dread.BlackbeardsDread;

/**
 *
 * @author Evan
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(7, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    public static void movePlayerToStartingLocation(Map map) {
        Location[][] locations = map.getLocations();
        map.setCurrentLocation(locations[0][0]);
    }
    
    public static int portToInt(Location location) {
        Game game = BlackbeardsDread.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        if (location == locations[0][0]) {
            return 0;
        } else if (location == locations[1][0]) {
            return 1;
        } else if (location == locations[2][0]) {
            return 2;
        } else if (location == locations[3][0]) {
            return 3;
        } else if (location == locations[4][0]) {
            return 4;
        } else if (location == locations[5][0]) {
            return 5;
        } else if (location == locations[6][0]) {
            return 6;
        } else {
            return -1;
        }
    }
    
    public static Location intToPort(int i) {
        Game game = BlackbeardsDread.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        Location location = locations[i][0];
        return location;
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene cove = new Scene();
        cove.setDescription("Hidden Cove");
        Battle battle0 = new Battle(0, 0, 0, ShipType.levelOne.ordinal() );
        cove.setBattle(battle0);
        cove.setLocationScene(null);
        cove.setMapSymbol(" COVE ");
        scenes[SceneType.cove.ordinal()] = cove;
        
        Scene londonDryDock = new Scene();
        londonDryDock.setDescription("London Dry Dock");
        Battle battle = new Battle(60, 50, 20, ShipType.levelOne.ordinal() );
        londonDryDock.setBattle(battle);
        LocationScene locationScene1 = new LocationScene(10, StoreType.dryDock.ordinal());
        londonDryDock.setLocationScene(locationScene1);
        londonDryDock.setMapSymbol(" DRY ");
        scenes[SceneType.dryDock1.ordinal()] = londonDryDock;
        
        Scene londonWaterStore = new Scene();
        londonWaterStore.setDescription("London Water Store");
        londonWaterStore.setBattle(null);
        LocationScene locationScene2 = new LocationScene(10, StoreType.waterStore.ordinal());
        londonWaterStore.setLocationScene(locationScene2);
        londonWaterStore.setMapSymbol(" WATER ");
        scenes[SceneType.waterStore1.ordinal()] = londonWaterStore;
        
        Scene londonFoodStore = new Scene();
        londonFoodStore.setDescription("London Food Store");
        londonFoodStore.setBattle(null);
        LocationScene locationScene3 = new LocationScene(10, StoreType.foodStore.ordinal());
        londonFoodStore.setLocationScene(locationScene3);
        londonFoodStore.setMapSymbol(" FOOD ");
        scenes[SceneType.foodStore1.ordinal()] = londonFoodStore;
        
        Scene londonArmory = new Scene();
        londonArmory.setDescription("London Armory");
        londonArmory.setBattle(null);
        LocationScene locationScene4 = new LocationScene(15, StoreType.armory.ordinal());
        londonArmory.setLocationScene(locationScene4);
        londonArmory.setMapSymbol(" ARMORY ");
        scenes[SceneType.armory1.ordinal()] = londonArmory;
        
        Scene londonGuildHall = new Scene();
        londonGuildHall.setDescription("London Guild Hall");
        londonGuildHall.setBattle(null);
        LocationScene locationScene5 = new LocationScene(5, StoreType.guildHall.ordinal());
        londonGuildHall.setLocationScene(locationScene5);
        londonGuildHall.setMapSymbol(" Guild ");
        scenes[SceneType.guildHall1.ordinal()] = londonGuildHall;
        
        Scene canaryIslandDryDock = new Scene();
        canaryIslandDryDock.setDescription("Canary Island Dry Dock");
        Battle battle2 = new Battle(75, 100, 40, ShipType.levelTwo.ordinal() );
        canaryIslandDryDock.setBattle(battle2);
        LocationScene locationScene6 = new LocationScene(20, StoreType.dryDock.ordinal());
        canaryIslandDryDock.setLocationScene(locationScene6);
        canaryIslandDryDock.setMapSymbol(" DRY ");
        scenes[SceneType.dryDock2.ordinal()] = canaryIslandDryDock;
        
        Scene canaryIslandWaterStore = new Scene();
        canaryIslandWaterStore.setDescription("Canary Island Water Store");
        canaryIslandWaterStore.setBattle(null);
        LocationScene locationScene7 = new LocationScene(15, StoreType.waterStore.ordinal());
        canaryIslandWaterStore.setLocationScene(locationScene7);
        canaryIslandWaterStore.setMapSymbol(" WATER ");
        scenes[SceneType.waterStore2.ordinal()] = canaryIslandWaterStore;
        
        Scene canaryIslandFoodStore = new Scene();
        canaryIslandFoodStore.setDescription("Canary Food Store");
        canaryIslandFoodStore.setBattle(null);
        LocationScene locationScene8 = new LocationScene(15, StoreType.foodStore.ordinal());
        canaryIslandFoodStore.setLocationScene(locationScene8);
        canaryIslandFoodStore.setMapSymbol(" FOOD ");
        scenes[SceneType.foodStore2.ordinal()] = canaryIslandFoodStore;
        
        Scene canaryIslandArmory = new Scene();
        canaryIslandArmory.setDescription("Canary Island Armory");
        canaryIslandArmory.setBattle(null);
        LocationScene locationScene9 = new LocationScene(25, StoreType.armory.ordinal());
        canaryIslandArmory.setLocationScene(locationScene9);
        canaryIslandArmory.setMapSymbol(" ARMORY ");
        scenes[SceneType.armory2.ordinal()] = canaryIslandArmory;
        
        Scene canaryIslandGuildHall = new Scene();
        canaryIslandGuildHall.setDescription("Canary Island Guild Hall");
        canaryIslandGuildHall.setBattle(null);
        LocationScene locationScene10 = new LocationScene(10, StoreType.guildHall.ordinal());
        canaryIslandGuildHall.setLocationScene(locationScene10);
        canaryIslandGuildHall.setMapSymbol(" Guild ");
        scenes[SceneType.guildHall2.ordinal()] = canaryIslandGuildHall;
        
        Scene bahamasDryDock = new Scene();
        bahamasDryDock.setDescription("Bahamas Dry Dock");
        Battle battle3 = new Battle(120, 200, 60, ShipType.levelThree.ordinal() );
        bahamasDryDock.setBattle(battle3);
        LocationScene locationScene11 = new LocationScene(30, StoreType.dryDock.ordinal());
        bahamasDryDock.setLocationScene(locationScene11);
        bahamasDryDock.setMapSymbol(" DRY ");
        scenes[SceneType.dryDock3.ordinal()] = bahamasDryDock;
        
        Scene bahamasWaterStore = new Scene();
        bahamasWaterStore.setDescription("Bahamas Water Store");
        bahamasWaterStore.setBattle(null);
        LocationScene locationScene12 = new LocationScene(20, StoreType.waterStore.ordinal());
        bahamasWaterStore.setLocationScene(locationScene12);
        bahamasWaterStore.setMapSymbol(" WATER ");
        scenes[SceneType.waterStore3.ordinal()] = bahamasWaterStore;
        
        Scene bahamasFoodStore = new Scene();
        bahamasFoodStore.setDescription("Bahamas Food Store");
        bahamasFoodStore.setBattle(null);
        LocationScene locationScene13 = new LocationScene(20, StoreType.foodStore.ordinal());
        bahamasFoodStore.setLocationScene(locationScene13);
        bahamasFoodStore.setMapSymbol(" FOOD ");
        scenes[SceneType.foodStore3.ordinal()] = bahamasFoodStore;
        
        Scene bahamasArmory = new Scene();
        bahamasArmory.setDescription("Bahamas Armory");
        bahamasArmory.setBattle(null);
        LocationScene locationScene14 = new LocationScene(35, StoreType.armory.ordinal());
        bahamasArmory.setLocationScene(locationScene14);
        bahamasArmory.setMapSymbol(" ARMORY ");
        scenes[SceneType.armory3.ordinal()] = bahamasArmory;
        
        Scene bahamasGuildHall = new Scene();
        bahamasGuildHall.setDescription("Bahamas Guild Hall");
        bahamasGuildHall.setBattle(null);
        LocationScene locationScene15 = new LocationScene(15, StoreType.guildHall.ordinal());
        bahamasGuildHall.setLocationScene(locationScene15);
        bahamasGuildHall.setMapSymbol(" Guild ");
        scenes[SceneType.guildHall3.ordinal()] = bahamasGuildHall;
        
        Scene guadalajaraDryDock = new Scene();
        guadalajaraDryDock.setDescription("Guadalajara Dry Dock");
        Battle battle4 = new Battle(150, 300, 80, ShipType.levelThree.ordinal() );
        guadalajaraDryDock.setBattle(battle4);
        LocationScene locationScene16 = new LocationScene(40, StoreType.dryDock.ordinal());
        guadalajaraDryDock.setLocationScene(locationScene16);
        guadalajaraDryDock.setMapSymbol(" DRY ");
        scenes[SceneType.dryDock4.ordinal()] = guadalajaraDryDock;
        
        Scene guadalajaraWaterStore = new Scene();
        guadalajaraWaterStore.setDescription("Guadalajara Water Store");
        guadalajaraWaterStore.setBattle(null);
        LocationScene locationScene17 = new LocationScene(25, StoreType.waterStore.ordinal());
        guadalajaraWaterStore.setLocationScene(locationScene17);
        guadalajaraWaterStore.setMapSymbol(" WATER ");
        scenes[SceneType.waterStore4.ordinal()] = guadalajaraWaterStore;
        
        Scene guadalajaraFoodStore = new Scene();
        guadalajaraFoodStore.setDescription("Guadalajara Food Store");
        guadalajaraFoodStore.setBattle(null);
        LocationScene locationScene18 = new LocationScene(25, StoreType.foodStore.ordinal());
        guadalajaraFoodStore.setLocationScene(locationScene18);
        guadalajaraFoodStore.setMapSymbol(" FOOD ");
        scenes[SceneType.foodStore4.ordinal()] = guadalajaraFoodStore;
        
        Scene guadalajaraArmory = new Scene();
        guadalajaraArmory.setDescription("Guadalajara Armory");
        guadalajaraArmory.setBattle(null);
        LocationScene locationScene19 = new LocationScene(45, StoreType.armory.ordinal());
        guadalajaraArmory.setLocationScene(locationScene19);
        guadalajaraArmory.setMapSymbol(" ARMORY ");
        scenes[SceneType.armory4.ordinal()] = guadalajaraArmory;
        
        Scene guadalajaraGuildHall = new Scene();
        guadalajaraGuildHall.setDescription("Guadalajara Guild Hall");
        guadalajaraGuildHall.setBattle(null);
        LocationScene locationScene20 = new LocationScene(20, StoreType.guildHall.ordinal());
        guadalajaraGuildHall.setLocationScene(locationScene20);
        guadalajaraGuildHall.setMapSymbol(" Guild ");
        scenes[SceneType.guildHall4.ordinal()] = guadalajaraGuildHall;
        
        Scene floridaKeysDryDock = new Scene();
        floridaKeysDryDock.setDescription("Florida Keys Dry Dock");
        Battle battle5 = new Battle(175, 400, 100, ShipType.levelThree.ordinal() );
        floridaKeysDryDock.setBattle(battle5);
        LocationScene locationScene21 = new LocationScene(50, StoreType.dryDock.ordinal());
        floridaKeysDryDock.setLocationScene(locationScene21);
        floridaKeysDryDock.setMapSymbol(" DRY ");
        scenes[SceneType.dryDock5.ordinal()] = floridaKeysDryDock;
        
        Scene floridaKeysWaterStore = new Scene();
        floridaKeysWaterStore.setDescription("Florida Keys Water Store");
        floridaKeysWaterStore.setBattle(null);
        LocationScene locationScene22 = new LocationScene(30, StoreType.waterStore.ordinal());
        floridaKeysWaterStore.setLocationScene(locationScene22);
        floridaKeysWaterStore.setMapSymbol(" WATER ");
        scenes[SceneType.waterStore5.ordinal()] = floridaKeysWaterStore;
        
        Scene floridaKeysFoodStore = new Scene();
        floridaKeysFoodStore.setDescription("Florida Keys Food Store");
        floridaKeysFoodStore.setBattle(null);
        LocationScene locationScene23 = new LocationScene(30, StoreType.foodStore.ordinal());
        floridaKeysFoodStore.setLocationScene(locationScene23);
        floridaKeysFoodStore.setMapSymbol(" FOOD ");
        scenes[SceneType.foodStore5.ordinal()] = floridaKeysFoodStore;
        
        Scene floridaKeysArmory = new Scene();
        floridaKeysArmory.setDescription("Florida Keys Armory");
        floridaKeysArmory.setBattle(null);
        LocationScene locationScene24 = new LocationScene(55, StoreType.armory.ordinal());
        floridaKeysArmory.setLocationScene(locationScene24);
        floridaKeysArmory.setMapSymbol(" ARMORY ");
        scenes[SceneType.armory5.ordinal()] = floridaKeysArmory;
        
        Scene floridaKeysGuildHall = new Scene();
        floridaKeysGuildHall.setDescription("Florida Keys Guild Hall");
        floridaKeysGuildHall.setBattle(null);
        LocationScene locationScene25 = new LocationScene(25, StoreType.guildHall.ordinal());
        floridaKeysGuildHall.setLocationScene(locationScene25);
        floridaKeysGuildHall.setMapSymbol(" Guild ");
        scenes[SceneType.guildHall5.ordinal()] = floridaKeysGuildHall;
        
        Scene finalBattle = new Scene();
        finalBattle.setDescription("You are now Fighting BlackBeard");
        Battle battle6 = new Battle(1000000, 500, 120, ShipType.blackbeard.ordinal());
        finalBattle.setBattle(battle6);
        finalBattle.setLocationScene(null);
        finalBattle.setMapSymbol(" BB  ");
        scenes[SceneType.finalBattle.ordinal()] = finalBattle;
        
        Scene empty = new Scene();
        empty.setDescription("");
        empty.setBattle(null);
        empty.setLocationScene(null);
        empty.setMapSymbol(" empty ");
        scenes[SceneType.empty.ordinal()] = empty;
                

        return scenes;
    }
    
}
