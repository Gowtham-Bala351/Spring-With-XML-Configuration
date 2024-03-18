package springpack.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext axt=new ClassPathXmlApplicationContext("config.xml");
        Beanclass2 bc=(Beanclass2)axt.getBean("krish");
        bc.displaynames();
        bc.displayrollnums();
        bc.displaybranchdetails();
        bc.displayBranchhodinfo();
    }
}
