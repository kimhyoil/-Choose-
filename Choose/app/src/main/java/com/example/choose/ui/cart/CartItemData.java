package com.example.choose.ui.cart;

public class CartItemData {
    private String title;
    private String desc;
    private String price;
    private String image;
    private int itemId;
    private int count;
    private boolean isCheck;

    public CartItemData(String title, String desc, String price, String image, int itemId, int count, boolean isCheck) {
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.image = image;
        this.itemId = itemId;
        this.count = count;
        this.isCheck = isCheck;
    }

    public String getTitle() { return title; }
    public String getImage() { return image; }
    public String getPrice() { return price; }
    public String getDesc() { return desc; }
    public boolean isCheck() { return isCheck; }
    public int getCount() { return count; }


    public void setTitle(String title) { this.title = title; }
    public void setImage(String image) { this.image = image; }
    public void setPrice(String price) { this.price = price; }
    public void setCount(int count) { this.count = count; }
    public void setCheck(boolean check) { isCheck = check; }
    public void setDesc(String desc) { this.desc = desc; }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
