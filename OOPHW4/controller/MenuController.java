package OOPHW4.controller;

import java.util.List;
import OOPHW4.service.impl.DesktopService;
import OOPHW4.service.impl.NoteBookService;
import OOPHW4.data.Computer;
import OOPHW4.data.impl.Desktop;
import OOPHW4.data.impl.NoteBook;

public class MenuController {
    private final NoteBookService noteBookService;
    private final DesktopService desktopService;
    private final ComputerController<Computer> computerController;


    public MenuController() {
        this.noteBookService = new NoteBookService();
        this.desktopService = new DesktopService();
        this.computerController = new ComputerController<>();
        
    }
    public void menu(){
        String answer = ("1. Выбираем ноутбук" +
                "\n2. Выбираем стационарный ПК\nНапишите 1 или 2");
        int result = computerController.inputNumber(answer);
        switch (result){
            case 1:
                menuNoteBook();
                break;
            case 2:
                menuDesktop();
                break;
        }
    }

    public void menuDesktop(){
        List<Desktop> desktops = desktopService.desktopList();
        String question = ("1. Отфильтровать по модели?\n2. Отфильтровать по мощности блока питания?\n3. Отфильтровать по RAW?" +
                "\n4. Отфильтровать по SSD?\nНапишите 1, 2, 3, или 4");
        int res = desktopService.inputNumber(question);
        switch (res) {
            case 1:
                desktopService.printDesktop(desktopService.inputModel(desktops));
                break;
            case 2:
                desktopService.printDesktop(desktopService.inputPowerSupply(desktops));
                break;
            case 3:
                desktopService.printDesktop(desktopService.inputRAW(desktops));
                break;
            case 4:
                desktopService.printDesktop(desktopService.inputSSD(desktops));
                break;
        }
    }

    public void menuNoteBook(){
        List<NoteBook> noteBooks = noteBookService.noteBookList();
        String question = ("1. Отфильтровать по модели?\n2. Отфильтровать по емкости батареи?\n3. Отфильтровать по RAW?" +
                "\n4. Отфильтровать по SSD?\nНапишите 1, 2, 3, или 4");
        int res = noteBookService.inputNumber(question);
        switch (res) {
            case 1:
                noteBookService.printNoteBook(noteBookService.inputModel(noteBooks));
                break;
            case 2:
                noteBookService.printNoteBook(noteBookService.inputBatteryCapacity(noteBooks));
                break;
            case 3:
                noteBookService.printNoteBook(noteBookService.inputRAW(noteBooks));
                break;
            case 4:
                noteBookService.printNoteBook(noteBookService.inputSSD(noteBooks));
                break;
        }
    }
}
