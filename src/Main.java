// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DownloadThread d1 = new DownloadThread("https://bitcode.in/java/demos.zip");
        d1.start();
        DownloadThread d2 = new DownloadThread("https://bitcode.in/web/demos.zip");
        d2.start();

        try {
            d1.join();
            d2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //code to be executed once download is finished
        System.out.println("***************");
        System.out.println("Download finished...");
        System.out.println("Opening the file.....");
        System.out.println("***************");

    }
}