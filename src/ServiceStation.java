public class ServiceStation {

    public void check(Transport transport){
        System.out.println("Начинаем сервис");
        transport.service();
        System.out.println("Сервис закончен");
    }
}
