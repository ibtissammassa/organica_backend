package com.organica.payload;


public class CartDetailDto {

    private int CartDetailsId;
    private ProductDto products;
    private int Quantity;
    private int Amount;

    public CartDetailDto(int cartDetailsId, ProductDto products, int quantity, int amount) {
        CartDetailsId = cartDetailsId;
        this.products = products;
        Quantity = quantity;
        Amount = amount;
    }

    public CartDetailDto(){}

    public int getCartDetailsId() {
        return CartDetailsId;
    }

    public void setCartDetailsId(int cartDetailsId) {
        CartDetailsId = cartDetailsId;
    }

    public ProductDto getProducts() {
        return products;
    }

    public void setProducts(ProductDto products) {
        this.products = products;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
