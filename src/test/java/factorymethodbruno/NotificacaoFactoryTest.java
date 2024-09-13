// NotificacaoFactoryTest.java
package factorymethodbruno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    @Test
    void testObterTipoWhatsApp() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("WhatsApp");
        assertTrue(notificacao instanceof NotificacaoWhatsApp);
    }

    @Test
    void testObterTipoInstagram() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Instagram");
        assertTrue(notificacao instanceof NotificacaoInstagram);
    }

    @Test
    void testObterTipoSMS() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("SMS");
        assertTrue(notificacao instanceof NotificacaoSMS);
    }

    @Test
    void testObterTipoDesktop() {
        INotificacao notificacao = NotificacaoFactory.obterTipo("Desktop");
        assertTrue(notificacao instanceof NotificacaoDesktop);}
}