package models;
import java.util.Date;
public class Cliente {

  private int id;
  private String nome;
  private String numero; 
  private Date dataServico;

  public Cliente() {}

  public Cliente(int id, String nome, String tel, Date dataServico) {
    this.id = id;
    this.nome = nome;
    this.numero = tel;
    this.dataServico = dataServico;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome; 
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Date getDataServico() {
    return dataServico;
  }

  public void setDataServico(Date dataServico) {
    this.dataServico = dataServico;
  }

}