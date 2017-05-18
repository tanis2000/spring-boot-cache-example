package it.altralogica.cache;

import java.io.Serializable;

/**
 * Created by tanis on 18/05/17.
 */
public class FileModel implements Serializable {
    private String filename;
    private int size;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FileModel(String filename, int size) {
        this.filename = filename;
        this.size = size;
    }
}
