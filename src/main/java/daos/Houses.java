package daos;

public class Houses {

    private int number;
    private String type;
    private String color;
    private boolean pool;
    private boolean yard;
    private int tenants;

    public Houses(){

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setYard(boolean yard) {
        this.yard = yard;
    }

    public void setTenants(int tenants) {
        this.tenants = tenants;
    }

    @Override
    public String toString() {
        return "Houses{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", pool=" + pool +
                ", yard=" + yard +
                ", tenants=" + tenants +
                '}';
    }
}
