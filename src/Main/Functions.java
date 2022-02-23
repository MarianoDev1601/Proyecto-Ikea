package Main;

import com.csvreader.CsvWriter;
import interfazSO.interfazSoMain;
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
            JOptionPane.showMessageDialog(null, "Informacion guardada con exito", "Sistema de guardado.", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al guardar la información", "Sistema de seguridad.", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Exito al leer.", "Sistema de guardado.", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al leer.", "Sistema de seguridad.", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void turnOnMenu(){
        interfazSoMain menu = new interfazSoMain();
        System.out.println("La aplicacion se esta iniciando");
        try {
            menu.setVisible(true);
            System.out.println("La aplicacion inicio correctamente");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de inicio.", "Sistema de seguridad.", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public String contratar(int maxProductor, String productorN, String areaProductor){
        try {
            System.out.println("Agregar un productor de " + areaProductor +":");
            if(Integer.parseInt(productorN) < maxProductor){  // La empresa no puede costear mas de este numero de productores del tipo asignado.
                System.out.println("\n >> Cantidad de Productores de " + areaProductor + " anterior: " + Integer.parseInt(productorN) + "\n >> Cantidad de Productores de " + areaProductor +  " actualizada: " + (Integer.parseInt(productorN) + 1) + "\n");
                productorN = Integer.toString(Integer.parseInt(productorN) + 1); // Añade un nuevo productor
            }else{
                System.out.println("Operacion cancelada. Cantidad maxima de productores alcanzada. Max.Op: " + maxProductor);   // Se tiene el numero maximo de productores contemplados por la empresa
                JOptionPane.showMessageDialog(null, "Usuario, no hay presupuesto para contratar a mas de " + maxProductor + " productores en el area de " + areaProductor, "Oficina de administracion IKEA.", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error en ejecución de proceso.","Sistema de seguridad.", JOptionPane.ERROR_MESSAGE); // Para posibles errores
        }
        return productorN;
    }
    
    public String despedir(String productorN, String areaProductor){
        try {
            System.out.println("Despedir un productor de " + areaProductor +":");
            if(Integer.parseInt(productorN) > 1){  // La empresa debe tener almenos un productor
                System.out.println("\n >> Cantidad de Productores de " + areaProductor + " anterior: " + Integer.parseInt(productorN) + "\n >> Cantidad de Productores de " + areaProductor + " actualizada: " + (Integer.parseInt(productorN) - 1) + "\n");
                productorN = Integer.toString(Integer.parseInt(productorN) - 1); // quita a un productor
            }else{
                System.out.println("Operacion cancelada. No puedes dejar a la empresa sin productores de " + areaProductor + ".");   // Se tiene el numero minimo de productores contemplados por la empresa
                JOptionPane.showMessageDialog(null, "Usuario, no puedes dejar a la empresa sin productores de " + areaProductor + "\nSugerencia: Siempre manten almenos un productor de cada clase.", "Oficina de administracion IKEA.", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error en ejecución de proceso.","Sistema de seguridad.", JOptionPane.ERROR_MESSAGE);
        }
        return productorN;
    }
}

//        System.out.println("Agregar un productor de Tablas:");
//        if(Integer.parseInt(pawCount.getText()) <= 4){  // La empresa no puede costear mas de 4 productores de patas.
//            System.out.println("\n >> Cantidad de Productores de tablas anterior: " + Integer.parseInt(pawCount.getText()) + "\n >> Cantidad de Productores de tablas actualizada: " + (Integer.parseInt(pawCount.getText()) + 1) + "\n");
//            pawCount.setText(Integer.toString(Integer.parseInt(pawCount.getText()) + 1)); // Añade un nuevo productor
//        }else{
//            System.out.println("Operacion cancelada. Cantidad maxima de productores alcanzada.");   // Se tiene el numero maximo de productores contemplados por la empresa
//            JOptionPane.showMessageDialog(null, "Usuario, no hay presupuesto para contratar a mas de 4 productores en esta area", "Oficina de administracion IKEA.", JOptionPane.WARNING_MESSAGE);
//      }