package model;
import org.hibernate.Session;

public class ProductDAO {
  private DBconfig db;
  private Session sess;
  public ProductDAO() {
	  db=new DBconfig();
  }
  public void insertproduct(Product p) {
	  try
		{
			sess=db.getsess();
			sess.beginTransaction();
			sess.save(p);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
  }
  public void updateproduct(Product p) {
	  try
		{
			sess=db.getsess();
			sess.beginTransaction();
			sess.update(p);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
  }
	  public void deleteproduct(Product p) {
		  try
			{
				sess=db.getsess();
				sess.beginTransaction();
				sess.delete(p);
				sess.getTransaction().commit();
				
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				ex.printStackTrace();
			}
  }
}
