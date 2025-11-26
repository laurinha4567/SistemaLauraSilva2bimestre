package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lfs_vendas_jogos", catalog="db_laura_silva")
public class LfsVendasJogos implements java.io.Serializable {

    private int id;
    private LfsJogos lfsJogos;
    private LfsVenda lfsVenda;
    private int lfsQuantidade;
    private double lfsValorUnitario;
    private String lfsObservacoes;

    public LfsVendasJogos() {
    }

    public LfsVendasJogos(LfsJogos lfsJogos, LfsVenda lfsVenda, int lfsQuantidade, double lfsValorUnitario) {
        this.lfsJogos = lfsJogos;
        this.lfsVenda = lfsVenda;
        this.lfsQuantidade = lfsQuantidade;
        this.lfsValorUnitario = lfsValorUnitario;
    }

    public LfsVendasJogos(LfsJogos lfsJogos, LfsVenda lfsVenda, int lfsQuantidade, double lfsValorUnitario, String lfsObservacoes) {
        this.lfsJogos = lfsJogos;
        this.lfsVenda = lfsVenda;
        this.lfsQuantidade = lfsQuantidade;
        this.lfsValorUnitario = lfsValorUnitario;
        this.lfsObservacoes = lfsObservacoes;
    }

   
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="lfs_idVenda_jogos", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lfs_fk_jogos")
    public LfsJogos getLfsJogos() {
        return lfsJogos;
    }
    public void setLfsJogos(LfsJogos lfsJogos) {
        this.lfsJogos = lfsJogos;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lfs_fks_idVenda")
    public LfsVenda getLfsVenda() {
        return lfsVenda;
    }
    public void setLfsVenda(LfsVenda lfsVenda) {
        this.lfsVenda = lfsVenda;
    }

    
    @Column(name="lfs_quantidade", nullable=false)
    public int getLfsQuantidade() {
        return lfsQuantidade;
    }
    public void setLfsQuantidade(int lfsQuantidade) {
        this.lfsQuantidade = lfsQuantidade;
    }

   
    @Column(name="lfs_valor_unitario", nullable=false, precision=10)
    public double getLfsValorUnitario() {
        return lfsValorUnitario;
    }
    public void setLfsValorUnitario(double lfsValorUnitario) {
        this.lfsValorUnitario = lfsValorUnitario;
    }

    
    @Column(name="lfs_observacoes", length=256)
    public String getLfsObservacoes() {
        return lfsObservacoes;
    }
    public void setLfsObservacoes(String lfsObservacoes) {
        this.lfsObservacoes = lfsObservacoes;
    }
}
