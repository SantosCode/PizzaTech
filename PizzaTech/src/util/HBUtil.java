/**
 * Classe de utilitario para manipulação do Framework Hibernate 4.3
 */
package util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Classe Hibernate Utilitario para obter a fabrica de sessão
 *
 * @author luissantos
 */
public class HBUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Cria a fabrica de sessão para o arquivo (hibernate.cfg.xml) 
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Gera o Log de excessão. 
            System.err.println("Falha ao criar a conexão" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
