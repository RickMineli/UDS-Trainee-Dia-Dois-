public class Pessoa {
    public String nome;
    public String cep;
    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String telefone;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getInfo() {
        return "Nome: " + this.nome + ", Cep: " + this.cep + ", Endereço: "+ this.endereco + ", Número: "+
                this.numero +", Complemento: "+ this.complemento +", Bairro: "+
                this.bairro +", Cidade: "+ this.cidade +", Estado: "+ this.estado +", Telefone: "+
                this.telefone;
    }
}
