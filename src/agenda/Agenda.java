package agenda;

import contato.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Agenda {
    public static List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void adicionarContato() {
        Scanner input = new Scanner(System.in);
        Contato contato = new Contato();

        System.out.println("====ADICIONAR CONTATO====");

        System.out.print("NOME: ");
        contato.setNome(input.nextLine());

        System.out.print("NÚMERO: ");
        contato.setNumero(input.nextLine());

        contatos.add(contato);
    }

    public void removerContato() {
        Scanner input = new Scanner(System.in);

        System.out.println("====REMOVER CONTATO====");

        System.out.print("Informe o nome do contato a remover: ");
        String nomeRemover = input.nextLine();

        for (Contato contato: contatos) {
            if (contato.getNome().equals(nomeRemover)) {
                contatos.remove(contato);
                System.out.println("Contato removido");
                break;
            }
        }
    }

    public void buscarContato() {
        Scanner input = new Scanner(System.in);

        System.out.println("====BUSCAR CONTATO====");
        System.out.print("Informe o nome do contato: ");
        String nomeBuscar = input.nextLine();
        for (Contato contato: contatos) {
            if (contato.getNome().equals(nomeBuscar)) {
                System.out.println("Contato encontrado!");
                System.out.println(contato.getNome() + ": " + contato.getNumero());
            }
        }
    }

    public void listarContatos() {
        int indice = 0;
        if (contatos.size() >= 1) {
            for (Contato contato: contatos) {
                System.out.println(contato);
                indice++;
            }
        } else {
            System.out.println("Sua lista de contatos está vazia");
        }
    }
}
