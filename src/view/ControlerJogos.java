    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.LfsJogos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07881974109
 */
public class ControlerJogos extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public LfsJogos getBean(int rowIndex) {
        return (LfsJogos)lista.get(rowIndex);

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

        LfsJogos jogos = (LfsJogos) lista.get(rowIndex);
        if (columnIndex == 0)  return jogos.getLfsIdJogo();
        if (columnIndex == 1)  return jogos.getLfsNomeJogo();
        if (columnIndex == 2)  return jogos.getLfsGenero();
        if (columnIndex == 3)  return jogos.getLfsIdioma();
        

        return "";

    }

    public String getColumnName(int column) {
        if (column == 0) return "codigo";
        if (column == 1) return "Nome";
        if (column == 2) return "Genêro";
        if (column == 3) return "Idioma";
       

        return "";
    }
}
