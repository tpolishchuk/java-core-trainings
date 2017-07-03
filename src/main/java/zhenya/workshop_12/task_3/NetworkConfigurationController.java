package zhenya.workshop_12.task_3;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NetworkConfigurationController {

    private List<NetworkInterfaceConfiguration> networkInterfacesConfiguration = new ArrayList();

    protected void showInterfacesWithIP() {
        collectNetworkInterfacesConfiguration();

        for (NetworkInterfaceConfiguration elem_ : networkInterfacesConfiguration) {
            System.out.println(elem_.getName() + " : " + elem_.getIpv4());
        }
    }

    private void collectNetworkInterfacesConfiguration() {
        try {
            for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                NetworkInterfaceConfiguration networkInterfaceConfiguration = new NetworkInterfaceConfiguration();

                if (ni.isLoopback() || !ni.isUp()) {
                    continue;
                }
                for (InetAddress address : Collections.list(ni.getInetAddresses())) {
                    if (address instanceof Inet4Address) {
                        networkInterfaceConfiguration.setName(ni.getName());
                        networkInterfaceConfiguration.setIpv4(address);

                        networkInterfacesConfiguration.add(networkInterfaceConfiguration);
                    }
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
