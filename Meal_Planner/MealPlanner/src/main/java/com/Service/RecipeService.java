import java.util.List;

public interface RecipeService {
    Recipe getSuggestedRecipe(List<String> availableIngredients);
    // Other business logic methods as needed
}
