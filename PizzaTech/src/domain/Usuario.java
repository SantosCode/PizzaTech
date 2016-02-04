/**
 * Classe de persistencia da tabela Usuario criado pelo Framework JPA 2.1
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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luissantos
 */
@Entity
@Table(catalog = "pizzatech", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login_usuario"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByNomeUsuario", query = "SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario"),
    @NamedQuery(name = "Usuario.findByLoginUsuario", query = "SELECT u FROM Usuario u WHERE u.loginUsuario = :loginUsuario"),
    @NamedQuery(name = "Usuario.findByEmalUsuario", query = "SELECT u FROM Usuario u WHERE u.emailUsuario = :emailUsuario"),
    @NamedQuery(name = "Usuario.findBySenhaUsuario", query = "SELECT u FROM Usuario u WHERE u.senhaUsuario = :senhaUsuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idusuario;
    
    @Column(name = "nome_usuario", length = 45)
    private String nomeUsuario;
    
    @Column(name = "login_usuario", length = 45)
    private String loginUsuario;
    
    @Column(name = "email_usuario", length = 50)
    private String emailUsuario;
    
    @Column(name = "senha_usuario", length = 45)
    private String senhaUsuario;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
