public class DownloadThread extends Thread {

    private String url;

    public DownloadThread(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(url + " - " + i + "%");
        }
    }
}
