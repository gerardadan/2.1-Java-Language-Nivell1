# 📄 Descripció - Enunciat de l'exercici

## Nivell 2 - Exercici 1: Classe Entrada per a la gestió d'errors en la introducció de dades

En aquest exercici, es crea una classe anomenada **Entrada**, que serveix per controlar les excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat amb la classe **Scanner**.

El primer pas és instanciar un objecte de la classe **Scanner** i, a partir d’aquí, crear mètodes estàtics per llegir diferents tipus de dades des del teclat.

### ⚠️ Important
Si en algun mètode salta una excepció, s'ha de tractar i tornar a demanar la dada a l’usuari fins que sigui introduïda correctament. Per exemple, si s’introdueix un **float** amb un punt en lloc d'una coma, ha de mostrar **Error de format** i seguir demanant la dada fins que l’entrada sigui correcta.

Tots els mètodes reben un **String** amb el missatge que es vol mostrar a l’usuari, per exemple: *Introdueix la teva edat*, i retornen la dada introduïda pel mateix usuari.

### 📌 Mètodes a implementar

Capturant **InputMismatchException**:
```java
public static byte llegirByte(String missatge);
public static int llegirInt(String missatge);
public static float llegirFloat(String missatge);
public static double llegirDouble(String missatge);
```

Capturant una excepció personalitzada de la classe **Exception**:
```java
public static char llegirChar(String missatge);
public static String llegirString(String missatge);
public static boolean llegirSiNo(String missatge); // Retorna true si l'usuari introdueix 's', false si introdueix 'n'
```

---

# 💻 Tecnologies Utilitzades

- **Java**
- **Programació Orientada a Objectes (POO)**
- **Excepcions en Java**

---

# 📋 Requisits

Per a executar aquest projecte, es requereix:

- **JDK 8 o superior**
- Un entorn de desenvolupament com **IntelliJ IDEA, Eclipse o VS Code** amb extensió per a Java
- Coneixements bàsics de **Java** i **POO**

