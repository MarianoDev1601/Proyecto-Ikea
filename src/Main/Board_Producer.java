package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Board_Producer {
    private int board_pdc;
    private int board_stg;
    private int max_board_pdc;
    private int max_board_stg;
    
    //Constructor
    public Board_Producer(int board_pdc, int board_stg){
        this.board_pdc = board_pdc;
        this.board_stg = board_stg;
        this.max_board_pdc = 4;
        this.max_board_stg = 12;
    }

    /**
     * @return the board_pdc
     */
    public int getBoard_pdc() {
        return board_pdc;
    }

    /**
     * @param board_pdc the board_pdc to set
     */
    public void setBoard_pdc(int board_pdc) {
        this.board_pdc = board_pdc;
    }

    /**
     * @return the board_stg
     */
    public int getBoard_stg() {
        return board_stg;
    }

    /**
     * @param board_stg the board_stg to set
     */
    public void setBoard_stg(int board_stg) {
        this.board_stg = board_stg;
    }

    /**
     * @return the max_board_pdc
     */
    public int getMax_board_pdc() {
        return max_board_pdc;
    }

    /**
     * @return the max_board_stg
     */
    public int getMax_board_stg() {
        return max_board_stg;
    }
}
