package OOP_HW4.service.impl;

import OOP_HW4.service.ComputerService;
import OOP_HW4.data.Memory;
import OOP_HW4.data.impl.NoteBook;
import OOP_HW4.service.Printable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NoteBookService extends ComputerService<NoteBook> implements Printable<NoteBook> {
    @Override
    public void print(List<NoteBook> list) {
        Logger logger = Logger.getAnonymousLogger();
        for (NoteBook i: list) {
            logger.info(i.toString());
        }
    }

    public List<NoteBook> filterBatteryCapacity(int batteryCapacity, List<NoteBook> list){
        for (int i = 0; i < list.size(); i++) {
            if (batteryCapacity != list.get(i).getBatteryCapacity()){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public List<NoteBook> noteBookList(){
        List<NoteBook> noteBooks = new ArrayList<>();
        noteBooks.add(new NoteBook("456", "Dell", Memory.SIXTEEN, "512", 2500));
        noteBooks.add(new NoteBook("263", "Msi", Memory.FOUR, "512", 3700));
        noteBooks.add(new NoteBook("322", "Dell", Memory.SIXTEEN, "1024", 17800));
        noteBooks.add(new NoteBook("98", "Iru", Memory.FOUR, "128", 2500));
        noteBooks.add(new NoteBook("695", "Aser", Memory.FOUR, "1024", 3700));
        return noteBooks;
    }


}
