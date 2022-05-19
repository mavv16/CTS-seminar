package memento;

public class FileSnapshot {

    private String content;  //putea sa fie si de tip File insa se optimizeaza codul deoarece doar content ul se schimba
    private int version;
    private String dateTime;
    private String message;

    public FileSnapshot(String content, int version, String dateTime, String message) {
        this.content = content;
        this.version = version; //unic
        this.dateTime = dateTime;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public int getVersion() {
        return version;
    }

    public String getDetails() {
        return "FileSnapshot{" +
                "version='" + version + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}