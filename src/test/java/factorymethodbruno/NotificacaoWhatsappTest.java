package factorymethodbruno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoWhatsappTest {

    @Test
    void deveRetornarNotificacaoWhatsappExecutada() {
        INotificacao notificacao = new NotificacaoWhatsApp();
        assertEquals("Notificação WhatsApp executada", notificacao.executar());
    }

    @Test
    void deveRetornarNotificacaoWhatsappCancelada() {
        INotificacao notificacao = new NotificacaoWhatsApp();
        assertEquals("Notificação WhatsApp cancelada", notificacao.cancelar());
    }
}