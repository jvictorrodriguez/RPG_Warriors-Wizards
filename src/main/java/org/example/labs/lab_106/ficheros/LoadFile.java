package org.example.labs.lab_106.ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LoadFile {
    FileReader fileReader;

    {
        try {
            fileReader = new FileReader("employees.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
