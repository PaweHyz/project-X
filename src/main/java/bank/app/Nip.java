package bank.app;

public class Nip {

    private String nip;
    private final static int[] WEIGHTS = {6, 5, 7, 2, 3, 4, 5, 6, 7};

    public Nip(String nip) {
        this.nip = validate(nip);
    }

    public String getNip() {
        return this.nip;
    }

    public String validate(final String nip) {

        int counterOfDigits = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nip.length(); i++) {
            if (Character.isDigit(nip.charAt(i))) {
                sb.append(nip.charAt(i));
                counterOfDigits++;
            } else if (Character.isLetter(nip.charAt(i))) {
                if (Character.valueOf(nip.charAt(i)) != ' ' ||
                    Character.valueOf(nip.charAt(i)) != '-' ||
                    Character.valueOf(nip.charAt(i)) != '_' ){
                    throw new InvalidNipException("Invalid NIP");

                }
//                for (char a : nip.toCharArray()) {
//                    if (a != ' ' || a != '-' || a != '_') {
//                        throw new InvalidNipException("Invalid NIP");
//                    }
//                }
            }
        }


        if (counterOfDigits != 10) {
            throw new InvalidNipException("Invalid NIP");
        }
        Integer sum = 0;
        for (int i = 0; i < sb.length() - 1; i++) {
            sum += Integer.valueOf("" + sb.charAt(i)) * WEIGHTS[i];
        }
        Integer control = sum % 11;
        if (control != Integer.valueOf("" + sb.charAt(9))) {
            throw new InvalidNipException("Invalid NIP");
        }
        String nipToReturn = sb.toString().replaceAll("^(\\d{3})(\\d{3})(\\d{2})(\\d{2})$", "$1-$2-$3-$4");
        return nipToReturn;
    }
}
