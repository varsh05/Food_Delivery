package in.varsha.foodiesapi.service;

import in.varsha.foodiesapi.io.FoodRequest;
import in.varsha.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFile(String filename);

    void deleteFood(String id);
}


//service to upload file to the s3 bucket
//service/FoodServiceIMP is the impllementation class for this
