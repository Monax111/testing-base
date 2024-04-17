package sender;

public class MailClient {

    boolean sendText(String emil, String text) {
        System.out.println("Отправляем текст" + text);
        throw new RuntimeException("Нет сетевого доступа");
    }


}
