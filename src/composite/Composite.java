package composite;

import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component>
        children = new ArrayList<>();

    @Override
    public void execute() {
        // TODO Auto-generated method stub
    }
    public void add(Component component){
        children.add(component);
    }
    public void remove(Component component){
        children.remove(component);
    }
    public ArrayList<Component> getChildren(){
        return this.children;
    }
}
