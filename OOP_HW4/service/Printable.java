package OOP_HW4.service;

import OOP_HW4.data.Computer;

import java.util.List;

public interface Printable<T extends Computer> {
    public void print (List<T> list);
}
