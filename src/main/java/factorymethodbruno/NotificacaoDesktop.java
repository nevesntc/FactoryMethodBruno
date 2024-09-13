package factorymethodbruno;

class NotificacaoDesktop implements INotificacao {
    @Override
    public String executar() {
        return "A notificação de desktop está ativada";
    }

    @Override
    public String cancelar() {
        return "A Notificação Desktop cancelada";
    }
}