import java.io.*;
import java.util.List;

public class SerializeStudents {

    private String fileName;

    public SerializeStudents(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(List list) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(list);

        } catch (Exception e) {
            System.out.println("Unable to serialize");
        }
    }

    public List deserialize() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            return (List) ois.readObject();

        } catch (Exception e) {
            System.out.println("Unable to deserialize");
            return null;
        }
    }
}
