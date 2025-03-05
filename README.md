# 📄 Descripció - Enunciat de l'exercici

En aquest exercici, es crea una classe anomenada `Producte` amb els atributs següents:
- `nom`
- `preu`

A més, es crea una classe `Venda`, que té:
- Una col·lecció de productes.
- Un atribut `preuTotal` per a emmagatzemar el preu total de la venda.

La classe `Venda` conté el mètode `calcularTotal()`, que:
- Llança l’excepció personalitzada `VendaBuidaException` si la col·lecció de productes està buida, mostrant el missatge: "Per fer una venda primer has d’afegir productes".
- Si la col·lecció conté productes, recorre la llista i suma els preus de tots els productes per assignar el valor a `preuTotal`.

L’excepció `VendaBuidaException` ha de ser una classe filla de `Exception`. Al seu constructor, ha de rebre el missatge d’error i, quan es capturi l’excepció, s'ha de mostrar per pantalla utilitzant el mètode `getMessage()`.

A més, s'ha d'implementar codi per generar i capturar una excepció de tipus `IndexOutOfBoundsException`.

---

# 💻 Tecnologies Utilitzades

- Java
- Programació Orientada a Objectes (POO)
- Excepcions en Java
- Col·leccions en Java

---

# 📋 Requisits

Per a executar aquest projecte, es requereix:

- JDK 8 o superior
- Un entorn de desenvolupament com IntelliJ IDEA, Eclipse o VS Code amb extensió per a Java
- Coneixements bàsics de Java i POO

Per compilar i executar el programa des de terminal:

```sh
javac Producte.java Venda.java VendaBuidaException.java Main.java
java Main
```

