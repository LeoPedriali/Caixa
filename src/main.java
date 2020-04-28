import java.util.Scanner;
    class Main {
        public static void main(String[] args) {

            String cpf, senha; // variaveis usadas para o login
            int menuOperacao, menuSair, menuDeposito; // variaveis usadas para os menus com Switch
            double saldo = 1000, deposito, saque, transfer; // variaveis de valor usadas nas operações
            Scanner ler = new Scanner(System.in); // Definir um scanner

            for (int i = 1; i == 1;)
            {
                System.out.println("Bem-Vindo ao banco Easymoney! Seu melhor amigo financeiro");
                System.out.println("Faça login para começar a utilizar nossas ferramentas");

                System.out.print("Digite seu cpf: ");
                cpf = ler.next(); // pegar o cpf do cliente

                if (cpf.equals("123.456.789-00") || cpf.equals("12345678900")) // verificar se o cpf bate com o desejado
                {
                    for(int a = 1; a <= 3; a++) // For para repetição de senha caso esteja errada
                    {
                        System.out.print("Digite sua senha: ");
                        senha = ler.next(); // pegar a senha do cliente
                        // verificar se a senha bate com o desejado:
                        if(senha.equals("01020304")) // Caso seja igual, segue para o menu de operação
                        {
                            a = 4; // finaliza o for de repetição de senha, para que quando saia do sistema ele nao peça senha denovo e finalize o programa
                            System.out.println("Login efetuado com sucesso!"); // informa que o cliente conseguiu logar

                            for(int b = 1; b == 1;) // for para a repetição do menu de operações
                            {
                                System.out.println(); // pula linha
                                System.out.println("1) Saldo"); //menu
                                System.out.println("2) Depósito"); //menu
                                System.out.println("3) Saque"); //menu
                                System.out.println("4) Transferencia"); //menu
                                System.out.println("0) Sair"); //menu
                                System.out.println(); // pula linha
                                System.out.print("Digite a operação desejada: "); // pede a opção do cliente
                                menuOperacao = ler.nextInt(); // pegar a operação desejada
                                switch (menuOperacao) // switch para enviar para a operação desejada
                                {
                                    case 1: // Caso escolha saldo
                                        System.out.println("seu saldo é " + saldo); // Printa o saldo para o cliente
                                        System.out.println("deseja continuar utilizando?");
                                        for(int c = 1; c == 1;) // for para checar se o cliente deseja continuar utilizando outras operações ou deseja sair
                                        {
                                            System.out.println(); // pula linha
                                            System.out.println("1) Sim"); //menu
                                            System.out.println("2) Não"); // menu
                                            System.out.println(); // pula linha
                                            menuSair = ler.nextInt(); // pegar a opção desejada
                                            switch(menuSair) // switch do menu de sair ou continuar
                                            {
                                                case 1: // caso queira continuar
                                                    c++; // encerra o FOR do menu de saída e volta para o menu de operações
                                                    break;
                                                case 2: // caso queira sair
                                                    System.out.println("Obrigado pela sua preferencia!");
                                                    c++; // encerra o FOR do menu de saída
                                                    b++; // encerra o FOR do menu de operações e finaliza o programa
                                                    break;
                                                default: // caso a opção nao seja valida
                                                    System.out.println("Opção Invalida, Tente novamente"); //apenas retorna para o menu de sair ou continuar
                                            }
                                        }
                                        break;
                                    case 2: // caso escolha deposito
                                        System.out.print("Digite o valor de depósito desejado: "); // pergunta qual valor de depósito o cliente deseja fazer
                                        deposito = ler.nextDouble(); // pega o valor do deposito
                                        if(deposito <= 0) // Verifica o deposito do cliente, caso seja invalido:
                                        {
                                            System.out.println("Você digitou um valor inválido, digite:"); //informa o cliente
                                            for(int c = 1; c == 1;) //for para repetir se o cliente deseja sair ou digitar novamente quando digitar um valor invalido no deposito
                                            {
                                                System.out.println("1) para digitar um novo valor"); //menu de opcoes
                                                System.out.println("2) voltar as operações"); //menu de opcoes
                                                menuDeposito = ler.nextInt(); // pega a opçao do cliente
                                                switch(menuDeposito) // Switch do menu de opçoes caso o deposito seja invalido
                                                {
                                                    case 1: //caso deseje inserir outro valor
                                                        c++; // encerra a repetição do menu se deseja sair ou digitar outro valor
                                                        System.out.print("Digite o valor de depósito desejado: ");// pergunta o valor ao cliente
                                                        deposito = ler.nextDouble(); // pega o valor do cliente
                                                        if (deposito <= 0) //verifica se o deposito é valido, se for invalido:
                                                        {
                                                            System.out.print("Voce Digitou um valor inválido muitas vezes! Retornaremos você para o menu inicial"); // avisa o cliente
                                                        }
                                                        else // se for valido:
                                                        {
                                                            saldo = saldo + deposito; // deposita para o cliente
                                                            System.out.println("deseja continuar utilizando?");
                                                            for(int d = 1; d == 1;) // for menu sair ou continuar
                                                            {
                                                                System.out.println("1) Sim"); //menu
                                                                System.out.println("2) Não"); // menu
                                                                menuSair = ler.nextInt(); // pega a opçao do cliente

                                                                switch(menuSair) // Switch para o menu de sair ou continuar
                                                                {
                                                                    case 1: //caso queira continuar
                                                                        d++; // sai do menu de sair ou continuar
                                                                        break;
                                                                    case 2: //caso queira sair
                                                                        b++; // sai do menu de operações
                                                                        d++; // sai do menu de sair ou continuar
                                                                        break;
                                                                    default: // caso digite uma opção invalida
                                                                        System.out.println("Digite um valor válido"); // avisa o cliente e repete o menu
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 2: // caso deseje voltar ao menu de operações
                                                        c++; // encerra a repetição do menu se deseja sair ou digitar outro valor
                                                        break;
                                                    default: // caso digite uma opção invalida
                                                        System.out.println("Opção Invalida, tente novamente! ");//avisa o cliente (o menu se repete)
                                                }
                                            }
                                        }
                                        else // caso seja valido:
                                        {
                                            saldo = saldo + deposito; // deposita no saldo do cliente o valor digitado

                                            for(int c = 1; c == 1;) // for para repetir o menu sair ou continuar caso digite uma opção invalida
                                            {
                                                System.out.println("Deseja continuar?"); // pergunta se o cliente quer continuar
                                                System.out.println("1) Sim"); //menu
                                                System.out.println("2) Não"); // menu
                                                menuSair = ler.nextInt(); // pega a opção do cliente
                                                switch(menuSair) // menu de sair ou continuar
                                                {
                                                    case 1: // caso queira continuar
                                                        c++; // encerra a repetição do menu sair ou continuar
                                                        break;
                                                    case 2:
                                                        c++; // encerra a repetição do menu sair ou continuar
                                                        b++; // encerra a repetição do menu de operações
                                                        break;
                                                    default: // caso a opção nao seja valida
                                                        System.out.println("Digite um valor válido");//informa o cliente e repete o menu
                                                }
                                            }
                                        }
                                        break;
                                    case 3: // caso queira sacar
                                        System.out.print("Digite o valor do saque: "); // pede o valor do saque
                                        saque = ler.nextDouble(); // pega o valor do saque
                                        if (saque > saldo || saque <= 0) // verifica se o saque e valido
                                        {
                                            System.out.println("Valor inválido!");
                                        }
                                        else
                                        {
                                            saldo = saldo - saque; // subtrai o saque do saldo atual
                                            System.out.println("Saque feito com sucesso!");
                                            System.out.println("Seu saldo atual é de: " + saldo); // printa o novo saldo
                                        }
                                        System.out.println("deseja continuar utilizando?");
                                        for(int c = 1; c == 1;) // for para checar se o cliente deseja continuar utilizando outras operações ou deseja sair
                                        {
                                            System.out.println(); // pula linha
                                            System.out.println("1) Sim"); //menu
                                            System.out.println("2) Não"); // menu
                                            System.out.println(); // pula linha
                                            menuSair = ler.nextInt(); // pegar a opção desejada
                                            switch(menuSair) // switch do menu de sair ou continuar
                                            {
                                                case 1: // caso queira continuar
                                                    c++; // encerra o FOR do menu de saída e volta para o menu de operações
                                                    break;
                                                case 2: // caso queira sair
                                                    System.out.println("Obrigado pela sua preferencia!");
                                                    c++; // encerra o FOR do menu de saída
                                                    b++; // encerra o FOR do menu de operações e finaliza o programa
                                                    break;
                                                default: // caso a opção nao seja valida
                                                    System.out.println("Opção Invalida, Tente novamente"); //apenas retorna para o menu de sair ou continuar
                                            }
                                        }
                                        break;
                                    case 4:
                                        System.out.print("Digite a agencia: ");
                                        ler.next();
                                        System.out.print("Digite a conta: ");
                                        ler.next();
                                        System.out.print("Digite o valor: ");
                                        transfer = ler.nextDouble();
                                        if (transfer > saldo || transfer <= 0)
                                        {
                                            System.out.println("Valor inválido");
                                        }
                                        else
                                        {
                                            saldo = saldo - transfer;
                                            System.out.println("Transferencia feita com sucesso ");
                                            System.out.println("seu novo saldo é de: " + saldo);
                                        }
                                        System.out.println("deseja continuar utilizando?");
                                        for(int c = 1; c == 1;) // for para checar se o cliente deseja continuar utilizando outras operações ou deseja sair
                                        {
                                            System.out.println(); // pula linha
                                            System.out.println("1) Sim"); //menu
                                            System.out.println("2) Não"); // menu
                                            System.out.println(); // pula linha
                                            menuSair = ler.nextInt(); // pegar a opção desejada
                                            switch(menuSair) // switch do menu de sair ou continuar
                                            {
                                                case 1: // caso queira continuar
                                                    c++; // encerra o FOR do menu de saída e volta para o menu de operações
                                                    break;
                                                case 2: // caso queira sair
                                                    System.out.println("Obrigado pela sua preferencia!");
                                                    c++; // encerra o FOR do menu de saída
                                                    b++; // encerra o FOR do menu de operações e finaliza o programa
                                                    break;
                                                default: // caso a opção nao seja valida
                                                    System.out.println("Opção Invalida, Tente novamente"); //apenas retorna para o menu de sair ou continuar
                                            }
                                        }
                                        break;
                                    case 0: // caso queria sair
                                        System.out.println("Sair");
                                        b++; // encerra a repetição do menu de operações
                                    default: //caso digite uma opcao invalida
                                        System.out.println("Opçao invalida, tente novamente"); // informa o cliente e repete o menu de operações
                                        break;
                                }
                            }
                        }
                        else // caso a senha não seja igual, o cliente tem mais 2 tentativas
                        {
                            switch(a) // Switch para contar as tentativas de senha
                            {
                                case 1: // Caso a senha esteja errada, exibe essa mensagem:
                                    System.out.println("Senha inválida, tente novamente.");
                                    break;
                                case 2: //caso erre novamente, envia um aviso para o cliente
                                    System.out.println("Senha inválida, tente novamente.");
                                    System.out.println("ATENÇÃO! Caso erre a senha mais uma vez sua conta sera temporariamente bloqueada!");
                                    break;
                                case 3: // Caso erre as 3 vezes a conta é bloqueada e o programa encerra
                                    System.out.println("CONTA BLOQUEADA!");
                                    System.out.println("Você errou sua senha muitas vezes!");
                                    System.out.println("Para mais informações, entre em contato conosco via telefone ou compareça a uma de nossas unidades.");
                                    break;
                            }
                        }
                    }
                }
                else // caso o cpf não seja igual, termina o programa com a tela de acesso nao permitida
                {
                    System.out.println("Cpf Inválido!");
                    System.out.println("Acesso não permitido!");
                }
            }
        }
    }
