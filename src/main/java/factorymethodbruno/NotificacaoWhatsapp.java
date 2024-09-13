// NotificacaoWhatsApp.java
package factorymethodbruno;

class NotificacaoWhatsApp implements INotificacao {
    @Override
    public String executar() {
        return "Notificação WhatsApp executada";
    }

    @Override
    public String cancelar() {
        return "Notificação WhatsApp cancelada";
    }
}