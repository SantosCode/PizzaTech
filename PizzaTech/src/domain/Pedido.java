/**
 * Classe de persistencia da tabela Pedido criado pelo Framework JPA 2.1
 */
package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *@version 1.0 Release
 * @author luissantos
 */
@Entity
@Table(catalog = "pizzatech", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdpedido", query = "SELECT p FROM Pedido p WHERE p.idpedido = :idpedido"),
    @NamedQuery(name = "Pedido.findByDataPedido", query = "SELECT p FROM Pedido p WHERE p.dataPedido = :dataPedido"),
    @NamedQuery(name = "Pedido.findByEntregaPedido", query = "SELECT p FROM Pedido p WHERE p.entregaPedido = :entregaPedido"),
    @NamedQuery(name = "Pedido.findByValorPedido", query = "SELECT p FROM Pedido p WHERE p.valorPedido = :valorPedido"),
    @NamedQuery(name = "Pedido.findByClienteIdcliente", query = "SELECT p FROM Pedido p WHERE p.cliente.idcliente = :idcliente")})
public class Pedido implements Serializable {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long idpedido;
    
    @Column(name = "data_pedido", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;
    
    @Column(name = "entrega_pedido")
    private Boolean entregaPedido;
    
    @Column(name = "valor_pedido", precision = 6, scale = 2)
    private BigDecimal valorPedido;
    
    @ManyToOne(optional = false)
    private Cliente cliente;
    
    @OneToMany
    @JoinTable(name = "Produtos_Pedido", 
                   joinColumns = @JoinColumn(name = "Pedido_idpedido", unique = false),
                   inverseJoinColumns = @JoinColumn(name = "Produto_idproduto",unique = false))
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Produto> produto;

    public Pedido() {
    }
    
    public Pedido(Long idpedido){
        this.idpedido=idpedido;
    }

    public Long getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Long idpedido) {
        this.idpedido = idpedido;
    }
    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Boolean getEntregaPedido() {
        return entregaPedido;
    }

    public void setEntregaPedido(Boolean entregaPedido) {
        this.entregaPedido = entregaPedido;
    }

    public BigDecimal getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(BigDecimal valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedido != null ? idpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idpedido == null && other.idpedido != null) || (this.idpedido != null && !this.idpedido.equals(other.idpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Pedido[ idpedido=" + idpedido + " ]";
    }
    
}
