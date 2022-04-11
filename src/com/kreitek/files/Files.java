package com.kreitek.files;

import java.util.List;

public interface Files {
    String getExtension();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    /*
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
    void open();
    void close();
    void write(byte[] buffer);
    int getSize();
    List<FileSystemItem> listFiles();

     */

}
