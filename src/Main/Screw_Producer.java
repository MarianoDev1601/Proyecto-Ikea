package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Screw_Producer {
    
    private int screw_pdc;
    private int screw_stg;
    private int max_screw_stg;
    private int max_screw_pdc;
    
    //Constructor
    public Screw_Producer( int screw_pdc, int screw_stg){
        this.screw_pdc = screw_pdc;
        this.screw_stg = screw_stg;
        this.max_screw_stg = 300;
        this.max_screw_pdc = 3;
    }

    /**
     * @return the screw_pdc
     */
    public int getScrew_pdc() {
        return screw_pdc;
    }

    /**
     * @param screw_pdc the screw_pdc to set
     */
    public void setScrew_pdc(int screw_pdc) {
        this.screw_pdc = screw_pdc;
    }

    /**
     * @return the screw_stg
     */
    public int getScrew_stg() {
        return screw_stg;
    }

    /**
     * @param screw_stg the screw_stg to set
     */
    public void setScrew_stg(int screw_stg) {
        this.screw_stg = screw_stg;
    }

    /**
     * @return the max_screw_stg
     */
    public int getMax_screw_stg() {
        return max_screw_stg;
    }

    /**
     * @return the max_screw_pdc
     */
    public int getMax_screw_pdc() {
        return max_screw_pdc;
    }
}
