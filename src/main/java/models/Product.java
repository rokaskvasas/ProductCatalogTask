package models;

public class Product {
    private int id;
    private String name,parentId;


    //region getters
    public int getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }
    //endregion

    public Product(int id, String parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;

    }
    @Override
    public String toString(){
        return String.format("%s, %s, %s",this.id,this.parentId,this.name);
    }
}
