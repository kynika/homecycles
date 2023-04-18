package ru.netology.java.qa.homecycles.sgr;
public class SQRService {

    public int calcVolumeSqrt(int start, int end) {
        int volume = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= start) & (i * i <= end)) {
                volume++;
            }
        }
        return volume;
    }

}
