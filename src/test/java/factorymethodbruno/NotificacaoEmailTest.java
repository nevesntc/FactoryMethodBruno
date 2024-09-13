package factorymethodbruno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NotificacaoEmailTest {

    @Test
    void deveExecutarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Email");
        assertEquals("A notificação de email está ativada", notificacao.executar());
    }

    @Test
    void deveCancelarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Email");
        assertEquals("A notificação de email está desativada", notificacao.cancelar());
    }

}