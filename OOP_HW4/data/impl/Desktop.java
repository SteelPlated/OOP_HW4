package OOP_HW4.data.impl;

import OOP_HW4.data.Memory;
import OOP_HW4.data.Computer;

public class Desktop extends Computer {

    private Integer powerSupply;

    public Desktop(String id, String model, Memory memory, String ssd, Integer powerSupply) {
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public Integer getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Integer powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "id=" + getId() +
                "; модель=" + getModel() +
                "; оперативка=" + getMemory() +
                "; объем диска=" + getSsd() +
                "; мощность блока питания=" + powerSupply +
                '}';
    }
}
