import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        boolean running = true;
        while (running) {
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Mata Kuliah: ");
                    String mataKuliah = scanner.nextLine();
                    System.out.print("Nama Tugas: ");
                    String namaTugas = scanner.nextLine();
                    System.out.print("Deadline: ");
                    String deadline = scanner.nextLine();
                    Tugas tugas = new Tugas(mataKuliah, namaTugas, deadline);
                    toDoList.tambahTugas(tugas);
                    break;
                case 2:
                    if (!toDoList.getListTugas().isEmpty()) {
                        System.out.println("Pilih cara menghapus:");
                        System.out.println("1. Hapus Tugas Terakhir");
                        System.out.println("2. Hapus Tugas Pertama");
                        System.out.println("3. Hapus berdasarkan Mata Kuliah");
                        System.out.println("4. Hapus berdasarkan Nama Tugas");
                        System.out.print("Pilih: ");
                        int deleteChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (deleteChoice) {
                            case 1:
                                toDoList.hapusTugas(toDoList.getListTugas().getLast());
                                break;
                            case 2:
                                toDoList.hapusTugas(toDoList.getListTugas().getFirst());
                                break;
                            case 3:
                                System.out.print("Masukkan Mata Kuliah: ");
                                String mk = scanner.nextLine();
                                for (Tugas t : toDoList.getListTugas()) {
                                    if (t.getMataKuliah().equals(mk)) {
                                        toDoList.hapusTugas(t);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.print("Masukkan Nama Tugas: ");
                                String nt = scanner.nextLine();
                                for (Tugas t : toDoList.getListTugas()) {
                                    if (t.getNamaTugas().equals(nt)) {
                                        toDoList.hapusTugas(t);
                                        break;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }
                    } else {
                        System.out.println("Belum Ada Tugas Untuk Dicetak.");
                    }
                    break;
                case 3:
                    if (!toDoList.getListTugas().isEmpty()) {
                        System.out.println("Pilih cara mencetak:");
                        System.out.println("1. Cetak Dari Awal");
                        System.out.println("2. Cetak Dari Belakang");
                        System.out.print("Pilih: ");
                        int printChoice = scanner.nextInt();
                        scanner.nextLine(); 

                        switch (printChoice) {
                            case 1:
                                toDoList.cetakDariAwal();
                                break;
                            case 2:
                                toDoList.cetakDariBelakang();
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }
                    } else {
                        System.out.println("Belum Ada Tugas Untuk Dicetak.");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
