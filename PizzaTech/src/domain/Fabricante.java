/**
 * Classe de persistencia da tabela Fabricante criado pelo Framework JPA 2.1
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
    @NamedQuery(name = "Fabricante.findAll", query = "SELECT f FROM Fabricante f"),
    @NamedQuery(name = "Fabricante.findByIdfabricante", query = "SELECT f FROM Fabricante f WHERE f.idfabricante = :idfabricante"),
    @NamedQuery(name = "Fabricante.findByDescriFab", query = "SELECT f FROM Fabricante f WHERE f.descriFab = :descriFab")})
public class Fabricante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long idfabricante;
    
    @Column(name = "descri_fab", length = 45)
    private String descriFab;

    public Fabricante() {
    }

    public Fabricante(Long idfabricante) {
        this.idfabricante = idfabricante;
    }

    public Long getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(Long idfabricante) {
        this.idfabricante = idfabricante;
    }

    public String getDescriFab() {
        return descriFab;
    }

    public void setDescriFab(String descriFab) {
        this.descriFab = descriFab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfabricante != null ? idfabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.idfabricante == null && other.idfabricante != null) || (this.idfabricante != null && !this.idfabricante.equals(other.idfabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Fabricante[ idfabricante=" + idfabricante + " ]";
    }
    
}
