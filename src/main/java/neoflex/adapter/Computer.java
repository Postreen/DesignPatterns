package neoflex.adapter;

public class Computer {
    public void readUSB(USB usbDevice) {
        System.out.println("Computer is reading information via USB");
        usbDevice.connectWithUSB();
    }
}
