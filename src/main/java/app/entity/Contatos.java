package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONTATOS
 * @generated
 */
@Entity
@Table(name = "\"CONTATOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Contatos")
public class Contatos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome_contato", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_contato;

  /**
  * @generated
  */
  @Column(name = "msg_contato", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String msg_contato;

  /**
   * Construtor
   * @generated
   */
  public Contatos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Contatos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_contato
   * return nome_contato
   * @generated
   */
  
  public java.lang.String getNome_contato(){
    return this.nome_contato;
  }

  /**
   * Define nome_contato
   * @param nome_contato nome_contato
   * @generated
   */
  public Contatos setNome_contato(java.lang.String nome_contato){
    this.nome_contato = nome_contato;
    return this;
  }

  /**
   * Obtém msg_contato
   * return msg_contato
   * @generated
   */
  
  public java.lang.String getMsg_contato(){
    return this.msg_contato;
  }

  /**
   * Define msg_contato
   * @param msg_contato msg_contato
   * @generated
   */
  public Contatos setMsg_contato(java.lang.String msg_contato){
    this.msg_contato = msg_contato;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Contatos object = (Contatos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
