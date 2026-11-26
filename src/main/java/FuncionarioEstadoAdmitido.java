public class FuncionarioEstadoAdmitido implements FuncionarioEstado {
    private FuncionarioEstadoAdmitido() {
    };

    private static FuncionarioEstadoAdmitido instance = new FuncionarioEstadoAdmitido();

    public static FuncionarioEstadoAdmitido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Admitido";
    }

}
