public class FuncionarioEstadoAposentado implements FuncionarioEstado {

    private FuncionarioEstadoAposentado() {};

    private static FuncionarioEstadoAposentado instance = new FuncionarioEstadoAposentado();

    public static FuncionarioEstadoAposentado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aposentado";
    }

}
