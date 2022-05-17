public class ProductLine {
    private String name;
    private String textDescription;
    private String htmlDescription;
    private String imageUrl;

    public ProductLine(String name, String textDescription, String htmlDescription, String imageUrl) {
        this.name = name;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
        this.imageUrl = imageUrl;
    }

    public ProductLine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "name='" + name + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", htmlDescription='" + htmlDescription + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
