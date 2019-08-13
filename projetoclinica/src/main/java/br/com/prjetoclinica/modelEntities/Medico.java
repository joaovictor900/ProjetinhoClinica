package br.com.prjetoclinica.modelEntities;

/**
 *
 * @author victor
 */
public class Medico {
    private int codigo;
    private  String nome;
    private String expecialidade;
    private int crm;
    private String Pesquisa;

    public Medico(){
        
    }

    public Medico(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
   
    public Medico(String nome, String expecialidade, int crm) {
        this.nome = nome;
        this.expecialidade = expecialidade;
        this.crm = crm;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExpecialidade() {
        return expecialidade;
    }

    public void setExpecialidade(String expecialidade) {
        this.expecialidade = expecialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getPesquisa() {
        return Pesquisa;
    }

    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
    
    
    
}
