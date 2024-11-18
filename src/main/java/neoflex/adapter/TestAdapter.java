package neoflex.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();

        USB memoryCardAdapter = new MemoryCardAdapter(memoryCard);

        Computer computer = new Computer();
        computer.readUSB(memoryCardAdapter);
    }
}
