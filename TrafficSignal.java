public class TrafficSignal {
    public static void main(String[] args) {
        SignalColor currentColor = SignalColor.RED;

        // Simulate the traffic signal for 10 iterations
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration " + i + ": " + currentColor);

            // Switch the signal color based on the current color
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

            // Delay for 1 second before the next iteration
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Enum to represent the signal colors
    private enum SignalColor {
        RED,
        GREEN,
        YELLOW
    }
}
