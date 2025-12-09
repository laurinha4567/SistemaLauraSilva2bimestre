/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LfsVenda;
import bean.LfsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVenda extends AbstractTableModel {

    private List lstLfsVenda;

    public void setList(List lstMscAparelhos) {
        this.lstLfsVenda = lstMscAparelhos;
        this.fireTableDataChanged();
        
    }
    
    public LfsVenda getBean(int rowIndex) {
        return (LfsVenda) lstLfsVenda.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLfsVenda.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LfsVenda lfsvenda = (LfsVenda) lstLfsVenda.get( rowIndex);
        if ( columnIndex == 0 ){
            return lfsvenda.getLfsIdVenda();
        } else if (columnIndex ==1) {
            return lfsvenda.getLfsCliente();            
        } else if (columnIndex ==2) {
            return lfsvenda.getLfsTotal();
        } 
        
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "id";
        } else if ( columnIndex == 1) {
            return "Cliente";               
        }  else if ( columnIndex == 2) {
            return "Total";
        } 
        return "";
    }
}
