public class Tugas implements Comparable<Tugas> {
    private String mataKuliah;
    private String namaTugas;
    private String deadline;

    public Tugas(String mataKuliah, String namaTugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public int compareTo(Tugas other) {
        // Sorting berdasarkan deadline
        return this.deadline.compareTo(other.deadline);
    }

    @Override
    public String toString() {
        return "Mata Kuliah: " + mataKuliah + ", Tugas: " + namaTugas + ", Deadline: " + deadline;
    }
}
