package Models;

public class Position {

    private String id;
    private String name;
    private String shortName;
    private String tenantId="5fe0786230cc4d59295712cf";

    public void setId(String id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public void setTenantId(String tenantId){
        this.tenantId=tenantId;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getTenantId() { return tenantId;}

    public String getId() {
        return id;
    }





}
