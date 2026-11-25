import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        boolean rodar = true;

        while (rodar) {
            System.out.println("""
                    
                    Escolha sua opção:
                    [1]- Adicionar tarefa
                    [2]- Mostrar tarefa
                    [3]- Remover tarefa
                    [4]- Sair
                    """);
            int opcaoMenu = teclado.nextInt();
            teclado.nextLine();

            if(opcaoMenu == 1) {
                System.out.println("Digite a quantidade de tarefas que deseja adicionar: ");
                int quantidade = teclado.nextInt();
                teclado.nextLine();

                for(int i = 0; i < quantidade; i++){
                    System.out.println("Escreva a tarefa " + (i + 1) + " que deseja adicionar: ");
                    String novaTarefa = teclado.nextLine();
                    if(lista.contains(novaTarefa)) {
                        System.out.println("Você ja adicionou essa tarefa!");
                        break;
                    } else {
                        lista.add(novaTarefa);
                    }
                }

                for(int i = 0; i < quantidade; i++){
                    System.out.println("Você adicionou " + lista.get(i).toUpperCase() + " na lista!");
                }
            } else if(opcaoMenu == 2) {
                if(lista.isEmpty()){
                    System.out.println("A lista esta vazia!");
                } else {
                    for(int i = 0; i < lista.size(); i++){
                        System.out.println((i + 1) + "- " + lista.get(i));
                    }
                }
            } else if(opcaoMenu == 3) {
                if(lista.isEmpty()){
                    System.out.println("Não tem nada para remover!");
                } else {
                    System.out.println("Escreva o número que deseja remover: ");
                    int remover = teclado.nextInt();
                    lista.remove(remover - 1);
                }
            } else if(opcaoMenu == 4) {
                System.out.println("Você saiu do programa!");
                rodar = false;
            }
        }
    }
}