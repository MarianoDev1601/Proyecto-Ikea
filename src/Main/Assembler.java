package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Assembler {
    private int assembler;
    private int desk;
    private int max_assembler;
    
    //Constructor
    public Assembler(int assembler, int desk){
        this.assembler = assembler;
        this.desk = desk;
        this.max_assembler = 3;
    }

    /**
     * @return the assembler
     */
    public int getAssembler() {
        return assembler;
    }

    /**
     * @param assembler the assembler to set
     */
    public void setAssembler(int assembler) {
        this.assembler = assembler;
    }

    /**
     * @return the desk
     */
    public int getDesk() {
        return desk;
    }

    /**
     * @param desk the desk to set
     */
    public void setDesk(int desk) {
        this.desk = desk;
    }

    /**
     * @return the max_assembler
     */
    public int getMax_assembler() {
        return max_assembler;
    }
}
