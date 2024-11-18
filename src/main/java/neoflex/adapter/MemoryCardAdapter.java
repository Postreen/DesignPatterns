package neoflex.adapter;

public class MemoryCardAdapter implements USB {
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUSB() {
        System.out.println("Adapter converts Memory Card signal to USB");
        memoryCard.readInfo();
    }
}
