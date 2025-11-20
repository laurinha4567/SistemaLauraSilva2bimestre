/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LfsVendasJogos;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControlerVendasJogos extends AbstractTableModel {

    private List lstLfsVendasJogos;

    public void setList(List lstLfsVendasJogos) {
        this.lstLfsVendasJogos = lstLfsVendasJogos;
        
        this.fireTableDataChanged();
    }
    
    public LfsVendasJogos getBean(int rowIndex) {
        return (LfsVendasJogos) lstLfsVendasJogos.get(rowIndex);
    }

    public void addBean(LfsVendasJogos Lfsvendasjogos) {
        lstLfsVendasJogos.add(Lfsvendasjogos);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex) {
        lstLfsVendasJogos.remove(rowIndex);
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lstLfsVendasJogos.size();                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LfsVendasJogos Lfsvendasjogos = (LfsVendasJogos) lstLfsVendasJogos.get( rowIndex);
        if ( columnIndex == 0 ){
            return Lfsvendasjogos.getLfsJogos().getLfsIdJogo();
        } else if (columnIndex ==1) {
            return Lfsvendasjogos.getLfsJogos().getLfsNomeJogo();
        } else if (columnIndex ==2) {
            return Lfsvendasjogos.getLfsQuantidade();
        } else if (columnIndex ==3) {
            return Lfsvendasjogos.getLfsValorUnitario();
        }else if (columnIndex ==4) {
            return Lfsvendasjogos.getLfsValorUnitario()*Lfsvendasjogos.getLfsQuantidade();
        }
        return ""; 
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome Jogo";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitário";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
}
