import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        Main mainClass = new Main();
        String name = mainClass.returnName("Cristian");
        String separatedName = mainClass.separateName(name);
        String joinedName = mainClass.joinString(separatedName);
        System.out.println(mainClass.reverseString(joinedName));
    }

    /**
     * DESCRIPCIÓN: Devuelve cualquier string que se le pase.
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

        finalName = String.valueOf(nameWithSpaces.toString().strip());
        return finalName;
    }

    /**
     * DESCRIPCIÓN: le quita los espacios a un string.
     * @param string string para quitarle los espacios.
     * @return un string con todos los espacios eliminados
     * **/
    public String joinString(String string){
        return string.strip().replaceAll(" ", "");
    }

    public String reverseString(String string){
        String reversedString = "";
        for (int i = string.length() -1; i >= 0; i--) {
            reversedString = reversedString + string.charAt(i);
        }
        return reversedString;
    }
}