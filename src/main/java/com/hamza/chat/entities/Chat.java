package com.hamza.chat.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Chat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChat;
	
	
	@NotNull
	@Size (min = 4,max = 15)
	private String nomChat;
	@Min(value = 10)
	 @Max(value = 10000)
	private Double prixAdoption;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date datenaissance;
	@ManyToOne
	private Souche souche;
	
	public Chat() {
	super();
	}
	public Souche getSouche() {
		return souche;
	}
	public void setSouche(Souche souche) {
		this.souche = souche;
	}
	public Chat(String nomChat, Double prixAdoption, Date datenaissance) {
	this.nomChat = nomChat;
	this.prixAdoption = prixAdoption;
	this.datenaissance = datenaissance;
	}
	public Long getIdChat() {
		return idChat;
	}
	public void setIdChat(Long idChat) {
		this.idChat = idChat;
	}
	public String getNomChat() {
		return nomChat;
	}
	public void setNomChat(String nomChat) {
		this.nomChat = nomChat;
	}
	public Double getPrixAdoption() {
		return prixAdoption;
	}
	public void setPrixAdoption(Double prixAdoption) {
		this.prixAdoption = prixAdoption;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	@Override
	public String toString() {
		return "Chat [idChat=" + idChat + ", nomChat=" + nomChat + ", prixAdoption="
				+ prixAdoption + ", datenaissance=" + datenaissance + "]";
	}
	
}
