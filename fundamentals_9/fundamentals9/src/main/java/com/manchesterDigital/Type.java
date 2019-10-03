package com.manchesterDigital;

public enum Type {

    MEXICAN, INDIAN, ASIAN, ENGLISH;

    public static Type convertStringToType(String type) throws DishNotValidException{
        switch (type.toLowerCase()) {
            case "english":
                System.out.println(type);
                return Type.ENGLISH;
            case "indian":
                return Type.INDIAN;
            case "mexican":
                return Type.MEXICAN;
            case "pan asian":
                return Type.ASIAN;
            default:
                System.out.println(type);
                throw new DishNotValidException("Dish not valid");
        }
    }

}
