package com.manchesterDigital;

public class Direction2 {

    public Integer stepsForwards;
    public Integer stepsBackwards;
    public Integer stepsLeft;
    public Integer stepsRight;
    public Double rotated;


    public Direction2(Double rotated) {
        this.rotated = rotated;
    }

    public void setStepsForwards(Integer stepsForwards) {
        this.stepsForwards = stepsForwards;
    }

    public void setStepsBackwards(Integer stepsBackwards) {
        this.stepsBackwards = stepsBackwards;
    }

    public void setStepsLeft(Integer stepsLeft) {
        this.stepsLeft = stepsLeft;
    }

    public void setStepsRight(Integer stepsRight) {
        this.stepsRight = stepsRight;
    }
}
