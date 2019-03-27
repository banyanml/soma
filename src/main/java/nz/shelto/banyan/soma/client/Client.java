package nz.shelto.banyan.soma.client;

import javax.persistence.Id;

import javax.persistence.Entity;


@Entity
public class Client {

    @Id
    private String handle;

    private String ipAddr;

    private String secret;

    private ConnectionType connectionType = ConnectionType.NOT_ACCEPTING;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }
}
