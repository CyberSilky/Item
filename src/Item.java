importjavax.swing.*;

public abstract class Item {
    private String description;

    public Item(String description) {
        setDesription(description);
    }

    protected abstract void setDesription(String description);


    
    public String getDescription() {
        return description;
    }
        
        public abstract void setDescription();
}

public abstract class Widget extends Item{
    private String length;

    @Override
    protected void setDesription(String description) {

    }

}

}