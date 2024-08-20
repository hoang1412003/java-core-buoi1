public class HinhChuNhat {
    public float dai;
    public float rong;
    public HinhChuNhat() {

    }

    public HinhChuNhat(float d, float r) {
        this.dai = d;
        this.rong = r;
    }

    public float chuVi () {
        return (this.dai + this.rong) * 2;
    }

    public float dienTich () {
        return this.dai * this.rong;
    }
}
