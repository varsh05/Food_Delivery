package in.varsha.foodiesapi.service;

import in.varsha.foodiesapi.io.CartRequest;
import in.varsha.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
