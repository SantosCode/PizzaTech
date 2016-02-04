/**
 * Classe de persistencia da tabela Estoque criado pelo Framework JPA 2.1
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *@version 1.0 Release
 * @author luissantos
 */
@Entity
@Table(catalog = "pizzatech", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT p FROM Estoque p"),
    @NamedQuery(name = "Estoque.findByIdestoque", query = "SELECT p FROM Estoque p WHERE p.idestoque = :idestoque"),
    @NamedQuery(name = "Estoque.findByNomeEstoque", query = "SELECT p FROM Estoque p WHERE p.nomeEstoque = :nomeEstoque"),
    @NamedQuery(name = "Estoque.findByFabricante", query = "SELECT p FROM Estoque p WHERE p.fabricante.idfabricante = :idfabricante"),
    @NamedQuery(name = "Estoque.findByQtEstoque", query = "SELECT p FROM Estoque p WHERE p.qtEstoque = :qtEstoque")})
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long idestoque;
    
    @Column(name = "nome_estoque", length = 45)
    private String nomeEstoque;
    
    @Column(name = "qt_estoque")
    private Integer qtEstoque;
    
    @ManyToOne
    @JoinColumn(nullable = false, name = "fab_estoque")
    private Fabricante fabricante;

    public Estoque() {
    }

    public Estoque(Long idpestoque) {
        this.idestoque = idpestoque;
    }

    public Long getIdpestoque() {
        return idestoque;
    }

    public void setIdpestoque(Long idpestoque) {
        this.idestoque = idpestoque;
    }

    public String getNomeEstoque() {
        return nomeEstoque;
    }

    public void setNomeEstoque(String nomeEstoque) {
        this.nomeEstoque = nomeEstoque;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(Integer qtEstoque) {
        this.qtEstoque = qtEstoque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestoque != null ? idestoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.idestoque == null && other.idestoque != null) || (this.idestoque != null && !this.idestoque.equals(other.idestoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Estoque[ idpestoque=" + idestoque + " ]";
    }
    
}
