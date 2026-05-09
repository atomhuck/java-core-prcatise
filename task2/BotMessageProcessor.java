package task2;

public class BotMessageProcessor {
    public void processMessage(String message){
        if (message.contains("tiktok")) {
            VideoDownloader downloader = new TikTokDownloader();
            try {
                downloader.download(message);
            } catch (IllegalArgumentException e){
                System.out.println(String.format("Something is wrong: %s", e));
            }
        }
        else if (message.contains("instagram")) {
            VideoDownloader downloader = new InstagramDownloader();
            try {
                downloader.download(message);
            } catch (IllegalArgumentException e){
                System.out.println(String.format("Something is wrong: %s", e));
            }
        }
        else{
            System.out.println("Введена неккоректная ссылка");
        }
    }
}
