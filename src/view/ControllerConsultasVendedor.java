/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LfsVendedor;
import bean.LfsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVendedor extends AbstractTableModel {

    private List lstLfsVendedor;

    public void setList(List lstServicos) {
        this.lstLfsVendedor = lstServicos;
        this.fireTableDataChanged();
        
    }
    
    public LfsVendedor getBean(int rowIndex) {
        return (LfsVendedor) lstLfsVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLfsVendedor.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LfsVendedor lfsvendedor = (LfsVendedor) lstLfsVendedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return lfsvendedor.getIdlfsVendedor();
        } else if (columnIndex ==1) {
            return lfsvendedor.getLfsNome();        
        } else if (columnIndex ==2) {
            return lfsvendedor.getLfsSalario();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome do Vendedor";         
        } else if ( columnIndex == 2) {
            return "Salario";
        } 
        return "";
    }
}
