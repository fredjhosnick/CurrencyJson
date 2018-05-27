import java.util.Objects;

public class Curency {
    private String ccy;
    private String base_ccy;
    private double buy;
    private double sale;

    public Curency() {
    }

    public Curency(String ccy, String base_ccy, double buy, double sale) {
        this.ccy = ccy;
        this.base_ccy = base_ccy;
        this.buy = buy;
        this.sale = sale;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getBase_ccy() {
        return base_ccy;
    }

    public void setBase_ccy(String base_ccy) {
        this.base_ccy = base_ccy;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curency curency = (Curency) o;
        return Double.compare(curency.buy, buy) == 0 &&
                Double.compare(curency.sale, sale) == 0 &&
                Objects.equals(ccy, curency.ccy) &&
                Objects.equals(base_ccy, curency.base_ccy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ccy, base_ccy, buy, sale);
    }

    @Override
    public String toString() {
        return "Curency{" +
                "ccy='" + ccy + '\'' +
                ", base_ccy='" + base_ccy + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }
}

