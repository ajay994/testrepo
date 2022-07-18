package com.dhathika.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dhathika.dto.Product;
import com.dhathika.sessionutil.SessionUtil;

public class ProductDaoImpl implements ProductDao{

	@Override
	public void createProductDao(Product product) {		
	   Session session = SessionUtil.getSession();
	   Transaction transaction = session.beginTransaction();
	   session.saveOrUpdate(product);
	   transaction.commit();
	   SessionUtil.closeSession(session);	  
	   System.out.println(session);		
	}

	@Override
	public Product retriveProductDao(int pId) {
		
		Configuration configuration = new Configuration();
		configuration.configure("com/dhathika/configuration/hibernate.cfg.xml");
	   SessionFactory  sessionFactory = configuration.buildSessionFactory();
	   Session session = sessionFactory.openSession();
	   Transaction transaction = session.beginTransaction();	
	   Product product = session.get(Product.class, pId);
	   transaction.commit();
	   session.close();
	   return product;
	
	}

	@Override
	public void updateProductDao(Product product) {
		Configuration configuration = new Configuration();
		configuration.configure("com/dhathika/configuration/hibernate.cfg.xml");
	   SessionFactory  sessionFactory = configuration.buildSessionFactory();
	   Session session = sessionFactory.openSession();
	   Transaction transaction = session.beginTransaction();	
	   session.update(product);
				session.getTransaction().commit();
	                        session.close();

	}

	@Override
	public void deleteProductDao(int pId) {
		
	   Session session = SessionUtil.getSession();
	   Transaction transaction = session.beginTransaction();	
	  			Product product = (Product) retriveProductDao(pId);
	  			session.delete(product);
		  		transaction.commit();
		  		SessionUtil.closeSession(session);

		
	}
	


}
