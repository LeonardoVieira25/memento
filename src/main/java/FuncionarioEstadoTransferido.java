public class FuncionarioEstadoTransferido implements FuncionarioEstado {

    private FuncionarioEstadoTransferido() {};

    private static FuncionarioEstadoTransferido instance = new FuncionarioEstadoTransferido();

    public static FuncionarioEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
    }

}
