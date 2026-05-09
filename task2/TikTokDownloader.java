package task2;

public class TikTokDownloader implements VideoDownloader{
    @Override
    public void download(String url){
        System.out.println("Подключение к API TikTok... извлечение токена... скачивание");
    }
    private void extractVideoId(String url){}
    private void bypassSecurity(){}
}
