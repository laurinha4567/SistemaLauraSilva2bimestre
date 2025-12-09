/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LfsCliente;
import bean.LfsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasCliente extends AbstractTableModel {

    private List lstLfsCliente;

    public void setList(List lstLfsCliente) {
        this.lstLfsCliente = lstLfsCliente;
        this.fireTableDataChanged();
        
    }
    
    public LfsCliente getBean(int rowIndex) {
        return (LfsCliente) lstLfsCliente.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLfsCliente.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LfsCliente lfscliente = (LfsCliente) lstLfsCliente.get( rowIndex);
        if ( columnIndex == 0 ){
            return lfscliente.getIdlfsCliente();
        } else if (columnIndex ==1) {
            return lfscliente.getLfsNomeCompleto();        
        } else if (columnIndex ==2) {
            return lfscliente.getLfsCpf();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "id";
        } else if ( columnIndex == 1) {
            return "Nome Completo";         
        } else if ( columnIndex == 2) {
            return "CPF";
        } 
        return "";
    }
}
