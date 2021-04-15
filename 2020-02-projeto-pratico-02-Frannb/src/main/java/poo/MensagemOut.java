package poo;

public enum MensagemOut {
    MSG1(" Digite o label do graph: "),
    MSG2("               Qual item deseja criar?"),
    MSG3(" Digite o nome: "),
    MSG4(" Digite o label: "),
    MSG5(" Digite o nome do arquivo: "),
    MSG6(" Digite o nome do SubGraph, para criá-lo: "),
    MSG7(" Digite o nome do SubGraph, para remove-lo: "),
    MSG8(" Digite o nome do SubGraph, no qual deseja adicionar o elemento: "),
    MSG9(" Digite o nome do elemento: "),
    MSG10(" Digite o nome do elemento, para realizar a conexão: "),
    MSG11(" Deseja concatenar outro elemento, com o elemento anterior? "),
    MSG12(" Digite o nome do elemento para concatenar com o anterior: "),
    MSG13(" Digite a linha de conexão na qual deseja excluir: "),
    MSG14(" Elemento criado! "),
    MSG15(" Nome duplicado, elemento NÃO criado! "),
    MSG16(" Digite o nome do item que deseja remover: "),
    MSG17(" Item removido! "),
    MSG18(" Item NÃO removido! "),
    MSG19(" Item conectado! "),
    MSG20(" Item NÃO conectado! "),
    MSG21("                   Lista de elementos"),
    MSG22(" Lista está vazia! Adicione os elementos primeiro."),
    MSG23(" Nenhuma conexão realizada! "),
    MSG24(" SubGraph criado! "),
    MSG25(" SubGraph NÃO criado! "),
    MSG26(" SubGraph removido! "),
    MSG27(" SubGraph NÃO removido! "),
    MSG28(" Elemento adicionado ao SubGraph! "),
    MSG29(" Elemento NÃO adicionado ao SubGraph! "),
    MSG30(" Elemento removido do SubGraph! "),
    MSG31(" Elemento NÃO removido do SubGraph! "),
    MSG32("                   Lista de SubGraph"),
    MSG33("            Lista de elementos do SubGraph"),
    MSG34(" ====================================================== \n"),
    MSG35(" Alguns itens não estão conectados, deseja prosseguir? "),
    MSG36(" Nenhum subgraph criado! "),
    MSG37(" Arquivo gravado! "),
    MSG38(" Arquivo NÃO gravado! "),
    MSG39(" Arquivo exportado! "),
    MSG40(" Alguns itens não estão conectados. Realize a conexão antes de exportar! "),
    PLAIN_TEXT("\033[0;0m"),
    BOLD_TEXT("\033[0;1m");

    public final String out;

    MensagemOut(String out) {
        this.out = out;
    }
}
