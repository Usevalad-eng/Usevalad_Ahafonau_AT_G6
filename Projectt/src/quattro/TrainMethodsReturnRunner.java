package quattro;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        trainMethodsReturn.returnNewInt();

        TrainMethodsReturn trainMethodsReturnL = new TrainMethodsReturn();
        trainMethodsReturnL.returnNewLong(1000);

        TrainMethodsReturn trainMethodsReturnC = new TrainMethodsReturn();
        trainMethodsReturnC.returnNewChar();

        TrainMethodsReturn trainMethodsReturnB = new TrainMethodsReturn();
        trainMethodsReturnB.returnNewByte();

        TrainMethodsReturn trainMethodsReturnBo = new TrainMethodsReturn();
        trainMethodsReturnBo.returnNewBoolean();
    }
}