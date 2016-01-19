/**
 * Classe de persistencia da tabela Pedido criado pelo Framework JPA 2.1
 */
package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdpedido", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.idpedido = :idpedido"),
    @NamedQuery(name = "Pedido.findByProdutoPedido", query = "SELECT p FROM Pedido p WHERE p.produtoPedido = :produtoPedido"),
    @NamedQuery(name = "Pedido.findByEntregaPedido", query = "SELECT p FROM Pedido p WHERE p.entregaPedido = :entregaPedido"),
    @NamedQuery(name = "Pedido.findByValorPedido", query = "SELECT p FROM Pedido p WHERE p.valorPedido = :valorPedido"),
    @NamedQuery(name = "Pedido.findByClienteIdcliente", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.clienteIdcliente = :clienteIdcliente")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoPK pedidoPK;
    @Column(name = "produto_pedido", length = 45)
    private String produtoPedido;
    @Column(name = "entrega_pedido")
    private Boolean entregaPedido;
    @Column(name = "valor_pedido")
    private Double valorPedido;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public Pedido(int idpedido, int clienteIdcliente) {
        this.pedidoPK = new PedidoPK(idpedido, clienteIdcliente);
    }

    public PedidoPK getPedidoPK() {
        return pedidoPK;
    }

    public void setPedidoPK(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public String getProdutoPedido() {
        return produtoPedido;
    }

    public void setProdutoPedido(String produtoPedido) {
        this.produtoPedido = produtoPedido;
    }

    public Boolean getEntregaPedido() {
        return entregaPedido;
    }

    public void setEntregaPedido(Boolean entregaPedido) {
        this.entregaPedido = entregaPedido;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
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
        hash += (pedidoPK != null ? pedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoPK == null && other.pedidoPK != null) || (this.pedidoPK != null && !this.pedidoPK.equals(other.pedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Pedido[ pedidoPK=" + pedidoPK + " ]";
    }
    
}
