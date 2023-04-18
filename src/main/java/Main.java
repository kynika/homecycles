import ru.netology.java.qa.homecycles.sgr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();


        int volumeInRange = service.calcVolumeSqrt(200, 300);
        System.out.println(volumeInRange);

    }
}
