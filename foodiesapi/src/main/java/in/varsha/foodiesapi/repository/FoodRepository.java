package in.varsha.foodiesapi.repository;

import in.varsha.foodiesapi.entity.FoodEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends MongoRepository<FoodEntity, String> {
}

//this is a repository
//call this method in the food service