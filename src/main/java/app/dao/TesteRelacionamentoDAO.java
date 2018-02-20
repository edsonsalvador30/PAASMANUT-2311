package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("TesteRelacionamentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TesteRelacionamentoDAO extends JpaRepository<TesteRelacionamento, java.lang.String> {

  /**
   * Obtém a instância de TesteRelacionamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TesteRelacionamento entity WHERE entity.id = :id")
  public TesteRelacionamento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de TesteRelacionamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TesteRelacionamento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key teste
   * @generated
   */
  @Query("SELECT entity FROM TesteRelacionamento entity WHERE entity.teste.id = :id")
  public Page<TesteRelacionamento> findTesteRelacionamentosByTeste(@Param(value="id") java.lang.String id, Pageable pageable);

}
