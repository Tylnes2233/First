public class NameEncoderDecoder {

    public String encode(String name) {
        // Якщо ім’я містить хоча б одну цифру — не шифруємо
        if (name.matches(".*\\d.*")) {
            return name;
        }

        // Заміна голосних на цифри
        String encoded = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");

        return "NOTFORYOU" + encoded + "YESNOTFORYOU";
    }

    public String decode(String name) {
        // Префікс = "NOTFORYOU" (9 символів)
        // Суфікс = "YESNOTFORYOU" (12 символів)
        String core = name.substring(9, name.length() - 12);

        StringBuilder decoded = new StringBuilder();

        for (char c : core.toCharArray()) {
            switch (c) {
                case '1': decoded.append('e'); break;
                case '2': decoded.append('u'); break;
                case '3': decoded.append('i'); break;
                case '4': decoded.append('o'); break;
                case '5': decoded.append('a'); break;
                default:  decoded.append(c);
            }
        }

        return decoded.toString();
    }


    public static void main(String[] args) {
    }
}
