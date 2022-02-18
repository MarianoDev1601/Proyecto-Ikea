package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Node {

    private Node pNext;
    private int day_Time;
    private int day;
    private int max_leg_stg;
    private int max_screw_stg;
    private int max_board_stg;
    private int init_leg_pdc;
    private int init_screw_pdc;
    private int init_board_pdc;
    private int init_asb;
    private int max_leg_pdc;
    private int max_screw_pdc;
    private int max_board_pdc;
    private int max_asb;

    // Constructor
    public Node(int day_Time, int day, int init_leg_pdc,int init_screw_pdc,int init_board_pdc,int init_asb) {
        this.pNext = null;
        this.day_Time = day_Time;
        this.day = day;
        this.init_leg_pdc = init_leg_pdc;
        this.init_screw_pdc = init_screw_pdc;
        this.init_board_pdc = init_board_pdc;
        this.init_asb = init_asb;
        max_leg_stg = 34;
        max_screw_stg = 300;
        max_board_stg = 12;
        max_leg_pdc = 4;
        max_screw_pdc = 3;
        max_board_pdc = 4;
        max_asb = 3;
    }

    public Node getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
        /**
     * @return the day_Time
     */
    public int getDay_Time() {
        return day_Time;
    }

    /**
     * @param day_Time the day_Time to set
     */
    public void setDay_Time(int day_Time) {
        this.day_Time = day_Time;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the max_leg_stg
     */
    public int getMax_leg_stg() {
        return max_leg_stg;
    }

    /**
     * @param max_leg_stg the max_leg_stg to set
     */
    public void setMax_leg_stg(int max_leg_stg) {
        this.max_leg_stg = max_leg_stg;
    }

    /**
     * @return the max_screw_stg
     */
    public int getMax_screw_stg() {
        return max_screw_stg;
    }

    /**
     * @return the max_board_stg
     */
    public int getMax_board_stg() {
        return max_board_stg;
    }

    /**
     * @return the init_leg_pdc
     */
    public int getInit_leg_pdc() {
        return init_leg_pdc;
    }

    /**
     * @param init_leg_pdc the init_leg_pdc to set
     */
    public void setInit_leg_pdc(int init_leg_pdc) {
        this.init_leg_pdc = init_leg_pdc;
    }

    /**
     * @return the init_screw_pdc
     */
    public int getInit_screw_pdc() {
        return init_screw_pdc;
    }

    /**
     * @param init_screw_pdc the init_screw_pdc to set
     */
    public void setInit_screw_pdc(int init_screw_pdc) {
        this.init_screw_pdc = init_screw_pdc;
    }

    /**
     * @return the init_board_pdc
     */
    public int getInit_board_pdc() {
        return init_board_pdc;
    }

    /**
     * @param init_board_pdc the init_board_pdc to set
     */
    public void setInit_board_pdc(int init_board_pdc) {
        this.init_board_pdc = init_board_pdc;
    }

    /**
     * @return the init_asb
     */
    public int getInit_asb() {
        return init_asb;
    }

    /**
     * @param init_asb the init_asb to set
     */
    public void setInit_asb(int init_asb) {
        this.init_asb = init_asb;
    }

    /**
     * @return the max_leg_pdc
     */
    public int getMax_leg_pdc() {
        return max_leg_pdc;
    }

    /**
     * @return the max_screw_pdc
     */
    public int getMax_screw_pdc() {
        return max_screw_pdc;
    }

    /**
     * @return the max_board_pdc
     */
    public int getMax_board_pdc() {
        return max_board_pdc;
    }

    /**
     * @return the max_asb
     */
    public int getMax_asb() {
        return max_asb;
    }

}
