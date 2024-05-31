public abstract class Tanaman {

    private int masaHidup;
    private int lamaHidup;
    private int buah;
    private int berbuah;
    private double prosesBerbuah;
    private double perkembangan;

    public Tanaman(int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.lamaHidup = 0;
        this.buah = 0;
        this.berbuah = berbuah;
        this.prosesBerbuah = 0.0;
        this.perkembangan = perkembangan;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public abstract void berkembang();

    public String status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        } else {
            return "Hidup";
        }
    }

    @Override
    public String toString() {
        return "Masa Hidup: " + masaHidup + ", Lama Hidup: " + lamaHidup + ", Buah: " + buah + ", Status: " + status();
    }

    protected abstract void berkembang(int i);

}
