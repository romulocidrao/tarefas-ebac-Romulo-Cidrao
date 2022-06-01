/**
 * 
 */
package br.com.rcidrao.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Rômulo
 *
 */
@Entity
@Table(name = "tb_carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
	@SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;

	@Column(name = "MODELO", length = 20, nullable = false)
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name = "id_marca_fk",
		foreignKey = @ForeignKey(name = "fk_marca_carro"),
		referencedColumnName = "id", nullable = false)
	private Marca marca;
  
	@OneToOne
	private Acessorio acessorios;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Acessorio getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(Acessorio acessorios) {
		this.acessorios = acessorios;
	}




}
