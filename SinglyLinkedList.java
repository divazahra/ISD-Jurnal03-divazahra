public class SinglyLinkedList {
    Node head;
    Node tail;

    public void addNode(Buku buku, boolean tambahAwal) {
        Node newNode = new Node(buku);
        if (tambahAwal) {
            newNode.next = head;
            head = newNode;
        } else {
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        System.out.println("Data buku ditambahkan!");
    }
    
    public void deleteNode(boolean hapusAwal) {
        if (head == null) {
            System.out.println("List kosong, tidak ada data buku untuk dihapus.");
            return;
        }
        if (hapusAwal) {
            head = head.next;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        System.out.println("Data buku dihapus!");
    }
    
    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List kosong, tidak ada data buku.");
            return;
        }
        System.out.println("Daftar Data Buku:");
        while (temp != null) {
            System.out.println("Judul: " + temp.data.getJudul() + ", Penulis: " + temp.data.getPenulis() + ", Tahun Terbit: " + temp.data.getTahunTerbit());
            temp = temp.next;
        }
    }

    public void addNodeAtIndex(Buku buku, int indeks) {
        if (indeks < 0) {
            System.out.println("Indeks tidak valid. Indeks harus non-negatif.");
            return;
        }

        Node newNode = new Node(buku);
        if (indeks == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < indeks - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi panjang list. Data buku tidak ditambahkan.");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Data buku ditambahkan pada indeks " + indeks + "!");
    }

    public void deleteNodeByTitle(String judul) {
        if (head == null) {
            System.out.println("List kosong, tidak ada data buku untuk dihapus.");
            return;
        }

        if (head.data.getJudul().equals(judul)) {
            head = head.next;
            System.out.println("Data buku dengan judul '" + judul + "' dihapus!");
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.getJudul().equals(judul)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Data buku dengan judul '" + judul + "' tidak ditemukan.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Data buku dengan judul '" + judul + "' dihapus!");
        }
    }
}