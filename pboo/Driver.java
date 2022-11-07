public class Driver {
    public static void main(String[] args) {
        Asisten fair = new Asisten("fairuzikun", 22, 7);
        Dosen raja = new Dosen("Raja OP Damanik", 5);
        Asisten angel = new Asisten("Angel-chan", 20, 4);
        Mahasiswa firman = new Mahasiswa("Firman", 20);
        Mahasiswa nid = new Mahasiswa("Nid to pass this sem", 23);
        Dosen nivo = new Dosen("Nivotko", 3);

        fair.show();
        raja.show();
        angel.show();
        firman.show();
        nid.show();
        nivo.show();

        int totaljamsibuk = fair.jamSibuk + raja.jamSibuk +
                angel.jamSibuk + firman.jamSibuk + nid.jamSibuk + nivo.jamSibuk;

        System.out.println("Total jam sibuk element dari fasilkom adalah " + totalJamSibuk + "jam");
    }
}
