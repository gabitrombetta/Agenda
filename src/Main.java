import agenda.Agenda;
import contato.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int option = 0;

        while (option != 5) {
            System.out.println("====LISTA DE CONTATOS====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar contato pelo nome");
            System.out.println("4 - Listar contatos");
            System.out.println("5 - Sair");
            System.out.print("Insira a opção desejada: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    agenda.adicionarContato();
                    break;

                case 2:
                    agenda.removerContato();
                    break;

                case 3:
                    agenda.buscarContato();
                    break;

                case 4:
                    agenda.listarContatos();

                case 5:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
