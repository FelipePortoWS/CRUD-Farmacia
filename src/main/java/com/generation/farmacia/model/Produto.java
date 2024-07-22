package com.generation.farmacia.model;

import java.sql.Date;
import java.time.LocalDateTime;


import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo é obrigatório")
	@Size(max = 255, message = "O atributo \"nome\" não pode conter mais de 255 caracteres")
	private String nome;

	@NotNull(message = "O atributo é obrigatório")
	private Float preco;

	private Date validade;

	@NotNull(message = "O atributo é obrigatório")
	private int quantidade;

	@UpdateTimestamp
	private LocalDateTime dataDeRegistro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public LocalDateTime getDataDeRegistro() {
		return dataDeRegistro;
	}

	public void setDataDeRegistro(LocalDateTime dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}