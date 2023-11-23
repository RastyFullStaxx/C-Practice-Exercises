import java.io.IOException;
import java.util.List;

public class ProcessBuilderExample {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("ls", "-l");
            builder.redirectErrorStream(true);
            Process process = builder.start();

            // Read the output of the external process
            ProcessOutputReader outputReader = new ProcessOutputReader(process.getInputStream());
            Thread outputThread = new Thread(outputReader);
            outputThread.start();

            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class ProcessOutputReader implements Runnable {
        private final java.io.InputStream inputStream;

        ProcessOutputReader(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
        }

        public void run() {
            try {
                int data;
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
