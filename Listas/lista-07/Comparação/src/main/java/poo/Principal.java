package poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Principal {
    protected Agenda agenda = new Agenda();

    public int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n ======================================================\n" +
                "                   Adicionar:\n" +
                "                       1 - Contato;\n" +
                "                       2 - Telefone;\n" +
                "                       3 - E-mail;\n" +
                "                   Atulizar:\n" +
                "                       4 - Telefone;\n" +
                "                       5 - E-mail;\n" +
                "                   Remover:\n" +
                "                       6 - Contato;\n" +
                "                       7 - Telefone;\n" +
                "                       8 - E-mail;\n" +
                "                   Listar:\n" +
                "                       9 - Contatos;\n" +
                "                       10 - Dados de um contato;\n\n" +
                "                   11 - Exibir coleção;\n" +
                "                   12 - Exibir comparação (compareTo);\n" +
                "                   0 - Sair.\n" +
                " ======================================================\n" +
                " Digite sua opção: ");
        int opcao = teclado.nextInt();
        return opcao;
    }

    public static void main(String[] args){
        Principal p = new Principal();
        Scanner teclado = new Scanner(System.in);
        String nome, sobrenome, telefone, email, rotulo, dataNascimento;
        LocalDate dataFormatada;
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dn1 = LocalDate.parse("01/01/1990", formatoData);
        LocalDate dn2 = LocalDate.parse("01/01/1989", formatoData);
        LocalDate dn3 = LocalDate.parse("01/01/1991", formatoData);
        LocalDate dn4 = LocalDate.parse("01/01/1980", formatoData);

        int index;
        for (;;) {
            switch (p.menu()) {
                case 1:
                    System.out.print(" Digite o nome: ");
                    nome = teclado.nextLine();
                    System.out.print(" Digite o sobrenome: ");
                    sobrenome = teclado.nextLine();
                    System.out.print(" Digite data de nascimento (dd/mm/aaaa): ");
                    dataNascimento = teclado.nextLine();
                    dataFormatada = LocalDate.parse(dataNascimento, formatoData);

                    try{
                        if (p.agenda.addPessoa(new Pessoa(nome,sobrenome,dataFormatada))) {
                            System.out.print(" Contato adicionado!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException("Contato NÃO adicionado!");
                    }
                    break;
                case 2:
                    System.out.print(" Digite o rótulo: ");
                    rotulo = teclado.nextLine();
                    System.out.print(" Digite o telefone: ");
                    telefone = teclado.nextLine();
                    System.out.print(" Digite o ID: ");
                    index = Integer.parseInt(teclado.nextLine());

                    try{
                        if (p.agenda.addTelefone(rotulo,telefone,index)) {
                            System.out.print(" Telefone adicionado!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException("Telefone NÃO adicionado!");
                    }
                    break;
                case 3:
                    System.out.print(" Digite o rótulo: ");
                    rotulo = teclado.nextLine();
                    System.out.print(" Digite o email: ");
                    email = teclado.nextLine();
                    System.out.print(" Digite o ID: ");
                    index = Integer.parseInt(teclado.nextLine());

                    try{
                        if (p.agenda.addEmail(rotulo,email,index)) {
                            System.out.print(" E-Email adicionado!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" E-Email NÃO adicionado!");
                    }
                    break;
                case 4:
                    System.out.print(" Digite o rótulo: ");
                    rotulo = teclado.nextLine();
                    System.out.print(" Digite o telefone: ");
                    telefone = teclado.nextLine();
                    System.out.print(" Digite o ID: ");
                    index = Integer.parseInt(teclado.nextLine());

                    try{
                        if (p.agenda.updateTelefone(rotulo,telefone,index)) {
                            System.out.print(" Telefone atualizado!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" Telefone NÃO atualizado!");
                    }
                    break;
                case 5:
                    System.out.print(" Digite o rótulo: ");
                    rotulo = teclado.nextLine();
                    System.out.print(" Digite o e-mail: ");
                    email = teclado.nextLine();
                    System.out.print(" Digite o ID: ");
                    index = Integer.parseInt(teclado.nextLine());

                    try{
                        if (p.agenda.updateEmail(rotulo,email,index)) {
                            System.out.print(" Email atualizado!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" Email NÃO atualizado!");
                    }
                    break;
                case 6:
                    System.out.print(" Digite o nome: ");
                    nome = teclado.nextLine();
                    System.out.print(" Digite o sobrenome: ");
                    sobrenome = teclado.nextLine();

                    try{
                        if (p.agenda.removePessoa(nome,sobrenome)) {
                            System.out.print(" Contato removido!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" Contato NÃO removido!");
                    }
                    break;
                case 7:
                    System.out.print(" Digite o rótulo: ");
                    rotulo = teclado.nextLine();
                    System.out.print(" Digite o ID: ");
                    index = Integer.parseInt(teclado.nextLine());

                    try{
                        if (p.agenda.removeTelefone(rotulo,index)) {
                            System.out.print(" Telefone removido!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" Telefone NÃO removido!");
                    }
                    break;
                case 8:
                    System.out.print(" Digite o rótulo: ");
                    rotulo = teclado.nextLine();
                    System.out.print(" Digite o ID: ");
                    index = Integer.parseInt(teclado.nextLine());

                    try{
                        if (p.agenda.removeEmail(rotulo,index)) {
                            System.out.print(" Email removido!");
                        }
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" Email NÃO removido!");
                    }
                    break;
                case 9:
                    System.out.println(" \n ===== Contatos =====");
                    for (Pessoa pessoa: p.agenda.getContatos()) {
                        System.out.println(" " + pessoa.getNome() + " " + pessoa.getSobrenome());
                    }

                    break;
                case 10:
                    System.out.print(" Digite o nome: ");
                    nome = teclado.nextLine();
                    System.out.print(" Digite o sobrenome: ");
                    sobrenome = teclado.nextLine();

                    try{
                        System.out.println("\n" + p.agenda.buscaContato(nome,sobrenome));
                        System.out.print(" Contato encontrado!");
                    }catch (Exception e){
                        throw new ArrayIndexOutOfBoundsException(" Contato NÃO encontrado!");
                    }
                    break;
                case 11:
                    ArrayList<Pessoa> pessoas = new ArrayList<>();

                    pessoas.add(new Pessoa ("Joao", "Silva" , dn1));
                    pessoas.add(new Pessoa ("Ana", "Paula" , dn2));
                    pessoas.add(new Pessoa ("Joao", "Santos", dn3));
                    pessoas.add(new Pessoa ("Joao", "Silva" , dn4));

                    //System.out.println(pessoas);
                    System.out.println("\n");
                    for(Pessoa pessoa: pessoas){
                        System.out.println(pessoa.getNome() + ", " + pessoa.getSobrenome() + ", " + pessoa.getDataNasc());
                    }
                    System.out.println("============================");
                    Collections.sort(pessoas); Collections.sort(pessoas);
                    for(Pessoa pessoa: pessoas){
                        System.out.println(pessoa.getNome() + ", " + pessoa.getSobrenome() + ", " + pessoa.getDataNasc());
                    }
                    break;
                case 12:
                    Pessoa p1 = new Pessoa ("Joao", "Silva" , dn1);
                    Pessoa p2 = new Pessoa ("Ana", "Paula" , dn2);
                    Pessoa p3 = new Pessoa ("Joao", "Santos", dn3);
                    Pessoa p4 = new Pessoa ("Joao", "Silva" , dn4);
                    Pessoa p5 = new Pessoa ("Maria", "Barbosa" , dn4);
                    Pessoa p6 = new Pessoa ("Marieva", "Silva" , dn4);
                    Pessoa p7 = new Pessoa ("Marieva", "Silva" , dn4);

                    System.out.println(p1.compareTo(p2));
                    System.out.println(p1.compareTo(p3));
                    System.out.println(p3.compareTo(p1));
                    System.out.println(p1.compareTo(p4));
                    System.out.println(p4.compareTo(p1));
                    System.out.println(p5.compareTo(p6));
                    System.out.println(p6.compareTo(p7));

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Opção inválida!");
                    System.exit(-1);
                    break;
            }
        }
    }
}
