package in.varsha.foodiesapi.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodRequest {

    private String name;
    private String description;
    private double price;
    private String category;
}


//to store the food details
//for this we have food response class