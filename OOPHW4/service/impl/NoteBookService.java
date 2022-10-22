package OOPHW4.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import OOPHW4.data.Memory;
import OOPHW4.data.impl.NoteBook;
import OOPHW4.service.ComputerService;
import OOPHW4.service.Printable;
import OOPHW4.service.impl.NoteBookService;

public class NoteBookService extends ComputerService<NoteBook> implements Printable<NoteBook> {
    
    public void printNoteBook(List<NoteBook> list){
        print(list);
    }

    public List<NoteBook> inputBatteryCapacity(List<NoteBook> list){
        String question = "Выберите емкость батареи 2500, 3700, 17800." +
                "\nНапишите значение из списка выше.";
        int batteryCapacity = inputNumber(question);
        return filterBatteryCapacity(batteryCapacity, list);
    }
    
    public String inputString(String str){
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        return input.nextLine();
    }
        
    public int inputNumber(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        int num;
        if (input.hasNextInt()) {
            num = input.nextInt();
        } else {
            System.out.println("Ошибка");
            input.next();
            num = inputNumber(str);
        }
        return num;
    }

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

    public List<NoteBook> inputRAW(List<NoteBook> noteBooks) {
        String question = "Выберите обьем оперативной памяти\nSIXTEEN или FOUR Гб." +
                "\nНапишите значение из списка выше.";
        Memory raw = Memory.valueOf(inputString(question));
        for (int i = 0; i < noteBooks.size(); i++) {
            if (!raw.equals(noteBooks.get(i).getMemory())){
                noteBooks.remove(i);
                i--;
            }
        }
        return noteBooks;
    }
    public List<NoteBook> inputModel(List<NoteBook> noteBooks) {
        String question = "Представлены модели Msi, Aser, Iru, Dell." +
        "\nНапишите название модели из списка выше.";
        String modelName = inputString(question);
        for (int i = 0; i < noteBooks.size(); i++) {
            if (!modelName.equals(noteBooks.get(i).getModel())){
                noteBooks.remove(i);
                i--;
            }
        }
        return noteBooks;
    }

    public List<NoteBook> inputSSD(List<NoteBook> noteBooks) {
        String question = "Какой объем SSD вы хотите?\n128, 512 или 1024 Гб." +
                "\nНапишите значение из списка выше.";
        String ssd = inputString(question);
        for (int i = 0; i < noteBooks.size(); i++) {
            if (!ssd.equals(noteBooks.get(i).getSsd())){
                noteBooks.remove(i);
                i--;
            }
        }
        return noteBooks;
    }
}
    

