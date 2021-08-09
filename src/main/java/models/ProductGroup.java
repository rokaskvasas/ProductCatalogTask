package models;

import java.util.ArrayList;

public class ProductGroup {
    private int id,parentId;
    private String name;
    private ArrayList<ProductGroup> children;


    //region getters
    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ProductGroup> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<ProductGroup> children) {
        this.children = children;
    }
    //endregion

    public ProductGroup(int id, int parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.children= new ArrayList<ProductGroup>();

    }
    @Override
    public String toString(){
        return String.format("%s, %s, %s",this.id,this.parentId,this.name);
    }
}
