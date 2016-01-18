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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luissantos
 */
@Entity
@Table(catalog = "pizzatech", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT p FROM Estoque p"),
    @NamedQuery(name = "Estoque.findByIdpestoque", query = "SELECT p FROM Estoque p WHERE p.idpestoque = :idpestoque"),
    @NamedQuery(name = "Estoque.findByNomeEstoque", query = "SELECT p FROM Estoque p WHERE p.nomeEstoque = :nomeEstoque"),
    @NamedQuery(name = "Estoque.findByFabEstoque", query = "SELECT p FROM Estoque p WHERE p.fabEstoque = :fabEstoque"),
    @NamedQuery(name = "Estoque.findByQtEstoque", query = "SELECT p FROM Estoque p WHERE p.qtEstoque = :qtEstoque")})
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idpestoque;
    @Column(name = "nome_pestoque", length = 45)
    private String nomeEstoque;
    @Column(name = "fab_pestoque", length = 45)
    private String fabEstoque;
    @Column(name = "qt_pestoque")
    private Integer qtEstoque;

    public Estoque() {
    }

    public Estoque(Integer idpestoque) {
        this.idpestoque = idpestoque;
    }

    public Integer getIdpestoque() {
        return idpestoque;
    }

    public void setIdpestoque(Integer idpestoque) {
        this.idpestoque = idpestoque;
    }

    public String getNomeEstoque() {
        return nomeEstoque;
    }

    public void setNomeEstoque(String nomeEstoque) {
        this.nomeEstoque = nomeEstoque;
    }

    public String getFabEstoque() {
        return fabEstoque;
    }

    public void setFabEstoque(String fabEstoque) {
        this.fabEstoque = fabEstoque;
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
        hash += (idpestoque != null ? idpestoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.idpestoque == null && other.idpestoque != null) || (this.idpestoque != null && !this.idpestoque.equals(other.idpestoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Estoque[ idpestoque=" + idpestoque + " ]";
    }
    
}
