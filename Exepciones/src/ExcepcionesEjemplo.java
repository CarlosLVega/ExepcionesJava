import java.util.Scanner;

public class ExcepcionesEjemplo {
    public static void main(String[] args) {
        // Declaración de la variable
        int variableNoDeclarada = 0;

        // Excepción 1: División por cero
        try {
            int resultado = dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }

        // Excepción 2: Índice fuera de rango
        try {
            int[] array = {1, 2, 3};
            int valor = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        }

        // Excepción 3: Conversión de tipo inválida
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: Conversión de tipo inválida");
        }

        // Excepción 4: Acceso a un objeto nulo
        try {
            String cadena = null;
            int longitud = cadena.length();
        } catch (NullPointerException e) {
            System.out.println("Error: Acceso a objeto nulo");
        }

        // Excepción 5: Argumento ilegal
        try {
            int valorNegativo = -1;
            if (valorNegativo < 0) {
                throw new IllegalArgumentException("Valor no puede ser negativo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Argumento ilegal");
        }

        // Excepción 6: Lectura de entrada inválida
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número: ");
            int numero = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Entrada inválida");
        }

        // Excepción 7: División por cero (otro ejemplo)
        try {
            double resultado = dividirDouble(10.0, 0.0);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Error: División por cero (double)");
        }

        // Excepción 8: Manipulación de un array nulo
        try {
            int[] arrayNulo = null;
            int longitud = arrayNulo.length;
        } catch (java.lang.NullPointerException e) {
            System.out.println("Error: Manipulación de array nulo");
        }

        // Excepción 9: Conversión de tipo inválida (otro ejemplo)
        try {
            String textoInvalido = "abc";
            char primerCaracter = textoInvalido.charAt(10);
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("Error: Índice de cadena inválido");
        }

        // Excepción 10: Intento de acceso a un recurso no existente
        try {
            String archivoInexistente = "archivo.txt";
            java.io.FileReader lectorArchivo = new java.io.FileReader(archivoInexistente);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        }

        // Excepción 11: Operación de lista vacía
        try {
            java.util.List<String> listaVacia = new java.util.ArrayList<>();
            String elemento = listaVacia.get(0);
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println("Error: Lista vacía");
        }

        // Excepción 12: Lectura de un archivo inválido
        try {
            java.io.BufferedReader lector = new java.io.BufferedReader(new java.io.FileReader("archivo_invalido.txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error: Lectura de archivo inválida");
        }

        // Excepción 13: Acceso a una URL inválida
        try {
            java.net.URL urlInvalida = new java.net.URL("htp://www.ejemplo.com");
        } catch (java.net.MalformedURLException e) {
            System.out.println("Error: URL inválida");
        }

        // Excepción 14: Operación con un recurso cerrado
        try {
            java.io.BufferedReader lectorCerrado = new java.io.BufferedReader(new java.io.FileReader("archivo.txt"));
            lectorCerrado.close();
            String linea = lectorCerrado.readLine();
        } catch (java.io.IOException e) {
            System.out.println("Error: Operación con recurso cerrado");
        }

        // Excepción 15: Uso de una clase no existente
        try {
            java.lang.Class.forName("ClaseInexistente");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("Error: Clase no encontrada");
        }

        // Excepción 16: Manipulación de una fecha inválida
        try {
            java.text.DateFormat formatoFecha = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fecha = formatoFecha.parse("32/01/2022");
        } catch (java.text.ParseException e) {
            System.out.println("Error: Fecha inválida");
        }

        // Excepción 17: Intento de modificación de una colección no modificable
        try {
            java.util.List<String> listaNoModificable = java.util.Collections.emptyList();
            listaNoModificable.add("Elemento");
        } catch (java.lang.UnsupportedOperationException e) {
            System.out.println("Error: Modificación de colección no modificable");
        }

        // Excepción 18: Intento de eliminar un archivo protegido
        try {
            java.io.File archivoProtegido = new java.io.File("/archivo_protegido.txt");
            archivoProtegido.delete();
        } catch (java.lang.SecurityException e) {
            System.out.println("Error: Eliminación de archivo protegido");
        }

        // Excepción 19: Operación con un número demasiado grande
        try {
            long factorial = calcularFactorial(30);
            System.out.println("Factorial: " + factorial);
        } catch (java.lang.StackOverflowError e) {
            System.out.println("Error: Desbordamiento de pila");
        }

        // Excepción 20: Manipulación de un recurso no existente en la base de datos
        try {
            java.sql.Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/base_datos", "usuario", "contraseña");
            java.sql.Statement consulta = conexion.createStatement();
            consulta.executeUpdate("DELETE FROM tabla WHERE id = 1000");
        } catch (java.sql.SQLException e) {
            System.out.println("Error: Manipulación de recurso no existente en la base de datos");
        }
        
          // Excepción 21: Uso de un identificador no declarado
          try {
            int resultado = variableNoDeclarada * 5;
        } catch (java.lang.Error e) {
            System.out.println("Error: Uso de un identificador no declarado");
        }

        // Excepción 22: Operación matemática inválida
        try {
            double resultado = Math.sqrt(-1);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Error: Operación matemática inválida");
        }

        // Excepción 23: Manipulación de un archivo protegido contra escritura
        try {
            java.io.File archivoProtegido = new java.io.File("/archivo_protegido.txt");
            archivoProtegido.createNewFile();
        } catch (java.io.IOException e) {
            System.out.println("Error: Manipulación de archivo protegido contra escritura");
        }

        // Excepción 24: Acceso a un recurso inexistente en la red
        try {
            java.net.Socket socket = new java.net.Socket("localhost", 8080);
        } catch (java.io.IOException e) {
            System.out.println("Error: Acceso a recurso inexistente en la red");
        }

        // Excepción 25: Acceso a un recurso protegido sin permisos
        try {
            java.io.File archivoProtegido = new java.io.File("/etc/passwd");
            java.io.FileInputStream fis = new java.io.FileInputStream(archivoProtegido);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Acceso a recurso protegido sin permisos");
        }

        // Excepción 26: Manipulación de una lista no sincronizada de forma concurrente
        try {
            java.util.List<String> lista = new java.util.ArrayList<>();
            java.util.Collections.synchronizedList(lista).add("Elemento");
        } catch (java.lang.UnsupportedOperationException e) {
            System.out.println("Error: Manipulación de lista no sincronizada de forma concurrente");
        }

        // Excepción 27: Manipulación de un recurso no soportado
        try {
            java.nio.channels.FileChannel canal = java.nio.channels.FileChannel.open(java.nio.file.Paths.get("archivo.txt"));
        } catch (java.io.IOException e) {
            System.out.println("Error: Manipulación de recurso no soportado");
        }

        // Excepción 28: División por un número demasiado pequeño
        try {
            double resultado = 10 / 0.0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Error: División por un número demasiado pequeño");
        }

        // Excepción 29: Manipulación de un recurso bloqueado
        try {
            java.io.File archivoBloqueado = new java.io.File("archivo.txt");
            java.nio.channels.FileChannel canal = new java.io.RandomAccessFile(archivoBloqueado, "rw").getChannel();
            java.nio.channels.FileLock lock = canal.lock();
        } catch (java.io.IOException e) {
            System.out.println("Error: Manipulación de recurso bloqueado");
        }

        // Excepción 30: Uso de una API no disponible
        try {
            javax.print.PrintService[] servicios = javax.print.PrintServiceLookup.lookupPrintServices(null, null);
        } catch (java.lang.NoClassDefFoundError e) {
            System.out.println("Error: Uso de una API no disponible");
        }
     }
    

    // Método para dividir dos números y lanzar una excepción si el divisor es cero
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero");
        }
        return dividendo / divisor;
    }

    // Método para dividir dos números (double) y lanzar una excepción si el divisor es cero
    public static double dividirDouble(double dividendo, double divisor) {
        if (divisor == 0.0) {
            throw new ArithmeticException("División por cero (double)");
        }
        return dividendo / divisor;
    }

    // Método para calcular el factorial de un número de forma recursiva
    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
}

