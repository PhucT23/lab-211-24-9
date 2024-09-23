package Models;

public class Category {
    private String categoryId;
    private String nameCate;

    public Category() {
    }
    
    public Category(String categoryId, String nameCate) {
        this.categoryId = categoryId;
        this.nameCate = nameCate;
    }
    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getNameCate() {
        return nameCate;
    }
    public void setNameCate(String nameCate) {
        this.nameCate = nameCate;
    }

    
}
