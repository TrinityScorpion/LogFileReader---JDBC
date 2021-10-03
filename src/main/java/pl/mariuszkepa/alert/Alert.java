package pl.mariuszkepa.alert;

import javax.persistence.Id;

public class Alert {

    private String id;
    private long timestamp;
    private String type;
    private String host;
    private boolean alert;

    @Override
    public String toString() {
        return "Alert{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", type='" + type + '\'' +
                ", host='" + host + '\'' +
                ", alert=" + alert +
                '}';
    }

    public Alert(String id, long timestamp, String type, String host, boolean alert) {
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.host = host;
        this.alert = alert;
    }

    public Alert() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }
}
