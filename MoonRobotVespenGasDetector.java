public class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid){
    return acidValue >= minAcid && acidValue <= maxAcid;
    }
    public boolean isDensityOk(int density) {
    return (density >= 1000 && density <= 5000) || (density >= 10000 && density <= 15000);
    }
    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }
    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return isAcidOk(acidValue, minAcid, maxAcid) && isDensityOk(density) && isTemperatureOk(cold);
    }
    public static void main(String[] args) {
        MoonRobotVespenGasDetector det = new MoonRobotVespenGasDetector();
        System.out.println("isAcidOk = " +det.isAcidOk(100,50,150));
        System.out.println("isDensityOk = " +det.isDensityOk(1500));
        System.out.println("isDensityOk = " +det.isDensityOk(30000));
        System.out.println("isTemperatureOk = " +det.isTemperatureOk(false));
        System.out.println("isGroundOkForVespenGas = " +det.isGroundOkForVespenGas(120, 75,150, 7500, false ));
    }
}
