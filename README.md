![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 2 Semana 5 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Cinthya Guzmán
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Duoc Online

---

## 📘 Descripción general del sistema

La empresa Speed Fast solicita la mejora de su sistema, donde múltiples repartidores realizan entregas en paralelo. La empresa ha detectado que, durante
el proceso de despacho, algunos repartidores acceden al mismo tiempo a la zona de carga
para retirar pedidos, lo que puede provocar errores y entregas duplicadas. Por lo que deberás diseñar y
modificar una estructura de clases en Java que utilice Thread, Runnable y mecanismos de
sincronización para coordinar la ejecución de múltiples tareas en paralelo.
Diseñarás un sistema orientado a objetos que represente diversos actores accediendo a
recursos compartidos, aplicando técnicas de control de concurrencia para evitar condiciones
de carrera y garantizar la integridad de los datos.


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
 │                  └── gestores/
 │                          ├── EstadoPedido.java
 |                          └── Main.java
 │                          └── Pedido.java
 │                          └── Repartidor.java
 │                          └── ZonaDeCarga.java
 |                 
 │                  
 |                      
 ├── target/
 ├── .gitignore
 └──  README.md

````
El proyecto está ordenado con una estructura sencilla que separa las tareas:

# org.cvguzman.gestores.

Este paquete contiene las clases encargadas de coordinar la lógica del negocio y la gestión de los pedidos con su respectiva entrega.

Clase Pedido()
Contiene la información básica del pedido, como su identificador, la dirección de entrega su estado actual. Utiliza un enum para manejar los distintosestados del pedido lo que mejora la seguridad y la legibilidad del código. cada pedido se inicializa en estado PENDIENTE y su estado se actualiza durante el proceso de reparto.

Enum EstadoPedido()
Define los posibles estadospor los que puede pasar un pedido: PENDIENTE, EN_REPARTO y ENTREGADO El uso de un enumevita errores de tipeo y asegura que el estado del pedido solo pueda tomar valores válidos previamente definidos.

Clase Repartidor()
Representa un repartidor que trabaja de forma concurrente. Implementa la interfaz Runneable para ejecutar su lógica en un hilo independiente. Cada repartidor retira pedidos desde la zona de carga, actualiza su estado durante el reparto, y simula la entrega mediante una pausa hasta que no quedan mas pedidos por procesar.

Clase ZonaDeCarga()
Actúa como un recurso compartido entre los repartidores. Se encarga de almacenar los pedidos pendientes utilizando una Blockingqueue garantizando el acceso seguro en un entorno concurrente. Permite agrega nuevos pedidos y retirarlos de forma controlada, evitando que un mismo pedidosea procesado más de una vez.

Clase Main()
Es el punto de entrada de la aplicación. Se encarga de inicializar la zona de carga crear los pedidos lanzar múltiples hilos de repartidores mediante un ExecutorService y esperar a que todos los pedids sean entregados antes de finalizar la ejecución del programa.




---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/cvguzman/speed-fast.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `gestores` para resultados en consola.

4. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** https://github.com/cvguzman/speed-fast
**Fecha de entrega:** 09/02/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones |  