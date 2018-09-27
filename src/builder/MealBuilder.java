package builder;

public class MealBuilder {
	 public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBuger());
	      return meal;
	   }   
}
