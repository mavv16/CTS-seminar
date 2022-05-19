package memento;

public class File {
    private String content;
    private String id;
    private String address;
    private String name;

    public File(String content, String id, String address, String name) {
        this.content = content;
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public String print() {
        return "File{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public FileSnapshot createSnapShot() {
        FileSnapshot fileSnapshot = new FileSnapshot(content, VersionControl.getNextVersionNumber(), "19/05/2022", "commit");
        return fileSnapshot;
    }

    public File restoreToSomePoint(FileSnapshot fileSnapshot) {
        this.content = fileSnapshot.getContent();
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}