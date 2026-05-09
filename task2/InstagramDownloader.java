package task2;

public class InstagramDownloader implements VideoDownloader{
    @Override
    public void download (String url){
        System.out.println("Подключение к API Instagram... извлечение токена... скачивание");
    }
    private void extractVideoId(String url){}
    private void bypassSecurity(){}
}
