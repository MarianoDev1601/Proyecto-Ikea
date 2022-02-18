package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Leg_Producer {
    private int leg_pdc;
    private int leg_stg;
    private int max_leg_pdc;
    private int max_leg_stg;
    
    public Leg_Producer(int leg_pdc, int leg_stg){
        
        this.leg_pdc = leg_pdc;
        this.leg_stg = leg_stg;
        this.max_leg_pdc = 4;
        this.max_leg_stg = 34;
    }

    /**
     * @return the leg_pdc
     */
    public int getLeg_pdc() {
        return leg_pdc;
    }

    /**
     * @param leg_pdc the leg_pdc to set
     */
    public void setLeg_pdc(int leg_pdc) {
        this.leg_pdc = leg_pdc;
    }

    /**
     * @return the leg_stg
     */
    public int getLeg_stg() {
        return leg_stg;
    }

    /**
     * @param leg_stg the leg_stg to set
     */
    public void setLeg_stg(int leg_stg) {
        this.leg_stg = leg_stg;
    }

    /**
     * @return the max_leg_pdc
     */
    public int getMax_leg_pdc() {
        return max_leg_pdc;
    }

    /**
     * @return the max_leg_stg
     */
    public int getMax_leg_stg() {
        return max_leg_stg;
    }
}
