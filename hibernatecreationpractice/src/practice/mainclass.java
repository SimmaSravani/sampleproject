package practice;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class mainclass {

	public static void main(String[] args) 
	{
		SessionFactory sfactory=new Configuration().configure().buildSessionFactory();
		Session ses=sfactory.openSession();
		Transaction tx=null;
		tx=ses.beginTransaction();
		persistancetable h=new persistancetable();
		//h.setNamee("Vivekeee");
		//h.setAge(71);
		//h.setNamee("ramya");
		//h.setAge(33);
//		stu.setNamee("Sravani mam");
//		stu.setAge(91);
		ses.persist(h);
		ses.flush();
		tx.commit();
		ses.close();
	}


}
