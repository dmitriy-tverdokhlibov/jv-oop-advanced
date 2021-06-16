package core.basesyntax;

public class FigureSupplier {
    public Figure[] getRandomFigure() {
        Figure[] figures = new Figure[5];

        figures[0] = new Square("square", Math.random() * 10,
                Math.random() * 10, ColorSupplier.getRandomColor());
        figures[1] = new Circle("circle", Math.random() * 10,
                Math.random() * 10, ColorSupplier.getRandomColor());
        figures[2] = new Rectangle("rectangle", Math.random() * 10,
                Math.random() * 10, ColorSupplier.getRandomColor());
        figures[3] = new RightTriangle("rectangle", Math.random() * 10,
                Math.random() * 10, Math.random() * 10, ColorSupplier.getRandomColor());
        figures[4] = new IsoscelesTrapezoid("isosceles trapezoid",
                Math.random() * 10, Math.random() * 10, ColorSupplier.getRandomColor());

        Figure[] figureArrayForReturn = new Figure[(int) (1 + Math.random() * 20)];

        for (int i = 0; i < figureArrayForReturn.length; i++) {
            figureArrayForReturn[i] = figures[(int) (Math.random() * 5)];
        }

        return figureArrayForReturn;
    }
}
