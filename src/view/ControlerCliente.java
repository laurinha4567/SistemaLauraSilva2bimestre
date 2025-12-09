/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.LfsCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05084603105
 */
public class ControlerCliente extends AbstractTableModel {
   private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public LfsCliente getBean(int rowIndex) {
        return(LfsCliente) lista.get(rowIndex);

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

        LfsCliente usuarios = (LfsCliente) lista.get(rowIndex);

        if (columnIndex == 0) return usuarios.getIdlfsCliente();
        if (columnIndex == 1) return usuarios.getLfsNomeCompleto();
        if (columnIndex == 2) return usuarios.getLfsCpf();
        if (columnIndex == 2) return usuarios.getLfsCpf();
        if (columnIndex == 2) return usuarios.getLfsTelefone();
        

        return "";

    }

    public String getColumnName(int column) {
      if(column == 0) return "codigo";
      if(column == 1) return "Nome";
      if(column == 2) return "Cpf";
      if(column == 3) return "Telefone";
      return "";
    }
}
