public class Element {

    public int jamsibuk;
    public String name;

    public Element(String name) {
        /*
         * Consturctor superclass adalah bentuk dari DOWNCASTING,
         * karena merupakan referensi bagi subclassnya
         */
        this.name = name;
    }
}

class Dosen extends Element {
    /* extends digunakan untuk pewarisan */
    private int banyakharikerja;

    public Dosen(String name, int banyakharikerja) {
        super(name);
        jamSibuk = banyakharikerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void show() {
        System.out.println(name + " adalah dosen dengan jam sibuk sebanyak" + jamSibuk + "jam");
    }
}

class Mahasiswa extends Element {
    private int sks;

    public Mahasiswa(String name, int sks) {
        super(name);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void show() {
        System.out.println(name + " adalah mahasiswa dengan jam sibuk sebanyak " + jamSibuk + "jam");
    }
}

class Asisten extends Mahasiswa {
    private int jamasisten;

    public Asisten(String name, int sks, int jamasisten) {
        super(name, sks);
        jamSibuk = jamSibuk + jamasisten;

    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void show() {
        /*
         * method tunjukan() adalah bentuk UPCASTING,
         * karena mengubah referensi methodnya sendiri.
         */
        System.out.println(name + " adalah asisten dengan jam sibuk sebanyak" + jamSibuk + "jam");
    }
}
