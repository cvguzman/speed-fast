![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 1 Semana 3 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Cinthya Guzmán
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Duoc Online

---

## 📘 Descripción general del sistema
 
Se pide el desarrollo integral del sistema de entregas para SpeedFast,
incorporando de forma conjunta los principios de polimorfismo, abstracción e interfaces. A
partir de una clase base Pedido() que permita
gestionar pedidos de tipo comida, encomiendas y compras express, cada uno con reglas de
negocio particulares para su asignación y entrega. Además se implementa interfaces como
Despachable, Cancelable y Rastreable, con el fin de desacoplar la lógica de las
operaciones funcionales y favorecer la mantenibilidad del sistema.


---

## 🧱 Estructura general del proyecto

```plaintext

SpeedFast/
 ├── .idea/
 ├── .mvn/
 ├── src/
 │    └── main/
 │        └──  java/
 │               └── org.cvguzman/
 │                  ├── gestores/
 │                  │     ├── Main.java
 |                  |     └── Pedido.java
 │                  ├── interfaces/
 │                  │     └── Cancelable.java
 │                  │     └── Despachable.java
 |                  |     └── Rastreable.java
 │                  └── subclases/
 │                        └── PedidoComida.java  
 │                        └── PedidoEncomienda.java
 │                        └── PedidoExpress.java/
 |                      
 ├── target/
 ├── .gitignore
 └──  README.md

````
El proyecto está ordenado con una estructura sencilla que separa las tareas:

# org.cvguzman.gestores.



# org.cvguzman.interfaces.



# org.cvguzman.subclases.





---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone 
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `gestores` para resultados en consola.

4. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** https://github.com/cvguzman/salmonttapp-with-csv-loader
**Fecha de entrega:** 26/01/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones |  