package ipV4AdressUtil;

public class IpV4Address {
	
	public static void main(String[] args) {
		String ip1="192.168.1.2";
		String ip2="192.168.5.2";
		String ip3="191.168.5.2";
		
		System.out.println(ipToLong(ip1));
		System.out.println(ipToLong(ip2));
		System.out.println(ipToLong(ip3));
	}

	static long ipToLong(String ipAddress) {

		String[] ipAddressInArray = ipAddress.split("\\.");

		long result = 0;
		for (int i = 0; i < ipAddressInArray.length; i++) {

			int power = 3 - i;
			int ip = Integer.parseInt(ipAddressInArray[i]);
			result += ip * Math.pow(256, power);

		}

		return result;
	}

}
