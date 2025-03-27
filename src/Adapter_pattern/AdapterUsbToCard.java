package Adapter_pattern;

public class AdapterUsbToCard implements IUsb{
    private  MemoryCard memoryCard;
    public AdapterUsbToCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }


    @Override
    public void connect() {
        memoryCard.insert();
    }
}
