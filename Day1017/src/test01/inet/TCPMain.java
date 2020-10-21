package test01.inet;

import test01.inet.TCPEchoServer;
public class TCPMain {
public static void main(String[] args) {
new TCPEchoServer().tcpServer(9007);
}
}