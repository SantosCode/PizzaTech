/**
 * Classe de persistencia da tabela Cliente criado pelo Framework JPA 2.1
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
 *@version 1.0 Release
 * @author luissantos
 */
@Entity
@Table(catalog = "pizzatech", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdcliente", query = "SELECT c FROM Cliente c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Cliente.findByTelCliente", query = "SELECT c FROM Cliente c WHERE c.telCliente = :telCliente"),
    @NamedQuery(name = "Cliente.findByEndCliente", query = "SELECT c FROM Cliente c WHERE c.endCliente = :endCliente")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long idcliente;
    
    @Column(name = "nome_cliente", length = 45)
    private String nomeCliente;
    
    @Column(name = "tel_cliente", length = 45)
    private String telCliente;
    
    @Column(name = "end_cliente", length = 80)
    private String endCliente;
    
    public Cliente() {
    }

    public Cliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(String endCliente) {
        this.endCliente = endCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Cliente[ idcliente=" + idcliente + " ]";
    }
    
}
