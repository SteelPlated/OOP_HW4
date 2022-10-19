package OOPHW4.data.impl;

import OOPHW4.data.Computer;
import OOPHW4.data.Memory;

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
                "; оперативная память=" + getMemory() +
                "; объем диска=" + getSsd() +
                "; мощность блока питания=" + powerSupply +
                '}';
    }
}
