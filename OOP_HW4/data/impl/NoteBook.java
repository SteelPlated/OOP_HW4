package OOP_HW4.data.impl;

import OOP_HW4.data.Memory;
import OOP_HW4.data.Computer;

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
                "; оперативка=" + getMemory() +
                "; объем диска=" + getSsd() +
                "; емкость батареи=" + batteryCapacity +
                '}';
    }
}
