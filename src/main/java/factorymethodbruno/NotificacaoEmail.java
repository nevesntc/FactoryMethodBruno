package factorymethodbruno;

public class NotificacaoEmail implements INotificacao {

    public String executar() {
        return "A notificação de email está ativada";
    }

    public String cancelar() {
        return "A notificação de email está desativada";
    }
}
