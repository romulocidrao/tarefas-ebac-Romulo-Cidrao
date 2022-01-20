import br.com.rcidrao.dao.ClienteMapDAO;
import br.com.rcidrao.dao.IClienteDAO;
import br.com.rcidrao.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastrar, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
        "Projeto de Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção inválida! Digite 1 para cadastrar, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Projeto de Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            }else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula, conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            }else if(isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            }else if (isExclusao(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente", "Consulta de Cliente", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            }else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digide os dados do cliente separados por virgula, para atualização", "Atualizado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastrar, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Projeto de Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        //Tentar validar se todos os campos estão preenchidos.
        //Se não tiver, passar null no construtor onde o valor é nulo.
        //Cliente cliente = new Cliente(dadosSeparados[0], null, null, null, null, null
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        //Validar se foi passado somente o CPF.
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado!" + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Erro!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }

    private static void atualizar(String dados) {
        String[] isAlteracao = dados.split(",");
        Cliente cliente = new Cliente(isAlteracao[0],isAlteracao[1],isAlteracao[2],isAlteracao[3],isAlteracao[4],isAlteracao[5],isAlteracao[6]);
        iClienteDAO.alterar(cliente);
        }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
        return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }


}



