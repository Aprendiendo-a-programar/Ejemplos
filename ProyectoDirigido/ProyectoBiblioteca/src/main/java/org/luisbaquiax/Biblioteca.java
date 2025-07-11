package org.luisbaquiax;

public class Biblioteca {
    private Libro[] libros;
    private int indice;//

    public Biblioteca() {
        this.libros = new Libro[100];
        this.libros[0] = new Libro("REF0001", "El susurro del viento", "Ana María Soler", 5, 2);
        this.libros[1] = new Libro("REF0002", "Sombras de cristal", "Javier Ruiz", 3, 1);
        this.libros[2] = new Libro("REF0003", "El último faro", "Clara Montes", 7, 3);
        this.libros[3] = new Libro("REF0004", "Caminos de ceniza", "Luis Fernández", 4, 0);
        this.libros[4] = new Libro("REF0005", "El eco del silencio", "Marina Gómez", 6, 2);
        this.libros[5] = new Libro("REF0006", "Hojas al viento", "Carlos Vega", 2, 1);
        this.libros[6] = new Libro("REF0007", "Luz de invierno", "Sofía Torres", 8, 4);
        this.libros[7] = new Libro("REF0008", "El peso del tiempo", "Diego Castro", 5, 1);
        this.libros[8] = new Libro("REF0009", "Ríos de tinta", "Elena Navarro", 3, 0);
        this.libros[9] = new Libro("REF0010", "El alba rota", "Miguel Ángel Pérez", 4, 2);
        this.libros[10] = new Libro("REF0011", "Sombras en la niebla", "Laura Sánchez", 7, 3);
        this.libros[11] = new Libro("REF0012", "El canto de la luna", "Raúl Morales", 5, 1);
        this.libros[12] = new Libro("REF0013", "Fuego en el horizonte", "Isabel Díaz", 6, 2);
        this.libros[13] = new Libro("REF0014", "El umbral de los sueños", "Antonio Ramírez", 4, 0);
        this.libros[14] = new Libro("REF0015", "Cenizas de un amanecer", "Marta López", 3, 1);
        this.libros[15] = new Libro("REF0016", "El reflejo del agua", "Víctor Mendoza", 8, 3);
        this.libros[16] = new Libro("REF0017", "Hilos de destino", "Carmen Ortiz", 5, 2);
        this.libros[17] = new Libro("REF0018", "El suspiro de la noche", "Pablo Romero", 6, 1);
        this.libros[18] = new Libro("REF0019", "Sombras del pasado", "Lucía Fernández", 4, 0);
        this.libros[19] = new Libro("REF0020", "El latido del bosque", "Andrés Gil", 7, 3);
        this.libros[20] = new Libro("REF0021", "Ecos de la eternidad", "Sonia Martínez", 3, 1);
        this.libros[21] = new Libro("REF0022", "El sendero olvidado", "Jorge Vargas", 5, 2);
        this.libros[22] = new Libro("REF0023", "Luz entre tinieblas", "María Rojas", 6, 1);
        this.libros[23] = new Libro("REF0024", "El murmullo de las estrellas", "Felipe Cruz", 8, 4);
        this.libros[24] = new Libro("REF0025", "Sombras y espejos", "Clara Esteban", 4, 0);
        this.libros[25] = new Libro("REF0026", "El peso del silencio", "David Moreno", 7, 2);
        this.libros[26] = new Libro("REF0027", "Caminos de fuego", "Teresa Aguilar", 5, 1);
        this.libros[27] = new Libro("REF0028", "El alba de los dioses", "Ricardo Silva", 9, 3);
        this.libros[28] = new Libro("REF0029", "Hojas de cristal", "Alicia Domínguez", 3, 0);
        this.libros[29] = new Libro("REF0030", "El eco de la montaña", "Óscar Núñez", 6, 2);
        this.libros[30] = new Libro("REF0031", "Sombras en el desierto", "Patricia Ramos", 4, 1);
        this.libros[31] = new Libro("REF0032", "El canto del océano", "Manuel García", 7, 3);
        this.libros[32] = new Libro("REF0033", "Ríos de luz", "Beatriz Luna", 5, 1);
        this.libros[33] = new Libro("REF0034", "El umbral del tiempo", "Eduardo Santos", 6, 2);
        this.libros[34] = new Libro("REF0035", "Cenizas del pasado", "Lorena Castillo", 4, 0);
        this.libros[35] = new Libro("REF0036", "El reflejo de la luna", "Gabriel Ortiz", 3, 1);
        this.libros[36] = new Libro("REF0037", "Hilos de sombra", "Verónica Peña", 8, 3);
        this.libros[37] = new Libro("REF0038", "El susurro de la noche", "Iván Torres", 5, 2);
        this.libros[38] = new Libro("REF0039", "Sombras del amanecer", "Cristina Vázquez", 6, 1);
        this.libros[39] = new Libro("REF0040", "El latido del tiempo", "Héctor Rubio", 4, 0);
        this.libros[40] = new Libro("REF0041", "Ecos de cristal", "Marina Delgado", 7, 3);
        this.libros[41] = new Libro("REF0042", "El sendero de la luz", "Alonso Méndez", 5, 1);
        this.libros[42] = new Libro("REF0043", "Luz en la penumbra", "Sara Gómez", 3, 0);
        this.libros[43] = new Libro("REF0044", "El murmullo del viento", "Daniel Herrera", 6, 2);
        this.libros[44] = new Libro("REF0045", "Sombras y cenizas", "Elena Castro", 4, 1);
        this.libros[45] = new Libro("REF0046", "El peso de los sueños", "Juan Morales", 8, 3);
        this.libros[46] = new Libro("REF0047", "Caminos de cristal", "Laura Vicente", 5, 1);
        this.libros[47] = new Libro("REF0048", "El alba del silencio", "Mario López", 6, 2);
        this.libros[48] = new Libro("REF0049", "Hojas en el viento", "Natalia Ruiz", 3, 0);
        this.libros[49] = new Libro("REF0050", "El eco de los dioses", "Ángel Martínez", 7, 3);
        this.libros[50] = new Libro("REF0051", "Sombras del horizonte", "Carmen Vega", 5, 1);
        this.libros[51] = new Libro("REF0052", "El canto de las sombras", "Luis Navarro", 6, 2);
        this.libros[52] = new Libro("REF0053", "Ríos de fuego", "Sofía Morales", 4, 0);
        this.libros[53] = new Libro("REF0054", "El umbral de la noche", "Diego Sánchez", 8, 3);
        this.libros[54] = new Libro("REF0055", "Cenizas y luz", "Marta Gómez", 5, 1);
        this.libros[55] = new Libro("REF0056", "El reflejo del tiempo", "Pablo Ortiz", 3, 0);
        this.libros[56] = new Libro("REF0057", "Hilos del destino", "Clara Romero", 6, 2);
        this.libros[57] = new Libro("REF0058", "El susurro del bosque", "Andrés Vargas", 4, 1);
        this.libros[58] = new Libro("REF0059", "Sombras en el cielo", "Lucía Fernández", 7, 3);
        this.libros[59] = new Libro("REF0060", "El latido de la noche", "Víctor Cruz", 5, 1);
        this.libros[60] = new Libro("REF0061", "Ecos del amanecer", "Isabel Torres", 6, 2);
        this.libros[61] = new Libro("REF0062", "El sendero de las sombras", "Raúl Díaz", 3, 0);
        this.libros[62] = new Libro("REF0063", "Luz de cristal", "Marina López", 8, 3);
        this.libros[63] = new Libro("REF0064", "El murmullo de la luna", "Carlos Esteban", 5, 1);
        this.libros[64] = new Libro("REF0065", "Sombras del tiempo", "Elena Navarro", 6, 2);
        this.libros[65] = new Libro("REF0066", "El eco de la noche", "Javier Ruiz", 4, 0);
        this.libros[66] = new Libro("REF0067", "Hilos de luz", "Sofía Torres", 7, 3);
        this.libros[67] = new Libro("REF0068", "El susurro del alba", "Diego Castro", 5, 1);
        this.libros[68] = new Libro("REF0069", "Caminos de sombra", "Clara Montes", 6, 2);
        this.libros[69] = new Libro("REF0070", "El reflejo del silencio", "Luis Fernández", 3, 0);
        this.libros[70] = new Libro("REF0071", "Sombras de cristal", "Marina Gómez", 8, 3);
        this.libros[71] = new Libro("REF0072", "El canto del viento", "Carlos Vega", 5, 1);
        this.libros[72] = new Libro("REF0073", "Ríos del amanecer", "Laura Sánchez", 6, 2);
        this.libros[73] = new Libro("REF0074", "El umbral de los dioses", "Raúl Morales", 4, 0);
        this.libros[74] = new Libro("REF0075", "Cenizas en el cielo", "Isabel Díaz", 7, 3);
        this.libros[75] = new Libro("REF0076", "El peso de la luz", "Antonio Ramírez", 5, 1);
        this.libros[76] = new Libro("REF0077", "Hojas de fuego", "Marta López", 6, 2);
        this.libros[77] = new Libro("REF0078", "El eco del horizonte", "Víctor Mendoza", 3, 0);
        this.libros[78] = new Libro("REF0079", "Sombras del destino", "Carmen Ortiz", 8, 3);
        this.libros[79] = new Libro("REF0080", "El latido del silencio", "Pablo Romero", 5, 1);
        this.libros[80] = new Libro("REF0081", "Ecos de la luna", "Lucía Fernández", 6, 2);
        this.libros[81] = new Libro("REF0082", "El sendero de cristal", "Andrés Gil", 4, 0);
        this.libros[82] = new Libro("REF0083", "Luz en el bosque", "Sonia Martínez", 7, 3);
        this.libros[83] = new Libro("REF0084", "El murmullo del tiempo", "Jorge Vargas", 5, 1);
        this.libros[84] = new Libro("REF0085", "Sombras y luz", "María Rojas", 6, 2);
        this.libros[85] = new Libro("REF0086", "El canto de la noche", "Felipe Cruz", 3, 0);
        this.libros[86] = new Libro("REF0087", "Ríos de cristal", "Clara Esteban", 8, 3);
        this.libros[87] = new Libro("REF0088", "El alba de los sueños", "David Moreno", 5, 1);
        this.libros[88] = new Libro("REF0089", "Hilos del amanecer", "Teresa Aguilar", 6, 2);
        this.libros[89] = new Libro("REF0090", "El susurro de las sombras", "Ricardo Silva", 4, 0);
        this.libros[90] = new Libro("REF0091", "Sombras del silencio", "Alicia Domínguez", 7, 3);
        this.libros[91] = new Libro("REF0092", "El eco de la luz", "Óscar Núñez", 5, 1);
        this.libros[92] = new Libro("REF0093", "Caminos de la luna", "Patricia Ramos", 6, 2);
        this.libros[93] = new Libro("REF0094", "El reflejo del viento", "Manuel García", 3, 0);
        this.libros[94] = new Libro("REF0095", "Sombras en el horizonte", "Beatriz Luna", 8, 3);
        this.libros[95] = new Libro("REF0096", "El canto del silencio", "Eduardo Santos", 5, 1);
        this.libros[96] = new Libro("REF0097", "Ríos de la noche", "Lorena Castillo", 6, 2);
        this.libros[97] = new Libro("REF0098", "El umbral de cristal", "Gabriel Ortiz", 4, 0);
        this.libros[98] = new Libro("REF0099", "Cenizas del tiempo", "Verónica Peña", 7, 3);
        this.libros[99] = new Libro("REF0100", "El peso del horizonte", "Iván Torres", 5, 1);
    }

    public void agregarLibro(Libro libro) {
        for (int i = 0; i < this.libros.length; i++) {
            if (libros[i] == null) {
                this.libros[i] = libro;
                break;//return;
            }
        }
    }

    public void eliminarLibroPorReferencia(String referencia) {
        for (int i = 0; i < this.libros.length; i++) {
            if (this.libros[i] != null) {
                if(this.libros[i].getReferencia().equals(referencia)){
                    this.libros[i] = null;
                    break;
                }
            }
        }
    }

    public Libro obternerLibroPorTitulo(String titulo) {
        for (int i = 0; i < this.libros.length; i++) {
            if (this.libros[i] != null) {
                if(this.libros[i].getTitulo().equals(titulo)){
                    return this.libros[i];
                }
            }
        }
        return null;
    }

    public void listarLibros() {
        for (int i = 0; i < this.libros.length; i++) {
            if (this.libros[i] != null) {
                System.out.println((i + 1) + " " + this.libros[i].toString());
            }
        }
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
