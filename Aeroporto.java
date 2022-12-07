import java.util.Scanner;

public class Aeroporto {
    
    public static void main(String[] args) {
        System.out.println("Estacionamento");
        System.out.println("==============");
        System.out.println("1 - Cadastrar aeronave");
        System.out.println("2 - Cadastrar companhia");
        System.out.println("3 - Cadastrar hangar");
        System.out.println("4 - Cadastrar pista");
        System.out.println("5 - Cadastrar voo");
        System.out.println("6 - Listar aeronave");
        System.out.println("7 - Listar companhia");
        System.out.println("8 - Listar hangar");
        System.out.println("9 - Listar pista");
        System.out.println("10 - Listar voo");
        System.out.println("11 - Excluir aeronave");
        System.out.println("12 - Excluir companhia");
        System.out.println("13 - Excluir hangar");
        System.out.println("14 - Excluir pista");
        System.out.println("15 - Excluir voo");
        System.out.println("16 - Sair");
        System.out.println("==============");
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Cadastrar aeronave");
                    System.out.println("==============");
                    System.out.print("Tipo: ");
                    char tipo = scanner.next().charAt(0);
                    switch (tipo) {
                        case 'A':
                            criarAviao(scanner);
                            break;
                        
                        case 'H':
                            criarHelicoptero(scanner);
                            break;

                        case 'J':
                            criarJato(scanner);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Cadastrar companhia");
                    System.out.println("==============");
                    criarCompanhia(scanner);
                    break;
                case 3:
                    System.out.println("Cadastrar hangar");
                    System.out.println("==============");
                    criarHangar(scanner);
                    break;
                case 4:
                    System.out.println("Cadastrar pista");
                    System.out.println("==============");
                    criarPista(scanner);
                    break;
                case 5:
                    System.out.println("Cadastrar voo");
                    System.out.println("==============");
                    criarVoo(scanner);
                    break;
                case 6:
                    System.out.println("Listar aeronave");
                    System.out.println("==============");
                    listarAviao();
                    listarHelicoptero();
                    listarJato();
                    break;
                case 7:
                    listarCompanhia();
                    break;
                case 8:
                    listarHangar();
                    break;
                case 9:
                    listarPista();
                    break;
                case 10:
                    listarVoo();
                    break;
                case 11:
                    System.out.println("Excluir aeronave");
                    System.out.println("==============");
                    char tipoExcluir = scanner.next().charAt(0);
                    switch (tipoExcluir) {
                        case 'A':
                            excluirAviao(scanner);
                            break;
                        
                        case 'H':
                            excluirHelicoptero(scanner);
                            break;

                        case 'J':
                            excluirJato(scanner);
                            break;
                        default:
                            break;
                    }
                    break;
                case 12:
                    System.out.println("Excluir companhia");
                    System.out.println("==============");
                    excluirCompanhia(scanner);
                    break;
                case 13:
                    System.out.println("Excluir hangar");
                    System.out.println("==============");
                    excluirHangar(scanner);
                    break;
                case 14:
                    System.out.println("Excluir pista");
                    System.out.println("==============");
                    excluirPista(scanner);
                    break;
                case 15:
                    System.out.println("Excluir voo");
                    System.out.println("==============");
                    excluirVoo(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }

    public static void criarAviao(Scanner scanner) {
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Letras do Prefixo: ");
        String letras = scanner.next();
        if (letras.length() != 3) {
            System.out.println("Letras do prefixo inválidas!");
            return;
        } // SOLICITA AS LETRAS E NUMEROS NOS RESPECTIVOS TAMANHOS, CASO SEJA DIFERENTE, APRESENTA O ERRO
        System.out.println("Números do Prefixo: ");
        String numeros = scanner.next();
        if (numeros.length() != 4) {
            System.out.println("Números do prefixo inválidos!");
            return;
        }
        System.out.println("Capacidade: ");
        int capacidade = scanner.nextInt();
        System.out.println("Capacidade: ");
        int idCompanhia = scanner.nextInt();

        try {
            new Aviao(idCompanhia, marca, modelo, letras, numeros, capacidade, idCompanhia);
            System.out.println("Avião criado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void criarHelicoptero(Scanner scanner) {
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Cor: ");
        String cor = scanner.next();
        System.out.println("Capacidade: ");
        int capacidade = scanner.nextInt();
        new Helicoptero(capacidade, marca, modelo, cor, capacidade);
        System.out.println("Helicoptero criada com sucesso!");
    }

    public static void criarJato(Scanner scanner) {
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Cor: ");
        String cor = scanner.next();
        System.out.println("Capacidade: ");
        int velocidade = scanner.nextInt();
        new Helicoptero(velocidade, marca, modelo, cor, velocidade);
        System.out.println("Helicoptero criada com sucesso!");
    }

    public static void criarCompanhia(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int idCompanhia = scanner.nextInt();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("CNPJ: ");
            String cnpj= scanner.next();
            new Companhia(0, nome, cnpj);
            System.out.println("Vaga criada com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void criarHangar(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int idHangar = scanner.nextInt();
            System.out.println("Local: ");
            String local = scanner.next();
            System.out.println("Id do Avião: ");
            int idAviao = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    public static void criarPista(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int idPista = scanner.nextInt();
            System.out.println("Letras do número da pista: ");
            String letras = scanner.next();
            if (letras.length() != 1) {
            System.out.println("Letras do número da pista inválidas!");
            return;
        } // SOLICITA AS LETRAS E NUMEROS NOS RESPECTIVOS TAMANHOS, CASO SEJA DIFERENTE, APRESENTA O ERRO
            System.out.println("Números do número da pista: ");
            String numeros = scanner.next();
            if (numeros.length() != 2) {
            System.out.println("Números do número da pista inválidos!");
            return;
        }
            new Pista(idPista, letras, numeros);
            System.out.println("Pista criado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }
}

    public static void criarVoo(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int idVoo = scanner.nextInt();
            System.out.println("Data: ");
            String data = scanner.next();
            System.out.println("Hora: ");
            String hora = scanner.next();
            System.out.println("Origem: ");
            String origem = scanner.next();
            System.out.println("Destino: ");
            String destino = scanner.next();
            System.out.println("Piloto: ");
            String piloto = scanner.next();
            System.out.println("Co-piloto: ");
            String copiloto = scanner.next();
            System.out.println("Observação: ");
            String observacao = scanner.next();
            System.out.println("Letras do número do Voo: ");
            String letras = scanner.next();
            if (letras.length() != 1) {
            System.out.println("Letras do número do Voo inválidas!");
            return;
        } // SOLICITA AS LETRAS E NUMEROS NOS RESPECTIVOS TAMANHOS, CASO SEJA DIFERENTE, APRESENTA O ERRO
            System.out.println("Números do número do Voo: ");
            String numeros = scanner.next();
            if (numeros.length() != 2) {
            System.out.println("Números do número do Voo inválidos!");
            return;
        }
            new Voo(idVoo, data, hora, origem, destino, piloto, copiloto, letras, numeros, numeros, idVoo, null, idVoo, null, idVoo, null, idVoo, null);
            System.out.println("Voo criado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void listarAviao() {
        System.out.println("Listar Aviões");
        System.out.println("==============");
        for (Aviao aviao : Aviao.getAviao()) {
            System.out.println(aviao);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void listarHelicoptero() {
        System.out.println("Listar Helicopteros");
        System.out.println("==============");
        for (Helicoptero helicoptero : Helicoptero.getHelicoptero()) {
            System.out.println(helicoptero);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void listarJato() {
        System.out.println("Listar Jatos");
        System.out.println("==============");
        for (Jato jato : Jato.getJato()) {
            System.out.println(jato);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void listarCompanhia() {
        System.out.println("Listar Companhias");
        System.out.println("==============");
        for (Companhia companhia : Companhia.getCompanhia()) {
            System.out.println(companhia);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void listarHangar() {
        System.out.println("Listar Hangares");
        System.out.println("==============");
        for (Hangar hangar : Hangar.getHangar()) {
            System.out.println(hangar);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void listarPista() {
        System.out.println("Listar Pistas");
        System.out.println("==============");
        for (Pista pista : Pista.getPista()) {
            System.out.println(pista);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void listarVoo() {
        System.out.println("Listar Voos");
        System.out.println("==============");
        for (Voo voo : Voo.getVoo()) {
            System.out.println(voo);
        }
    } // FOR PARA PERCORRER TODOS OS VALORES CADASTRADOS E PRINTAR EM TELA

    public static void excluirAviao(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Aviao.excluir(id);
            System.out.println("Avião excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO

    public static void excluirHelicoptero(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Helicoptero.excluir(id);
            System.out.println("Helicoptero excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO

    public static void excluirJato(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Jato.excluir(id);
            System.out.println("Jato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO

    public static void excluirCompanhia(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Companhia.excluir(id);
            System.out.println("Companhia excluída com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO

    public static void excluirHangar(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Hangar.excluir(id);
            System.out.println("Hangar excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO

    public static void excluirPista(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Pista.excluir(id);
            System.out.println("Pista excluída com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO

    public static void excluirVoo(Scanner scanner) {
        try {
            System.out.println("Id: ");
            int id = scanner.nextInt();
            Voo.excluir(id);
            System.out.println("Voo excluído com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // EXCLUI O VALOR CADASTRADO, DE ACORDO COM O ID DIGITADO
}
