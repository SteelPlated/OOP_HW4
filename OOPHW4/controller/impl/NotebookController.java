package OOPHW4.controller.impl;

import java.util.List;

import OOPHW4.controller.ComputerController;
import OOPHW4.data.impl.NoteBook;
import OOPHW4.service.impl.NoteBookService;

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
