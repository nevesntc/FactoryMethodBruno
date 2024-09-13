package factorymethodbruno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NotificacaoInstagramTest {

    @Test
    void deveExecutarInstagram() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Instagram");
        assertEquals("A notificação do instagram está ativada", notificacao.executar());
    }

    @Test
    void deveCancelarInstagram() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Instagram");
        assertEquals("A notificação do instagram está desativada", notificacao.cancelar());
    }

}