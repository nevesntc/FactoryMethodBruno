package factorymethodbruno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NotificacaoDesktopTest {

    @Test
    void deveExecutarDesktop() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Desktop");
        assertEquals("A notificação de desktop está ativada", notificacao.executar());
    }

    @Test
    void deveCancelarDesktop() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Desktop");
        assertEquals("A Notificação Desktop cancelada", notificacao.cancelar());
    }
}