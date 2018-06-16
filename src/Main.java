public class Main {
    public static void main(String[] args){
        Pessoa eu = new Pessoa();

        eu.setNome("Ricardo");
        eu.setCep("87190000");
        eu.setEndereco("Praça");
        eu.setNumero("222");
        eu.setComplemento("Rua");
        eu.setBairro("Centro");
        eu.setCidade("Cidade");
        eu.setEstado("PR");
        eu.setTelefone("911");

        System.out.println(eu.getInfo());
    }


}
