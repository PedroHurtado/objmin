package com.example.paint;


public class AppPaintImpl implements AppPaint {
    private final CommandFactory commands;
    private final Canvas canvas;
    private final ColorFactory colors;
    private final ShapeFactory shapes;
    protected AppPaintImpl(CommandFactory commands, Canvas canvas, ColorFactory colors, ShapeFactory shapes) {
        this.commands = commands;
        this.canvas = canvas;
        this.colors = colors;
        this.shapes = shapes;
    }

    @Override
    public void run(AddRunDto dto){
        var color = colors.getColor(dto.getColor());
        var shapeDto = new ShapeDto(dto.getPointStart(), dto.getPintEnd(), color);
        var shape = shapes.getShape(dto.getShape(), shapeDto);
        commands.getCommand(dto.getCommand(), canvas, shape).execute();;
    }
    public static AppBuilder builder(){
        return new AppBuilderImpl();
    }

    private static class AppBuilderImpl implements AppBuilder{

        private  CommandFactory commands;
        private  Canvas canvas;
        private  ColorFactory colors;
        private  ShapeFactory shapes;

        @Override
        public AppPaint build() {
            return new AppPaintImpl(commands, canvas, colors, shapes);
        }

        @Override
        public AppBuilder setCanvas(Canvas canvas) {
            this.canvas = canvas;
            return this;
        }

        @Override
        public AppBuilder setColors(ColorFactory colors) {
            this.colors = colors;
            return this;
        }

        @Override
        public AppBuilder setCommnads(CommandFactory commands) {
            this.commands = commands;
            return this;
        }

        @Override
        public AppBuilder setShapes(ShapeFactory shapes) {            
            this.shapes = shapes;
            return this;
        }

    }
    
}
