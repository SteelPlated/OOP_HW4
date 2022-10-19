package OOPHW4.service;

import java.util.List;

import OOPHW4.data.Computer;

public interface Printable<T extends Computer> {
    public void print (List<T> list);
}
