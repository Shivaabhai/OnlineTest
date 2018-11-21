package Hibernate.FirstHibernate;
import model.Product;
import model.ProductDAO;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    		Product p = new Product("Apple",1000,"best price");
    		ProductDAO pd = new ProductDAO();
    		pd.insertproduct(p);
    		System.out.println("Success");
    	}catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    }
}
