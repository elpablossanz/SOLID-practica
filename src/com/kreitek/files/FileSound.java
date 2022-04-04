package com.kreitek.files;

import com.kreitek.files.error.InvalidFileFormatException;

import java.util.List;

public class FileSound extends FileSystemItemBase implements FileSystemItem{

    protected FileSound(FileSystemItem parent, String name) {
        super(parent, name);
    }

    public FileSystemItem convertMp3ToWav() {
        if (!"mp3".equalsIgnoreCase(getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }

        int indexOfLastDot = name.lastIndexOf(".");
        String nameWithoutExtension = name;
        if (indexOfLastDot > 0) {
            nameWithoutExtension = name.substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        FileSystemItem result = new File(parent, newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    public FileSystemItem convertWavToMp3() {
        if (!"wav".equalsIgnoreCase(getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = name.lastIndexOf(".");
        String nameWithoutExtension = name;
        if (indexOfLastDot > 0) {
            nameWithoutExtension = name.substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        FileSystemItem result = new File(parent, newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    @Override
    public void addFile(FileSystemItem file) {

    }

    @Override
    public void removeFile(FileSystemItem file) {

    }

    @Override
    public String getExtension() {
        return null;
    }

    @Override
    public List<FileSystemItem> listFiles() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void setPosition(int numberOfBytesFromBeginning) {

    }

    @Override
    public byte[] read(int numberOfBytesToRead) {
        return new byte[0];
    }

    @Override
    public void write(byte[] buffer) {

    }

    @Override
    public void close() {

    }
}
