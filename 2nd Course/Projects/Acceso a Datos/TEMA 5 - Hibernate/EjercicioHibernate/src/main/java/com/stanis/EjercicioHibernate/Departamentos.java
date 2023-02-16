package com.stanis.EjercicioHibernate;
import java.util.HashSet;
import java.util.Set;

public class Departamentos implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private byte deptNo;
	private String dnombre;
	private String loc;
	private Set <Empleados> empleadoses = new HashSet <Empleados>(0);

	public Departamentos() {
	}

	public Departamentos(byte deptNo) {
		this.deptNo = deptNo;
	}

	public Departamentos(byte deptNo, String dnombre, String loc, Set <Empleados>empleadoses) {
		this.deptNo = deptNo;
		this.dnombre = dnombre;
		this.loc = loc;
		this.empleadoses = empleadoses;
	}

	public byte getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(byte deptNo) {
		this.deptNo = deptNo;
	}

	public String getDnombre() {
		return this.dnombre;
	}

	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<Empleados> getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set <Empleados>empleadoses) {
		this.empleadoses = empleadoses;
	}

}
