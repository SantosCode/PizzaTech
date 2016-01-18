/**
 * Classe de persistencia da tabela PedidoPK criado pelo Framework JPA 2.1
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author luissantos
 */
@Embeddable
public class PedidoPK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false)
    private int idpedido;
    @Basic(optional = false)
    @Column(name = "cliente_idcliente", nullable = false)
    private int clienteIdcliente;

    public PedidoPK() {
    }

    public PedidoPK(int idpedido, int clienteIdcliente) {
        this.idpedido = idpedido;
        this.clienteIdcliente = clienteIdcliente;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idpedido;
        hash += (int) clienteIdcliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoPK)) {
            return false;
        }
        PedidoPK other = (PedidoPK) object;
        if (this.idpedido != other.idpedido) {
            return false;
        }
        if (this.clienteIdcliente != other.clienteIdcliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.PedidoPK[ idpedido=" + idpedido + ", clienteIdcliente=" + clienteIdcliente + " ]";
    }
    
}
