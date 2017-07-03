package zhenya.workshop_12.task_3;

import java.net.InetAddress;

public class NetworkInterfaceConfiguration {

    private String name;
    private String ipv4;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getIpv4() {
        return ipv4;
    }

    protected void setIpv4(InetAddress address) {
        this.ipv4 = address.toString();
    }
}
