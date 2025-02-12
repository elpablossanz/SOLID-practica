package com.kreitek.files;

import java.util.List;

public interface FileSystemItem {

    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
    void open();
    void close();
    void write(byte[] buffer);
    int getSize();
    List<FileSystemItem> listFiles();
}
