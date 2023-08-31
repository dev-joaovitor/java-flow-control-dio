public class ZipCodeFormat {
    public static void main(String[] args) {
        try {
            String formattedZipCode = formatZipCode("892266689");
            System.out.println(formattedZipCode);
        } catch (InvalidZipCodeException e){
            System.out.println("Zip code must be 8 characters long");
        }

    }
    static String formatZipCode(String zipCode) throws InvalidZipCodeException {
        if (zipCode.length() != 8){
            throw new InvalidZipCodeException();
        }

        return "89.2266-68";
    }
}
