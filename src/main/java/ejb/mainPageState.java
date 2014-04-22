/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author ndaley
 */
@Named(value = "mainPageState")
@SessionScoped
public class mainPageState implements Serializable {
    private boolean mapVisible;

    @PostConstruct
    public void init() {
        mapVisible = false;
    }

    public boolean getMapVisible() {
        return mapVisible;
    }

    public void setMapVisible(boolean mapVisible) {
        this.mapVisible = mapVisible;
    }
    
    public void showMap(){
        mapVisible=true;
    }

    /**
     * Creates a new instance of mainPageState
     */
    public mainPageState() {
    }

}
