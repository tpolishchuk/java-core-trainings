package zhenya.workshop_12.task_3;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NetworkConfigurationController {

    List<NetworkInterfaceConfiguration> networkInterfacesConfiguration = new ArrayList();

    public void showInterfacesWithIP() {
        collectNetworkInterfacesConfiguration();

        System.out.println(networkInterfacesConfiguration);
    }

    public void collectNetworkInterfacesConfiguration() {
        try {

            NetworkInterfaceConfiguration networkInterfaceConfiguration
                    = new NetworkInterfaceConfiguration();

            for (NetworkInterface ni :
                    Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (ni.isLoopback() || !ni.isUp()) {
                    continue;
                }
                for (InetAddress address : Collections.list(ni.getInetAddresses())) {
                    if (address instanceof Inet4Address) {

                        networkInterfaceConfiguration.setName(ni.getName());
                        networkInterfaceConfiguration.setIpv4(address);

                        networkInterfacesConfiguration.add(networkInterfaceConfiguration);

                        System.out.println(networkInterfaceConfiguration.getName() + " : " +
                                           networkInterfaceConfiguration.getIpv4());
                    }
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
