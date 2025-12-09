

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package view;
import bean.LfsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @authoru 07881974109
 */
public class ControlerUsuarios extends AbstractTableModel {
    private List lista;
    
    
    public void setList(List lista){
      this.lista = lista;
    }
    
    public LfsUsuario getBean(int rowIndex){
     return (LfsUsuario) lista.get(rowIndex);
     
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
        
           LfsUsuario usuarios = (LfsUsuario) lista.get(rowIndex);
           
           if(columnIndex == 0) return usuarios.getLfsIdusuario();
           if(columnIndex == 1) return usuarios.getLfsNome();
           if(columnIndex == 2) return usuarios.getLfsCpf();
           if(columnIndex == 3) return usuarios.getLfsAtivo();
               
                  return "";

    }
      
    public String getColumnName(int column) {
      if(column == 0) return "codigo";
      if(column == 1) return "Nome";
      if(column == 2) return "cpf";
      if(column == 3) return "Ativo";
      return "";
    }
}
