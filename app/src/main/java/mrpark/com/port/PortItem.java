package mrpark.com.port;

import java.io.Serializable;

public class PortItem implements Serializable{
    String name;
    String port;

    public PortItem(String name, String port) {
        this.name = name;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
