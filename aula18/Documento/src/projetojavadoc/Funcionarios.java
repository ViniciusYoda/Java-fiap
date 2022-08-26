package projetojavadoc;

/**Classe para objetos de tipo funcionários, onde serão contidos, valores e métodos para o mesmo.
* @author Vinícius Yoda
* @version 1.05
* @since Release 02 da aplicação
*/

public class Funcionario {
    private String matricula;
    private Double salario;

    /** Método para retorno da matrícula do funcionário
    * @return String - Nr da Matrícula*/

    public String getMatricula(){
        return this.matricula;
    }

    /** Método para retorno do salário do funcionário
    * @return Double - Valor do Salário */

    public Double getSalario(){
        return this.salario;
    }

    /**Método para calculo da diária com base no salário do
    * funcionário dividido pelo mês comercial de 30 dias para efeito * de cálculo de ajuda de custo para viagem.
    * @author Vinícius Yoda
    * @param diasViagem int - Valor total das vendas do mês.
    * @param valorDeslocamento Double - Valor pago em cada diária despesas básicas de deslocamento.
    * @return Double - Valor da diaria
    */
    public Double calculaAjudaCusto(int diasViagem, Double valorDeslocamento) throws ArithmeticException {
        try{
            return (this.salario / 30)*diasViagem+valorDeslocamento;
        }catch (ArithmeticException ae){
            return 0.0;
        }
    }

    /*Método para calculo do valor da bonificação baseada na
    * seguinte faixa de valores: Para vendas menores de
    * 25.000,00, o percentual de comissão aplicado será de 5%, e * para valoresiguais de 25.000,00, o percentual
    * será de 10%
    * @author Vinícius Yoda
    * @param valorVendas - Valor total das vendas do mês
    * @return Double - Valor do resultado do cálculo conforme a faixa de comissões.
    */
    public Double calcularBonificacao(Double valorVendas) {
        if (valorVendas <25000.00 ){
            return this.salario * 0.05;
        } else {
            return this.salario * 0.10;
        }
    }
}