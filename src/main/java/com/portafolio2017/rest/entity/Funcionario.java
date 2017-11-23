package com.portafolio2017.rest.entity;
// Generated 29-10-2017 16:52:28 by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * FuncionarioModel generated by hbm2java
 */
@Entity
@Table(name = "funcionario")
public class Funcionario implements java.io.Serializable {

	@Id
	@Column(name = "rut_funcionario", unique = true, nullable = false, length = 10)
	private String rutFuncionario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "departamento_id_depto", nullable = false)
	private Departamento departamento;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cargo_id_cargo", nullable = false)
	private Cargo cargo;
	
	@Column(name = "primer_nombre", nullable = false, length = 20)
	private String primerNombre;
	
	@Column(name = "segundo_nombre", nullable = false, length = 20)
	private String segundoNombre;
	
	@Column(name = "primer_apellido", nullable = false, length = 20)
	private String primerApellido;
	
	@Column(name = "segundo_apellido", nullable = false, length = 20)
	private String segundoApellido;
	
	@Column(name = "telefono_funionario", nullable = false, precision = 10, scale = 0)
	private long telefonoFunionario;
	
	@Column(name = "sexo_funionario", nullable = false, length = 9)
	private String sexoFunionario;
	
	@Column(name = "correo_funcionario", nullable = false, length = 20)
	private String correoFuncionario;
	
	@Column(name = "dias_permisos_disponibles", nullable = false, length = 2)
	private int permisosDisponibles;

	public Funcionario() {
	}
	
	public Funcionario(String rutFuncionario2) {
		// TODO Auto-generated constructor stub
	}



	public Funcionario(String rutFuncionario, Departamento departamento, Cargo cargo, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, long telefonoFunionario,
			String sexoFunionario, String correoFuncionario, int permisosDisponibles) {
		super();
		this.rutFuncionario = rutFuncionario;
		this.departamento = departamento;
		this.cargo = cargo;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefonoFunionario = telefonoFunionario;
		this.sexoFunionario = sexoFunionario;
		this.correoFuncionario = correoFuncionario;
		this.permisosDisponibles = permisosDisponibles;
	}

	public String getRutFuncionario() {
		return rutFuncionario;
	}

	public void setRutFuncionario(String rutFuncionario) {
		this.rutFuncionario = rutFuncionario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public long getTelefonoFunionario() {
		return telefonoFunionario;
	}

	public void setTelefonoFunionario(long telefonoFunionario) {
		this.telefonoFunionario = telefonoFunionario;
	}

	public String getSexoFunionario() {
		return sexoFunionario;
	}

	public void setSexoFunionario(String sexoFunionario) {
		this.sexoFunionario = sexoFunionario;
	}

	public String getCorreoFuncionario() {
		return correoFuncionario;
	}

	public void setCorreoFuncionario(String correoFuncionario) {
		this.correoFuncionario = correoFuncionario;
	}

	public int getPermisosDisponibles() {
		return permisosDisponibles;
	}

	public void setPermisosDisponibles(int permisosDisponibles) {
		this.permisosDisponibles = permisosDisponibles;
	}
	
	


}
