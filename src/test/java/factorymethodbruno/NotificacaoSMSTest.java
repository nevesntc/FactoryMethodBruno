package factorymethodbruno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NotificacaoSMSTest {

    @Test
    void deveExecutarSMS() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("SMS");
        assertEquals("A notificação do SMS está ativada", notificacao.executar());
    }

    @Test
    void deveCancelarSMS() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("SMS");
        assertEquals("A notificação do SMS está desativada", notificacao.cancelar());
    }

}