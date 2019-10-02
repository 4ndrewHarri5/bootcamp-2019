package com.manchesterDigital;

import java.util.Arrays;
import java.util.List;

public class CurrysShowroom {
    public static void main(String[] args) {

        Mobile mobile = new Mobile("IPhone",6756795345795L);
        Television tv = new Television("Samsung", 673532538918678L);

        List<PowerControls> powerControls = Arrays.asList(mobile, tv);
        for(PowerControls controls : powerControls){
            controls.switchOn();
            controls.switchOff();
        }

        List<VolumeControls> volumeControls= Arrays.asList(mobile, tv);
        for(VolumeControls controls : volumeControls){
            controls.volumeUp();
            controls.volumeDown();
        }

        List<StandbyControls> standbyControls = Arrays.asList(mobile, tv);
        for(StandbyControls controls : standbyControls){
            controls.standbyMode();
        }

        tv.changeChannel();
    }
}
