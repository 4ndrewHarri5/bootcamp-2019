package com.manchesterDigital;

public enum Direction {

    FORWARDS("moved forwards by"),
    BACKWARDS("moved backwards by"),
    LEFT("moved left by"),
    RIGHT("moved right by"),
    ROTATE("rotated by");

    private Integer steps = 0;
    private Double degrees = 0d;
    private String message;

    Direction(String message) {
        this.message = message;
    }

    public Integer getSteps() {
        return steps;
    }

    public Double getDegrees() {
        return degrees;
    }

    public String getMessage() {
        return message;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public void setDegrees(Double degrees) {
        this.degrees = degrees;
    }
}
