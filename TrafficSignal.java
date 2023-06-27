public class TrafficSignal {
    public static void main(String[] args) {
        SignalColor currentColor = SignalColor.RED;

       
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration " + i + ": " + currentColor);

           
            switch (currentColor) {
                case RED:
                    currentColor = SignalColor.GREEN;
                    break;
                case GREEN:
                    currentColor = SignalColor.YELLOW;
                    break;
                case YELLOW:
                    currentColor = SignalColor.RED;
                    break;
            }

          
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

 
    private enum SignalColor {
        RED,
        GREEN,
        YELLOW
    }
}
