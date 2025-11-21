/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.LfsVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07881974109
 */
public class ControlerVenda extends AbstractTableModel {
   private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public LfsVenda getBean(int rowIndex) {
        return(LfsVenda) lista.get(rowIndex);

    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    
    public Object getValueAt(int rowIndex, int columnIndex) {

        LfsVenda usuarios = (LfsVenda) lista.get(rowIndex);

        if (columnIndex == 0) {
            return usuarios.getLfsIdVenda();
        }
        if (columnIndex == 1) {
            return usuarios.getLfsCliente();
        }
        if (columnIndex == 2) {
            return usuarios.getLfsVendedor();
        }

        return "";

    }

   @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "codigo";
        }
        if (column == 1) {
            return "Clientes";
        }
        if (column == 2) {
            return "Vendedor";
        }

        return "";
    }
}
