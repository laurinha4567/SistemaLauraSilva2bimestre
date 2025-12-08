/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LfsJogos;
import bean.LfsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasJogos extends AbstractTableModel {

    private List LfsJogos;

    public void setList(List lstMscAparelhos) {
        this.LfsJogos = lstMscAparelhos;
        this.fireTableDataChanged();
        
    }
    
    public LfsJogos getBean(int rowIndex) {
        return (LfsJogos) LfsJogos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return LfsJogos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LfsJogos aparelhos = (LfsJogos) LfsJogos.get( rowIndex);
        if ( columnIndex == 0 ){
            return aparelhos.getLfsIdJogo();
        } else if (columnIndex ==1) {
            return aparelhos.getLfsNomeJogo();        
        } else if (columnIndex ==2) {
            return aparelhos.getLfsPreco();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Marca";         
        } else if ( columnIndex == 2) {
            return "Valor Unitario";
        } 
        return "";
    }
}
