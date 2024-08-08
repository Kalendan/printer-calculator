package printer;

import java.util.Objects;

public class FilePrinter implements Printer {

    private String file;

    public FilePrinter(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilePrinter that = (FilePrinter) o;
        return Objects.equals(file, that.file);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(file);
    }

    @Override
    public void print(double result) {
        try (FilePrinter filePrinter = new FilePrinter (new FilePrinter(file, true))) {
            filePrinter.print(result);
            filePrinter.newLine();}
         catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "FilePrinter{" +
                "file='" + file + '\'' +
                '}';
    }
}