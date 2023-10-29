package DesignPattern.Prototype;

public class Image {
    private Long Id;
    private String Url;
    private ImageType Type;
    private byte[] ImageContent;

    public Image(Long id, String url, ImageType type) {
        Id = id;
        Url = url;
        Type = type;
        //API call to get image in Azure blob storage and convert it in bytes[]
        //and stored in ImageContent;
    }

    public Image getImage()
    {
        //API call to get image data;
        //convert image data to Image object
        return this;
    }
}
