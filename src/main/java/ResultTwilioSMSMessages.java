import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultTwilioSMSMessages {
    public static double calculateTotalMessageCost(List<String> messages) {
        Double valueGSM = 0.01;
        Double valueUCS = 0.015;
        Double costos = 0.0;
        boolean isUCS = false;
        for (String message : messages) {
            isUCS = isUCS(message.toLowerCase().replace(" ",""));
            Double value = isUCS ? valueUCS : valueGSM;
            int size = isUCS ? 70 : 160;
            System.out.println(message);
            if (message.length() > size) {
                int sms = message.length() / size;
                int modulo = message.length() % size;
                if (modulo != 0) {
                    sms++;
                }
                costos = costos + (sms * value);
            } else {
                costos = costos + value;
            }

        }
        return costos;
    }

    public static boolean isUCS(String message) {
        String typesGSM = "abcdefghijklmnñopqrstuvwxyz0123456789,.";
        for (int i = 0; i < message.length(); i++) {
            if(typesGSM.indexOf(message.charAt(i))==-1){
                return true;
            }
        }
        return false;
    }

}
