package factorymethodbruno;

public class NotificacaoInstagram implements INotificacao{


    public String executar() {
        return "A notificação do instagram está ativada";
    }

    public String cancelar() {
        return "A notificação do instagram está desativada";
    }
}
