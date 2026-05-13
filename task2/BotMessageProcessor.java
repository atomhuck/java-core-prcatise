package task2;

public class BotMessageProcessor {
    public void processMessage(String message){
        VideoDownloader downloader = null;
        if (message.toLowerCase().contains("tiktok")) {
            downloader = new TikTokDownloader();
        } else if (message.toLowerCase().contains("instagram")) {
            downloader = new InstagramDownloader();
        }
        if (downloader != null) {
            try {
                downloader.download(message);
            } catch (Exception e){
                System.out.println("Ошибка при загрузке видео " + e.getMessage());
            }
        }
        else {
            System.out.println("Введена неккоректная ссылка!");
        }
    }
}
