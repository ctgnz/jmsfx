package nz.co.ctg.jmsfx.model;

public interface FrameAmplifierGroup extends AmplifierGroup {

    String getBackgroundFill();
    
    @Override
    default boolean isGraphicalIcon() {
        return false;
    }

}
