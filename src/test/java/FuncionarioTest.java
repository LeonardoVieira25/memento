import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveArmazenarEstados() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAdmitido.getInstance());
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertEquals(3, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAdmitido.getInstance());
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        funcionario.setEstado(FuncionarioEstadoAdmitido.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoAdmitido.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAdmitido.getInstance());
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        funcionario.setEstado(FuncionarioEstadoAdmitido.getInstance());
        funcionario.restauraEstado(2);
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
