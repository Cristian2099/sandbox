public class Main {
    public static void main(String[] args) {
        Main mainClass = new Main();
        String nombre = mainClass.returnName("Cristian");
        System.out.println(mainClass.separateName(nombre));
    }

    /**
     * DESCRIPCIÓN: Devuelve un string que se le pase.
     * @param string es una cadena de texto cualquiera.
     * @return devuelve la cadena de texto.
     * */
    public String returnName(String string){
        return string;
    }

    /**
     * DESCRIPCIÓN: Esta función recibe un String y separa cada letra con espacios.
     *
     * @param string una cadena de texto a separar por espacios.
     * @return final name Devuelve el nombre separado por espacios.
     * */
    public String separateName(String string){

        StringBuilder nameWithSpaces = new StringBuilder();
        char[] separedName = string.toCharArray();
        String finalName = "";

        for (char letra : separedName){
            nameWithSpaces.append(letra).append(" ");
        }

        int finalChar = nameWithSpaces.length() - 1;
        finalName = String.valueOf(nameWithSpaces.deleteCharAt(finalChar));
        return finalName;
    }
}