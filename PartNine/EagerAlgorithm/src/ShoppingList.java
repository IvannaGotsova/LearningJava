import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
		
	    private String shoppingListTitle;
	    
	    private List<String> shoppingListItems; 
	    
	    public ShoppingList(String shoppingListTitle) {
	    	
	        this.shoppingListTitle = shoppingListTitle;
	        this.shoppingListItems = getItemsShoppingList(); 
	    }

	    private List<String> getItemsShoppingList() {
	    	
	        System.out.println("Reading shopping list items");
	        
	        List<String> shoppingListItems = new ArrayList<>();
	        
	        shoppingListItems.add("Notebook");
	        shoppingListItems.add("Pens");
	        shoppingListItems.add("Sketchpad");
	        shoppingListItems.add("Pencils");
	        shoppingListItems.add("Pen");
	        shoppingListItems.add("Pencil");
	        shoppingListItems.add("Book");
	        shoppingListItems.add("Paintings");
	        shoppingListItems.add("Gray pencil");
	        shoppingListItems.add("Black pen");
	        
	        return shoppingListItems;
	    }

	    public List<String> getShoppingListItems() {
	        
	    	if (shoppingListItems == null) {
	    		
	    		shoppingListItems = getItemsShoppingList();   
	        }
	        return shoppingListItems;
	    }
	}
