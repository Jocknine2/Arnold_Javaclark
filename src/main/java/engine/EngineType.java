package engine;

public enum EngineType {

    IC_Engine("Internal Combustion", 600),
    E_Engine("Electric Motor", 650),
    H_Engine("Hybrid Engine", 245);

    private final String type;
    private final int bhp;


    EngineType(String type, int bhp) {
        this.type = type;
        this.bhp = bhp;
    }

    public String getType(){
        return type;
    }

    public int getBhp(){
        return bhp;
    }
}
