/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.LfsVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
//abc
/**
 *
 * @author u07881974109
 */
public class ControlerVendedor extends AbstractTableModel {

   private  List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public LfsVendedor getBean(int rowIndex) {
        return (LfsVendedor)lista.get(rowIndex);

    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        LfsVendedor vendedor = (LfsVendedor) lista.get(rowIndex);

        if (columnIndex == 0) return vendedor.getIdlfsVendedor();  
        if (columnIndex == 1) return vendedor.getLfsNome();   
        if (columnIndex == 2) return vendedor.getLfsCpf();
        if (columnIndex == 2) return vendedor.getLfsDataNascimento();
        
        

        return "";

    }

    public String getColumnName(int column) {
        if (column == 0) return "codigo";   
        if (column == 1) return "Nome"; 
        if (column == 2) return "cpf";
        if (column == 2) return "Data de nascimento";
        

        return "";
    }
}
