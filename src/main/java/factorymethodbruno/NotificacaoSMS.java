package factorymethodbruno;

public class NotificacaoSMS implements INotificacao {

    public String executar() {
        return "A notificação do SMS está ativada";
    }

    public String cancelar() {
        return "A notificação do SMS está desativada";
    }
}