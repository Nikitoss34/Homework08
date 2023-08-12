import java.util.Random;

public class HW08 {
    public static void main(String[] args) {
        Random random = new Random();
        int pcNum = random.nextInt(10);
        int tries = 1;
        for (; tries <= 3; tries++) {
            int automaticNum = random.nextInt(10);
            if (automaticNum == pcNum) {
                System.out.println("Ми вгадали число =" + pcNum + " з спроби № " + tries);
                break;
            }
        }
         if (tries >= 4) System.out.println("Ми не вгадали число = " + pcNum);

    }


}
