package bank.app;

public class Nip {

    private String nip;

    public Nip getNip() {
        return this;
    }

    public void setNip(String nip) throws InvalidNipException {

        int counterOfDigits = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nip.length(); i++) {
            if(Character.isDigit(nip.charAt(i))){
                sb.append(nip.charAt(i));
                counterOfDigits++;

            }
        }
        if(counterOfDigits != 10){
            throw  new InvalidNipException("Invalid NIP");
        }
        else{
            this.setNip(sb.toString());
        }
    }

    public void isValid(String nip){

    }
}
