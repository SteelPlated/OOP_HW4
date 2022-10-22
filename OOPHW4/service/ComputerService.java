package OOPHW4.service;

import java.util.List;
import OOPHW4.data.Computer;
import OOPHW4.data.Memory;

public class ComputerService<T extends Computer> {

    public List<T> filterModel(String id, List<T> list){
        for (int i = 0; i < list.size(); i++) {
            if (!id.equals(list.get(i).getModel())){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public List<T> filterMemory(Memory memory, List<T> list){
        for (int i = 0; i < list.size(); i++) {
            if (!memory.equals(list.get(i).getMemory())){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public List<T> filterSSD(String ssd, List<T> list){
        for (int i = 0; i < list.size(); i++) {
            if (!ssd.equals(list.get(i).getSsd())){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
