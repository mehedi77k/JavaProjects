package LabTask6;
class VirusEffect{
    void symptoms(){
        System.out.println("Corona,Fever,headache");
    }

}
class AlphaVirus extends VirusEffect{

}
class BetaVirus extends AlphaVirus{
    public static void main(String[] args) {
        AlphaVirus obj = new AlphaVirus();
        System.out.println("Alpha Virus Symptoms: ");
        obj.symptoms();
        BetaVirus obj1 = new BetaVirus();
        System.out.println("\n\nBeta Virus Symptoms : ");
        obj1.symptoms();
    }
}

