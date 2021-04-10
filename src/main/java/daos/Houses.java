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
    public Houses (int number, String type, String color, boolean pool, boolean yard, int tenants){
        this.number = number;
        this.type = type;
        this.color = color;
        this.pool = pool;
        this.yard = yard;
        this.tenants = tenants;
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

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public boolean getPool() {
        return pool;
    }

    public boolean getYard() {
        return yard;
    }

    public int getTenants() {
        return tenants;
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
