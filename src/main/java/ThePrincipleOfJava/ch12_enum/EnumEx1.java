package ThePrincipleOfJava.ch12_enum;

enum Direction1 { EAST,SOUTH,WEST,NORTH}

public class EnumEx1 {
    public static void main(String[] args) {
        Direction1 d1 = Direction1.EAST;
        Direction1 d2 = Direction1.valueOf("WEST");
        Direction1 d3 = Enum.valueOf(Direction1.class, "EAST");
        
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);
        
        System.out.println("d1==d2?" + (d1==d2));
        System.out.println("d1==d3?" + (d1==d3));
        System.out.println("d1.equals(d3)?" + d1.equals(d3));
        
        System.out.println("d1.compareTo(d3)" + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2)" + (d1.compareTo(d2)));
        
        switch(d1) {
            case EAST:
                    System.out.println("The drection is EAST");
            case WEST:
                    System.out.println("The direction is WEST");
            case SOUTH:
                    System.out.println("The direction is SOUTH");
            case NORTH:
                    System.out.println("The direction is North");
            default:
                    System.out.println("Invalid direction.");
        }
        
        Direction1[] dArr = Direction1.values();
        
        for(Direction1 d : dArr)
            System.out.printf("%s=%d\n",d.name(),d.ordinal());
    }
}
