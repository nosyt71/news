package sg.nus.news.model;

public class News {
    private String title;
    private String urlToImage;
    private String author;
    private String description;
    private String publishedAt;
    private String articleUrl;

    public News(String title, String urlToImage, String author, String description, String publishedAt,
            String articleUrl) {
        this.title = title;
        this.urlToImage = urlToImage;
        this.author = author;
        this.description = description;
        this.publishedAt = publishedAt;
        this.articleUrl = articleUrl;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrlToImage() {
        return urlToImage;
    }
    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public String getArticleUrl() {
        return articleUrl;
    }
    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }
    


}
