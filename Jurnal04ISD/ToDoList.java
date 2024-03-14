import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoList {
    private LinkedList<Tugas> listTugas;

    public ToDoList() {
        this.listTugas = new LinkedList<>();
    }

    public void tambahTugas(Tugas tugas) {
        listTugas.addFirst(tugas);
    }

    public void hapusTugas(Tugas tugas) {
        listTugas.remove(tugas);
    }

    public void cetakDariAwal() {
        ListIterator<Tugas> iterator = listTugas.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void cetakDariBelakang() {
        ListIterator<Tugas> iterator = listTugas.listIterator(listTugas.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public LinkedList<Tugas> getListTugas() {
        return listTugas;
    }
}
