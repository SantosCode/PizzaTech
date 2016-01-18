/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdpproduto", query = "SELECT p FROM Produto p WHERE p.idpproduto = :idpproduto"),
    @NamedQuery(name = "Produto.findByNomeProduto", query = "SELECT p FROM Produto p WHERE p.nomeProduto = :nomeProduto"),
    @NamedQuery(name = "Produto.findByFabProduto", query = "SELECT p FROM Produto p WHERE p.fabProduto = :fabProduto"),
    @NamedQuery(name = "Produto.findByPrecoProduto", query = "SELECT p FROM Produto p WHERE p.precoProduto = :precoProduto"),
    @NamedQuery(name = "Produto.findByQtProduto", query = "SELECT p FROM Produto p WHERE p.qtProduto = :qtProduto")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idpproduto;
    @Column(name = "nome_pproduto", length = 45)
    private String nomeProduto;
    @Column(name = "fab_pproduto", length = 45)
    private String fabProduto;
    @Column(name = "preco_produto", length = 10)
    private Double precoProduto;
    @Column(name = "qt_pproduto")
    private Integer qtProduto;

    public Produto() {
    }

    public Produto(Integer idpproduto) {
        this.idpproduto = idpproduto;
    }

    public Integer getIdpproduto() {
        return idpproduto;
    }

    public void setIdpproduto(Integer idpproduto) {
        this.idpproduto = idpproduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabProduto() {
        return fabProduto;
    }

    public void setFabProduto(String fabProduto) {
        this.fabProduto = fabProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQtProduto() {
        return qtProduto;
    }

    public void setQtProduto(Integer qtProduto) {
        this.qtProduto = qtProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpproduto != null ? idpproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idpproduto == null && other.idpproduto != null) || (this.idpproduto != null && !this.idpproduto.equals(other.idpproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Produto[ idpproduto=" + idpproduto + " ]";
    }
    
}
