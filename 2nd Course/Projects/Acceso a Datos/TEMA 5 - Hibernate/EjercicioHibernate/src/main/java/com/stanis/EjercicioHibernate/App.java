package com.stanis.EjercicioHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;





public class App {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		if (session != null) {
			System.out.println("Sesion Abierta con la base de datos Empresa");
		}else {
			System.out.println("Fallo en la sesión");
		}
		Query<Departamentos> consulta = session.createQuery("from Departamentos");
		List<Departamentos> resultados = consulta.list();
		
		for (Object resultado : resultados) {
			Departamentos departamento= (Departamentos) resultado;
			System.out.println(departamento.getDnombre());
		}
		session.close();

	}

}
