package factorymethodbruno;

public class NotificacaoFactory {

    public static INotificacao obterTipo(String tipo) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethodbruno.Notificacao" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo Inexistente: " + tipo);
        }
        if (!(objeto instanceof INotificacao)) {
            throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }
        return (INotificacao) objeto;
    }
}