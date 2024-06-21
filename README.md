<h3 align="center">Desafio Prothera</h3>



<!-- Sobre o projeto -->
## Sobre o projeto


Esse projeto foi desenvolvido utilizando Java 17+ em um sistema Linux. A branch CLI disponibiliza uma versão Command Line Interface dessa aplicação, e para fins práticos, não é necessário instalar nenhuma outra dependência além do Java 17 para rodar essa versão do projeto.


### Proposta de desafio
Considerando que uma indústria possui as pessoas/funcionários abaixo:

Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos:

1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).

3 – Deve conter uma classe Principal para executar as seguintes ações:
3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
3.2 – Remover o funcionário “João” da lista.
3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
• informação de data deve ser exibido no formato dd/mm/aaaa;
• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
3.6 – Imprimir os funcionários, agrupados por função.
3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
3.10 – Imprimir a lista de funcionários por ordem alfabética.
3.11 – Imprimir o total dos salários dos funcionários.
3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.

Orientações gerais:
• você poderá utilizar a ferramenta que tem maior domínio (exemplos: eclipse, netbeans etc);
• após finalizado o desenvolvimento, exportar o projeto e encaminhar o link do seu teste aqui mesmo na etapa Mão na Massa 🖐.
Basta Colar o link ainda aqui nessa etapa.
• Assim que recebermos seu projeto desenvolvido, será agendada uma entrevista com nosso time técnico para avaliação.

Esperamos que você use todo seu conhecimento e criatividade nesse teste.

Caso você não souber resolver determinado requisito comente no código que aquele item você não sabe como desenvolver, e vá para o próximo. Avaliaremos o que você conseguiu desenvolver e como foi desenvolvido.






<!-- GETTING STARTED -->
## Iniciando

A versão CLI desse projeto roda em terminal, e executa algumas funções sugeridas no enunciado do desafio.


A aplicação inicia lendo um arquivo CSV, cujo caminho deve ser especificado na classe "MemoryDatabase.java".
Em seguida ela executa os métodos propostos pelo enunciado.

### Pré-requisitos

* Java 17 instalado em sua máquina

* Certifique-se de que você tenha um arquivo csv que siga a ordenação "Nome,Data de Nascimento,Salário,Função".
Você pode criar seu arquivo CSV com os mesmos dados sugeridos no enunciado do desafio copiando abaixo:
  ```sh
  Maria,18/10/2000,2009.44,Operador
  João,12/05/1990,2284.38,Operador
  Caio,02/05/1961,9836.14,Coordenador
  Miguel,14/10/1988,19119.88,Diretor
  Alice,05/01/1995,2234.68,Recepcionista
  Heitor,19/11/1999,1582.72,Operador
  Arthur,31/03/1993,4071.84,Contador
  Laura,08/07/1994,3017.45,Gerente
  Heloísa,24/05/2003,1606.85,Eletricista
  Helena,02/09/1996,2799.93,Gerente
  ```
  Cole o texto copiado dentro de um arquivo .csv<br>
Nessa branch, deixei o arquivo employees.csv dentro da pasta resources do projeto.
```
    src/resources/employee.csv
```

### Instalação

1. Clone o repositório
   ```sh
   git clone https://github.com/Cartaloop/desafio-prothera.git
   ```
2. Acesse o diretório onde você clonou o projeto.
   ```sh
   //No meu caso
   cd development/projects/desafio-prothera/src
   ```
3. Execute o comando: 
   ```sh
   javac Main.java
   ```
4. Execute o programa:
    ```sh
    java Main
    ```

