package OOP_HW4.controller.impl;

import OOP_HW4.controller.ComputerController;
import OOP_HW4.data.impl.NoteBook;
import OOP_HW4.service.impl.NoteBookService;

import java.util.List;

public class NotebookController extends ComputerController<NoteBook> {

    private final NoteBookService noteBookService;

    public NotebookController() {
        this.noteBookService = new NoteBookService();
    }

    public List<NoteBook> noteBookList(){
       return noteBookService.noteBookList();
    }

    public void printNoteBook(List<NoteBook> noteBooks){
        noteBookService.print(noteBooks);
    }

    public List<NoteBook> inputBatteryCapacity(List<NoteBook> list){
        String question = "Выберите емкость батареи 2500, 3700, 17800." +
                "\nНапишите значение из списка выше.";
        int batteryCapacity = inputNumber(question);
        return noteBookService.filterBatteryCapacity(batteryCapacity, list);
    }

}
