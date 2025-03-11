package com.example.lab6.dto;

import com.example.lab6.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItemDTO {
    private Product product;
    private int quantity;

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
