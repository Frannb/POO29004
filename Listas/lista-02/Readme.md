##### 1. O que é JVM, JRE e JDK? Caso eu queira desenvolver aplicações Java, qual desses eu devo instalar e como posso instalar no sistema operacional (aquele que você usa)?
O JVM (Java Virtual Machine) é um software intermediário, onde recebe o bytecode, interpreta e gera o código necessário para a máquina (Sistema Operacional).\
Encapsulado na JVM, temos o Loader, que carrega o bytecode na memória da máquina virtual, e o Verificador, que certifica se este código pode ser executado sem nenhum problema.
E também possui o interpretador, onde pega o bytecode e transforma para o código nativo da máquina, e o gerenciador, controla como os códigos e as variáveis serão gerenciadas na JVM.
E por fim, temos o compilador JIT (Just In Time), no qual captura as partes mais "importantes" do bytecode e compila definitivamente.

O JRE (Java Runtime Environment) é um ambiente onde realiza somente a execução do programa Java.
Dentro da JRE, está presente a JVM, bibliotecas. 

O JDK (Java Development Kit) é utilizado para o desenvolvimento de programas Java, junto á ele temos o JRE, o JavaLang (Linguagem Java), e por fim, o JavaTools, que é um conjunto de ferramentas. 
Anexado ao JavaTools, dispomos do JavaC, que é o compilador Java, onde transforma o código fonte em bytecode. Temos o debugger, no qual realiza a verificaçã de como o programa esta sendo executado, testando conteúdo de variáeis. 

Para desenvolver uma aplicação Java, devemos instalar o JDK. \
No sentido de facilitar o desenvolvimento desta aplicação, algumas ferramentas, como o IntelliJ, Eclipse, Netbeans, Visual Studio Code, e entre outros, auxiliam na implementação deste programa. Estas aplicações são mais conhecidas como IDEs,e algumas delas já está incluso o JDK.

##### 2. O que é o bytecode?
O compilador recebe o código fonte e realiza a conversão para bytecode. Este bytecode é um código em binário, e para ser interpretado necessita de uma JVM.\
A finalidade do bytecode, é que ele pode ser executado em qualquer JVM, em diferentes Sistema Operacionais. 

##### 3. Quais linguagens de programação podem ser usadas com a JVM?
As seguintes linguagens utilizam a JVM, e são elas, Java, Scala, Groovy, Xtend, Ceylon, Kotlin, X10 e Fantom. 

##### 4. No terminal, você encontra-se em um diretório que possui o conteúdo apresentado na listagem abaixo.
```
.
|-- engtelecom
|   `-- poo
|       `-- Principal.java
`-- resources
    `-- aluno.txt
```
##### Apresente os comandos para compilar a classe `Principal.java` e para executar essa classe de forma que receba como entrada (redirecionamento de entrada) o conteúdo do arquivo `aluno.txt` e redirecione a saída para o arquivo `saida.txt`.
Para executar este comando deve estar no diretório poo

- Compilando a classe `Principal.java`
```
javac Principal.java
```
- Executando a classe `Principal.java`, recebendo como entrada o arquivo `aluno.txt` e redirecionando este arquivo para `saida.txt`
```
java Principal < ../resources/aluno.txt > saida.txt
```
##### 5. Baixe o (usando `git clone`) projeto Java disponível em https://github.com/poo29004/biblioteca-de-terceiros, execute o projeto e veja o que faz cada método da classe `StdDraw¹`, daqueles que foram invocados no método `main` da classe `Principal`. Apresente as linhas em Java que seriam necessárias para desenhar um retângulo quadrado tendo 0.1 como o tamanho dos lados.
```javascript
package poo;


import edu.princeton.cs.algs4.StdDraw;

public class Principal {

    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.square(0.1, 0.1, 0.1);
    }
}
```

