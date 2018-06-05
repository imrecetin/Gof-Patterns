package com.designpatterns.behavioral.visitor.example1;

public interface Visitor {
    
    public String visitDot(Dot dot);

    public String visitCircle(Circle circle);

    public String visitRectangle(Rectangle rectangle);

    public String visitCompoundGraphic(CompoundShape cg);
}
