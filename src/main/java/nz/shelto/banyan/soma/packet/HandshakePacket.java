package nz.shelto.banyan.soma.packet;


public class HandshakePacket extends Packet{

    private String handle;

    private String secret;

    public HandshakePacket(final String handle, final String secret) {
        this.handle = handle;
        this.secret = secret;
    }

    public String getHandle() {
        return handle;
    }

    public String getSecret() {
        return secret;
    }
}
