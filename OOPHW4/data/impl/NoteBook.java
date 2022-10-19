package OOPHW4.data.impl;

import OOPHW4.data.Computer;
import OOPHW4.data.Memory;

public class NoteBook extends Computer {

    private Integer batteryCapacity;

    public NoteBook(String id, String model, Memory memory, String ssd, Integer batteryCapacity) {
        super(id, model, memory, ssd);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "id=" + getId() +
                "; модель=" + getModel() +
                "; оперативная память=" + getMemory() +
                "; объем диска=" + getSsd() +
                "; емкость батареи=" + batteryCapacity +
                '}';
    }
}
