package in.varsha.foodiesapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.varsha.foodiesapi.io.FoodRequest;
import in.varsha.foodiesapi.io.FoodResponse;
import in.varsha.foodiesapi.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
@AllArgsConstructor
@CrossOrigin("*")
public class FoodController {

    private final FoodService foodService;

    @PostMapping
    //handler method that will accept the food details and multipartfile  
    //nce we accept it, we convert food string into object ie FoodRequest
    //pass FoodRequest to FoodService the food details and the multipartfile
    //this will generate public url and this URL is added to foodentity object
    //then show it to the mongodb collection
    //that entitity-> response ->controller
    // response object will have ID as well
    
    public FoodResponse addFood(@RequestPart("food") String foodString,
                                @RequestPart("file")MultipartFile file) {
        ObjectMapper objectMapper = new ObjectMapper();
        FoodRequest request = null;
        try {
            request = objectMapper.readValue(foodString, FoodRequest.class);
        }catch(JsonProcessingException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid JSON format");
        }
        FoodResponse response = foodService.addFood(request, file);
        return response;
    }

    @GetMapping
    public List<FoodResponse> readFoods() {
        return foodService.readFoods();
    }

    @GetMapping("/{id}")
    public FoodResponse readFood(@PathVariable String id) {
        return foodService.readFood(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFood(@PathVariable String id) {
        foodService.deleteFood(id);
    }
}
