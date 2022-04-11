package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;
import static com.kreitek.service.FileManager.calculateSize;

public class Directory extends FileSystemItemBase implements FileSystemItem,Directories {

    private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";
    private final List<FileSystemItem> files;

    public Directory(FileSystemItem parent, String name) {
        super(parent, name);
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de ficheros
    }

    public String getExtension() {
        String extension = "";
        int indexOfLastDot = getName().lastIndexOf(".");
        if (indexOfLastDot > 0) {
            extension = getName().substring(indexOfLastDot + 1);
        }
        return extension;
    }
    @Override
    public List<FileSystemItem> listFiles() {
        return files;
    }

    @Override
    public void addFile(FileSystemItem file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }

    @Override
    public void removeFile(FileSystemItem file) {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void write(byte[] buffer) {

    }

    @Override
    public int getSize() {
        return calculateSize(files);
    }


}
