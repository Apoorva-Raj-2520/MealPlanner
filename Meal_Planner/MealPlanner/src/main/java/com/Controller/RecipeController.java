import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("/suggest")
    public ResponseEntity<Recipe> suggestRecipe(@RequestBody List<String> availableIngredients) {
        Recipe suggestedRecipe = recipeService.getSuggestedRecipe(availableIngredients);
        if (suggestedRecipe != null) {
            return new ResponseEntity<>(suggestedRecipe, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Other CRUD endpoints for Recipe
}
