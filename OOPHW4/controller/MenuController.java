package OOPHW4.controller;

import java.util.List;

import OOPHW4.controller.impl.DesktopController;
import OOPHW4.controller.impl.NotebookController;
import OOPHW4.data.Computer;
import OOPHW4.data.impl.Desktop;
import OOPHW4.data.impl.NoteBook;

public class MenuController {
    private final NotebookController notebookController;
    private final DesktopController desktopController;
    private final ComputerController<Computer> computerController;

    public MenuController() {
        this.notebookController = new NotebookController();
        this.desktopController = new DesktopController();
        this.computerController = new ComputerController<>();
    }



    public void menu(){
        String answer = ("1. Выбираем ноутбук" +
                "\n2. Выбираем стационарный ПК\nНапишите 1, или 2");
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
        List<Desktop> desktops = desktopController.desktopList();
        String question = ("1. Отфильтровать по модели?\n2. Отфильтровать по мощности блока питания?\n3. Отфильтровать по RAW?" +
                "\n4. Отфильтровать по SSD?\nНапишите 1, 2, 3, или 4");
        int res = desktopController.inputNumber(question);
        switch (res) {
            case 1:
                desktopController.printDesktop(desktopController.inputModel(desktops));
                break;
            case 2:
                desktopController.printDesktop(desktopController.inputPowerSupply(desktops));
                break;
            case 3:
                desktopController.printDesktop(desktopController.inputRAW(desktops));
                break;
            case 4:
                desktopController.printDesktop(desktopController.inputSSD(desktops));
                break;
        }
    }

    public void menuNoteBook(){
        List<NoteBook> noteBooks = notebookController.noteBookList();
        String question = ("1. Отфильтровать по модели?\n2. Отфильтровать по емкости батареи?\n3. Отфильтровать по RAW?" +
                "\n4. Отфильтровать по SSD?\nНапишите 1, 2, 3, или 4");
        int res = notebookController.inputNumber(question);
        switch (res) {
            case 1:
                notebookController.printNoteBook(notebookController.inputModel(noteBooks));
                break;
            case 2:
                notebookController.printNoteBook(notebookController.inputBatteryCapacity(noteBooks));
                break;
            case 3:
                notebookController.printNoteBook(notebookController.inputRAW(noteBooks));
                break;
            case 4:
                notebookController.printNoteBook(notebookController.inputSSD(noteBooks));
                break;
        }
    }

}
