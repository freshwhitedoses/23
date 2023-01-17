public class Main {
    public static void main(String[] args) {
        FigureFabric figureFabric = getFabric("Rectangle");
        Figure figure = figureFabric.createFigure();
        figure.say();
        }


        public static FigureFabric getFabric(String name){
        if(name=="Rectangle"){
            return new RectangleFabric();
        }
        if(name=="Round"){
            return new RoundFabric();
        }
        throw new RuntimeException("Нет такой фигуры как "+ name);
        }
}

interface Figure{
    void say();
}

class Rectangle implements Figure{

    @Override
    public void say() {
        System.out.println("I'm rectangle");
    }
}

class Round implements Figure{

    @Override
    public void say() {
        System.out.println("I'm round");
    }
}

interface FigureFabric{
    Figure createFigure();
}

class RectangleFabric implements FigureFabric{

    @Override
    public Figure createFigure() {
        return new Rectangle();
    }
}

class RoundFabric implements FigureFabric{

    @Override
    public Figure createFigure() {
        return new Round();
    }
}