import Models.User;
import Services.UserServices;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        UserServices UserService = new UserServices();
        Scanner scanner = new Scanner(System.in);
        User user = null;
        int option = 0;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nSeja bem-vindo!!");
        System.out.println("\n-------------------------------------------------------------------------");

        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Remover");
            System.out.println("[4] Listar");
            System.out.println("[5] Sair");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\nInsira uma opcao valida: ");
            option = scanner.nextInt();
            scanner.nextLine();
           

            switch (option) {
                case 1:
                    System.out.println("Nome: ");
                    String name = scanner.nextLine();
                    System.out.println("Idade: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    if (UserService.searchUser(email) != null) {
                        System.out.println("O email ja está cadastrado!!");
                    } else {
                        System.out.println("Senha: ");
                        String password = scanner.nextLine();
                        UserService.addUser(new User(name, age, email, password));
                        System.out.println("Usuario cadastrado com sucesso!!");
                    }
                    break;
                case 2:
                    System.out.println("Email do usuario que deseja consultar: ");
                    String emailSearch = scanner.nextLine();
                    user = UserService.searchUser(emailSearch);
                    System.out.println(user != null ? user : "Usuario nao encontrado!!");
                    break;
                case 3:
                    System.out.println("Email do usuario que deseja remover: ");
                    String emailRemove = scanner.nextLine();
                    User userToRemove = UserService.searchUser(emailRemove);
                    if (userToRemove != null) {
                        System.out.println("Senha do usuario que deseja remover: ");
                        String passwordRemove = scanner.nextLine();
                        if (userToRemove.getPassword().equals(passwordRemove)) {
                            UserService.removeUser(emailRemove);
                        }
                    } else {
                        System.out.println("Usuario nao encontrado!!");
                    }
                    break;
                case 4:
                    UserService.listUsers();
                    break;
                case 5:
                    System.out.println("Sessao encerrada!!");
                    break;
                default:
                    System.out.println("Opcao invalida!!");
                    break;
            }
            
        } while (option != 5);
        scanner.close();
    }
}
