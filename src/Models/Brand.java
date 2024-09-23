package Models;

public class Brand {
      private String brandId;
      private String nameBrand;

    public Brand() {
    }

    public Brand(String brandId, String name) {
        this.brandId = brandId;
        this.nameBrand = name;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return nameBrand;
    }

    public void setName(String name) {
        this.nameBrand = name;
    }

    
    
}
