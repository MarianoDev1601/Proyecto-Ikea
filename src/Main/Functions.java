package Main;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Functions {
    
    public void write_csv(Node aux) {

        try {
            CsvWriter csvwriter = new CsvWriter("test/data.csv");
            String[] title = {"Day_Duration", "Day", "Max_Leg_Stg", "Max_Screw_Stg", "Max_Board_Stg", "Init_Leg_Pdc", "Init_Screw_Pdc", "Init_Board_Pdc", "Init_Assembler", "Max_Leg_Pdc", "Max_Screw_Pdc", "Max_Board_Pdc", "Max_Assembler"};
            csvwriter.writeRecord(title);
            String[] data = {Integer.toString(aux.getDay_Time()), Integer.toString(aux.getDay()), Integer.toString(aux.getMax_leg_stg()), Integer.toString(aux.getMax_screw_stg()), Integer.toString(aux.getMax_board_stg()), Integer.toString(aux.getInit_leg_pdc()), Integer.toString(aux.getInit_screw_pdc()), Integer.toString(aux.getInit_board_pdc()), Integer.toString(aux.getInit_asb()), Integer.toString(aux.getMax_leg_pdc()), Integer.toString(aux.getMax_screw_pdc()), Integer.toString(aux.getMax_board_pdc()), Integer.toString(aux.getMax_asb())};
            csvwriter.writeRecord(data);
            aux = aux.getpNext();
            csvwriter.close();
            JOptionPane.showMessageDialog(null, "Informacion guardada con exito");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al guardar la información");
        }
    }

    public void read_csv(Assembler assembler, Boss boss, Manager manager, Screw_Producer screw_producer) {
        String line;
        Node info = new Node(0,0,0,0,0,0);
        String data_csv = "";
        String path = "test/data.csv";
        File file = new File(path);
        try {
            
            if (!file.exists()) {
                
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    
                    if (!line.isEmpty()) {
                        data_csv += line + "\n";                        
                    }
                }
                if (!"".equals(data_csv)) {
                    String[] data_split = data_csv.split("\n");
                    for (int i = 0; i < data_split.length; i++) {
                        if(!data_split[i].equals("Day_Duration,Day,Max_Leg_Stg,Max_Screw_Stg,Max_Board_Stg,Init_Leg_Pdc,Init_Screw_Pdc,Init_Board_Pdc,Init_Assembler,Max_Leg_Pdc,Max_Screw_Pdc,Max_Board_Pdc,Max_Assembler") ){
                        String[] data = data_split[i].split(",");
                        Node x = new Node(Integer.parseInt(data[0]), Integer.parseInt(data[1]),Integer.parseInt(data[5]),Integer.parseInt(data[6]),Integer.parseInt(data[7]),Integer.parseInt(data[8]));
                        info = x;
                        }
                    }
                    
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Exito al leer.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al leer.");
        }
    }
}
