package psv;

public class CarroBean {
    //Atributos da classe
    private String placa;
    private String cor;
    private String descricao;

    //Criano o construtos
    public CarroBean() {
        
    }
    public CarroBean(String placa, String cor, String descricao) {
        this.placa = placa;
        this.cor = cor;
        this.descricao = descricao;
    }
    
    
    //Criando os métodos Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
}
