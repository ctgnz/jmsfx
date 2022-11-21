package ${basePackage};

public interface FrameAmplifierGroup extends AmplifierGroup {

    String getBackgroundFill();
    
    @Override
    default boolean isGraphicalIcon() {
        return false;
    }

}
