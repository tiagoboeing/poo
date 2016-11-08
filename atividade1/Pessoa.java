/*
 1. Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), 
 e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. 
 Atributos: String nome; String endereço; String telefone;

 2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. 
 Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, 
 os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). 
 Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve 
 a diferença entre os valores dos atributos valorCredito e valorDivida. 

 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, 
 para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e 
 imposto (porcentagem % retida dos impostos ). Implemente a classe Empregado com métodos seletores e 
 modificadores e um método calcularSalario. 

 4. Implemente a classe Administrador como subclasse da classe Empregado. 
 Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, 
 o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o 
 método herdado calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajuda de custo). 

 5. Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos, 
 para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que corresponde ao valor 
 monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem % do valorProducao 
 que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o 
 método herdado calcularSalario (o salário de um operário é equivalente ao salário de um empregado usual 
 acrescido da referida comissão). 

 6. Implemente a classe Vendedor como subclasse da classe Empregado. 
 Um determinado vendedor tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, 
 o atributo valorVendas (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao 
 (porcentagem % do valorVendas que será adicionado ao vencimento base do Vendedor). 
 Note que deverá redefinir nesta subclasse o método herdado calcularSalario 
 (o salário de um vendedor é equivalente ao salário de um empregado usual acrescido da referida comissão). 

 7. Escreva um programa que cadastre N funcionários (de todos os tipos) e liste todos os dados dos funcionários cadastrados 
 (inclusive o salário bruto e o salário líquido). Tambem deve ser possível cadastrar fornecedores, e buscar pelo 
 nome de um fornecedor e listar todas as informações referente ao mesmo, com o saldo de débido ou crédito.
 */
package poo.atividade1;

/**
 *
 * @author Tiago Boeing
 */
public class Pessoa {
    
    private String nomePessoa;
    private String enderecoPessoa;
    private String telefonePessoa;


    public String getNomePessoa() {
        return nomePessoa;
    }


    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }


    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }


    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }


    public String getTelefonePessoa() {
        return telefonePessoa;
    }


    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }
    
    
    public Pessoa(String nomePessoa, String enderecoPessoa, String telefonePessoa) {

        this.setNomePessoa(nomePessoa);
        this.setEnderecoPessoa(enderecoPessoa);
        this.setTelefonePessoa(telefonePessoa);

    }
    
    public String toString(){
        return "Nome da pessoa: " + getNomePessoa() + " \n Endereço: " + getEnderecoPessoa() + " \n Telefone: " + getTelefonePessoa();
    }
    
    
    
}
