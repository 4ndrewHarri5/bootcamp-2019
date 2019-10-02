package com.manchesterDigital;

public class Navigator {

    public Integer stepsForwards;
    public Integer stepsBackwards;
    public Integer stepsLeft;
    public Integer stepsRight;
    public Double degreesFacing;

    public Navigator(Double degreesFacing) {
        this.degreesFacing = degreesFacing;
        this.stepsForwards = 0;
        this.stepsBackwards = 0;
        this.stepsLeft = 0;
        this.stepsRight = 0;
    }

    public void makeMove(Direction move) {
        switch (move) {
            case LEFT:
                stepsLeft += move.getSteps();
                break;
            case RIGHT:
                stepsRight += move.getSteps();
                break;
            case FORWARDS:
                stepsForwards += move.getSteps();
                break;
            case BACKWARDS:
                stepsBackwards += move.getSteps();
                break;
            case ROTATE:
                degreesFacing += move.getDegrees();
                break;
            default:
                break;
        }

        System.out.println(getMoveMessage(move));

    }

    public String getMoveMessage(Direction move){
        switch (move) {
            case ROTATE:
                return String.format("%s %s degrees", move.getMessage(), move.getDegrees());
            default:
                return String.format("%s %s steps", move.getMessage(), move.getSteps());
        }
    }

    public String getDirectionFacing() {

        if (degreesFacing > 360) {
            degreesFacing  = degreesFacing % 360;
        }

        if (degreesFacing <= 90) {
            return "Facing West by " + degreesFacing + " degrees";
        }else if (degreesFacing <= 180){
            return "Facing South by " + degreesFacing + " degrees";
        }else if (degreesFacing <= 270){
            return "Facing East by " + degreesFacing + " degrees";
        }else{
            return "Facing North by " + degreesFacing + " degrees";
        }

    }

    public String getStepsTaken() {

        return String.format("%d steps forwards, %d steps backwards, %d steps left, %d steps right", stepsForwards, stepsBackwards, stepsLeft, stepsRight);

    }

}
