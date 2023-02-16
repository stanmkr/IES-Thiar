package com.stanis.EjercicioHibernate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.util.Set;

import org.hibernate.query.Query;
import org.hibernate.query.SemanticException;

import com.sergio.Hibernate2.Autores;
import com.sergio.Hibernate2.Libros;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class Practica1 {

	private JFrame frame;
	private JTextField textFieldNumeroDep;
	private JTextField textFieldNombreDep;
	private JTextField numeroDepartamento;
	private JTextField nombreDepartamento;
	private JTextField localizacionDepartamento;
	private static SessionFactory sessionFactory;
	private static Session session;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica1 window = new Practica1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practica1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static void darAlta (JTextField numeroDepartamento, JTextField nombreDepartamento,
			JTextField localizacionDepartamento) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		if (numeroDepartamento.getText().length() > 0) {
			try {
				Query consulta = session.createQuery("FROM Departamentos WHERE deptNo=" + numeroDepartamento.getText());
				List departamentos = consulta.list();
				if (departamentos.size() == 0) {
					if (numeroDepartamento.getText().length() != 0 && nombreDepartamento.getText().length() != 0
							&& localizacionDepartamento.getText().length() != 0) {
						Set<Empleados> setEmpleados = null;
						Departamentos departamento = new Departamentos(Byte.parseByte(numeroDepartamento.getText()),
								nombreDepartamento.getText(), localizacionDepartamento.getText(), setEmpleados);
						session.save(departamento);
						trans.commit();
						JOptionPane.showMessageDialog(null,
								"Departamento con número " + numeroDepartamento.getText()
										+ " ha sido creado con éxito.",
								"Departamento creado", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,
								"Faltan datos.\nDebes de rellenar los campos de número, nombre y localización de departamento",
								"Faltan datos", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"Error.\nYa existe un departamento con el número " + numeroDepartamento.getText(),
							"Error. Departameno duplicado", JOptionPane.ERROR_MESSAGE);
				}
			} catch (IllegalArgumentException e2) {
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null,
						"Debes de introducir número en el campo de número de departamento",
						"Debes de introducir números", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null,
					"La casilla de número de departamento está vacía",
					"ERROR", JOptionPane.ERROR_MESSAGE);
		}
		

		session.close();
	}

	public static void modificar(JTextField numeroDepartamento, JTextField nombreDepartamento,
			JTextField localizacionDepartamento) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		if (session != null) {
			System.out.println("Sesión abierta");

			boolean modificado = false;
			if (numeroDepartamento.getText().length() != 0) {
				try {
					Query consulta = session
							.createQuery("FROM Departamentos WHERE deptNo=" + numeroDepartamento.getText());
					List resultados = consulta.list();
					if (resultados.size() == 0) {
						JOptionPane.showMessageDialog(null, "No se han encontrado departamentos", "Sin resultados",
								JOptionPane.INFORMATION_MESSAGE);

					} else {
						Transaction trans = session.beginTransaction();
						Departamentos departamentoAModificr = (Departamentos) resultados.get(0);
						if (nombreDepartamento.getText().length() != 0) {
							departamentoAModificr.setDnombre(nombreDepartamento.getText());
							modificado = true;
						}
						if (localizacionDepartamento.getText().length() != 0) {
							departamentoAModificr.setLoc(localizacionDepartamento.getText());
							modificado = true;
						}
						if (modificado) {
							session.update(departamentoAModificr);
							trans.commit();
							JOptionPane.showMessageDialog(null, "El departamento ha sido modificado",
									"Modificación exitosa", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Te faltan datos, nombre o localización",
									"Modificación sin éxito", JOptionPane.INFORMATION_MESSAGE);
						}
					}

					// cerramos sesion
					session.close();
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Debes de introducir números",
							"ERROR", JOptionPane.ERROR_MESSAGE);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Error en el número de departamento", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			System.out.println("Fallo en la sesión");
		}

	}

	public static void eliminar(JTextField numeroDepartamento) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		if (session != null) {
			System.out.println("Sesión abierta");
		} else {
			System.out.println("Fallo en la sesión");
		}
		try {
			Query consulta = session.createQuery("FROM Departamentos WHERE deptNo=" + numeroDepartamento.getText());
			List departamentos = consulta.list();
			if (departamentos.size() > 0) {
				for (Object resultado : departamentos) {
					Departamentos departamento = (Departamentos) resultado;
					Set<Empleados> listaEmpleados = departamento.getEmpleadoses();
					if (listaEmpleados.size() > 0) {
						JOptionPane.showMessageDialog(null, "No es posible borrar el departamento, contiene empleados.",
								"Fallo al borrar", JOptionPane.ERROR_MESSAGE);
					} else {
						Transaction trans = session.beginTransaction();
						session.delete(departamentos.get(0));
						trans.commit();
						JOptionPane.showMessageDialog(null,
								"El departamento con Nº" + numeroDepartamento.getText() + " ha sido borrado",
								"Departamento eliminado", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "No se han encontrado departamentos", "Sin resultados",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error al borrar el departamento", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.out.println("Error al borrar el departamento");
		}
		session.close();
	}

	public static void consultar(JTextArea areaTexto, JTextField textFieldNombreDep, JTextField textFieldNumeroDep) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		if (session != null) {
			System.out.println("Sesión abierta");
		} else {
			System.out.println("Fallo en la sesión");
		}

		try {
			Query<Departamentos> consulta = session
					.createQuery("FROM Departamentos WHERE deptNo=" + textFieldNumeroDep.getText());
			List<Departamentos> resultados = consulta.list();

			if (resultados.size() == 0) {
				JOptionPane.showMessageDialog(null, "No se han encontrado departamentos", "Sin resultados",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				for (Object resultado : resultados) {
					Departamentos departamento = (Departamentos) resultado;
					textFieldNombreDep.setText(departamento.getDnombre());
					Set<Empleados> listaEmpleados = departamento.getEmpleadoses();
					areaTexto.append("Número de empleaos: " + listaEmpleados.size() + "\n");
					areaTexto.append("......................................................................\n");
					areaTexto.append("APELLIDO           OFICIO\n");
					areaTexto.append("================================\n");
					for (Empleados em : listaEmpleados) {
						areaTexto.append(em.getApellido() + "        |         " + em.getOficio() + "\n");
					}
				}

			}
			session.close();
		} catch (IllegalArgumentException e3) {
			e3.printStackTrace();
			JOptionPane.showMessageDialog(null, "Introduce números enteros, porfavor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("EJERCICIO HIBERNATE | STANISLAV KRASTEV");
		frame.setResizable(false);

		JLabel lblNewLabel = new JLabel("Introduce número de departamento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 32, 249, 13);
		frame.getContentPane().add(lblNewLabel);

		textFieldNumeroDep = new JTextField();
		textFieldNumeroDep.setToolTipText("Introduce número de departamento");
		textFieldNumeroDep.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldNumeroDep.setBounds(282, 31, 67, 19);
		frame.getContentPane().add(textFieldNumeroDep);
		textFieldNumeroDep.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre del departamento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(23, 79, 249, 13);
		frame.getContentPane().add(lblNewLabel_1);

		textFieldNombreDep = new JTextField();
		textFieldNombreDep.setEditable(false);
		textFieldNombreDep.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldNombreDep.setBounds(282, 78, 169, 19);
		frame.getContentPane().add(textFieldNombreDep);
		textFieldNombreDep.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 235, 453, 218);
		frame.getContentPane().add(scrollPane);

		final JTextArea areaTexto = new JTextArea();
		scrollPane.setViewportView(areaTexto);

		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultar(areaTexto, textFieldNombreDep, textFieldNumeroDep);
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setBounds(351, 30, 100, 21);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1_1 = new JLabel("MODIFICACIONES DEPARTAMENTO");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(63, 124, 346, 13);
		frame.getContentPane().add(lblNewLabel_1_1);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 0, 0));
		separator.setBounds(23, 147, 453, 2);
		frame.getContentPane().add(separator);

		numeroDepartamento = new JTextField();
		numeroDepartamento.setToolTipText("introduce el número de departamento");
		numeroDepartamento.setBounds(81, 168, 50, 19);
		frame.getContentPane().add(numeroDepartamento);
		numeroDepartamento.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Número:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(28, 170, 50, 13);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Nombre:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(152, 170, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1);

		nombreDepartamento = new JTextField();
		nombreDepartamento.setToolTipText("introduce el nombre del departamento");
		nombreDepartamento.setColumns(10);
		nombreDepartamento.setBounds(205, 168, 90, 19);
		frame.getContentPane().add(nombreDepartamento);

		JLabel lblNewLabel_2_1_1 = new JLabel("Localización:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(305, 171, 72, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		localizacionDepartamento = new JTextField();
		localizacionDepartamento.setToolTipText("introduce la localización del departamento");
		localizacionDepartamento.setColumns(10);
		localizacionDepartamento.setBounds(386, 168, 90, 19);
		frame.getContentPane().add(localizacionDepartamento);

		JButton botonAlta = new JButton("DAR ALTA");
		botonAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				darAlta(numeroDepartamento, nombreDepartamento, localizacionDepartamento);
			}
		});

		botonAlta.setBackground(new Color(0, 128, 0));
		botonAlta.setForeground(new Color(255, 255, 255));
		botonAlta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonAlta.setBounds(23, 204, 108, 21);
		frame.getContentPane().add(botonAlta);

		JButton botonEliminar = new JButton("ELIMINAR");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar(numeroDepartamento);
			}
		});

		botonEliminar.setForeground(Color.WHITE);
		botonEliminar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonEliminar.setBackground(new Color(255, 0, 0));
		botonEliminar.setBounds(141, 204, 108, 21);
		frame.getContentPane().add(botonEliminar);

		JButton botonModificar = new JButton("MODIFICAR");
		botonModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar(numeroDepartamento, nombreDepartamento, localizacionDepartamento);
			}
		});

		botonModificar.setForeground(Color.WHITE);
		botonModificar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonModificar.setBackground(new Color(128, 128, 128));
		botonModificar.setBounds(258, 204, 108, 21);
		frame.getContentPane().add(botonModificar);

		JButton botonLimpiar = new JButton("LIMPIAR");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.setText("");
				textFieldNombreDep.setText("");
			}
		});

		botonLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonLimpiar.setBounds(372, 204, 104, 21);
		frame.getContentPane().add(botonLimpiar);
	}
}
