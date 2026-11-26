public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAdmitido.getInstance());
        System.out.println("Estado atual: " + funcionario.getEstado());

        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        System.out.println("Estado atual: " + funcionario.getEstado());

        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        System.out.println("Estado atual: " + funcionario.getEstado());

        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        System.out.println("Estado atual: " + funcionario.getEstado());


        System.out.println("\nRestaurando para o segundo estado (Ativo):");
        funcionario.restauraEstado(1);
        System.out.println("Estado atual: " + funcionario.getEstado());


    }
}
