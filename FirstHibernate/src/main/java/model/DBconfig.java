package model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DBconfig {
	private Configuration cfg;
	private SessionFactory sf;
	private Session sess;
	
	public DBconfig() {
		cfg=new Configuration();
		sf=cfg.configure("Hibernate.cfg.xml").addAnnotatedClass(Product.class).buildSessionFactory();
	}
	public Session getsess() {
		sess = sf.getCurrentSession();
		return sess;
	}
}
