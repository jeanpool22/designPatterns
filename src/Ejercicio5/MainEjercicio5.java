interface Component {
    String getDescription();
}

class HotelRoom implements Component {
    private int roomNumber;

    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String getDescription() {
        return "Habitación estándar #" + roomNumber;
    }
}

abstract class HotelRoomDecorator implements Component {
    protected Component component;

    public HotelRoomDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription();
    }
}

class FreshFlowers extends HotelRoomDecorator {
    public FreshFlowers(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con flores frescas";
    }
}

class GourmetChocolate extends HotelRoomDecorator {
    public GourmetChocolate(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con chocolate gourmet";
    }
}


class HighQualityWine extends HotelRoomDecorator {
    public HighQualityWine(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con vino de calidad";
    }
}

public class Main {
    public static void clientCode(Component component) {
        System.out.println("Resultado: " + component.getDescription());
    }

    public static void main(String[] args) {

        Component simpleRoom = new HotelRoom(101);
        System.out.println("Tengo una habitación simple:");
        clientCode(simpleRoom);
        System.out.println();


        Component decoratedRoom = new HighQualityWine(new GourmetChocolate(new FreshFlowers(simpleRoom)));
        System.out.println("Cliente: Ahora tengo una habitación decorada:");
        clientCode(decoratedRoom);
    }
}