# UF4 Actividad 2. Tarea individual. Crear una calculadora en Java.
Se realiza la actividad teniendo como base el patrón de arquitectura MVC.

Las clases realizadas se encuentran comentadas paso por paso. Algunos comentarios contienen la etiqueta `STUDY`, la cual utilizo junto con la extensión **To do Tree** de VS Code, para marcar donde debo repasar y estudiar, y asi acceder de una forma clara y directa en una lista de acciones que crea la extensión.

La tecnología utilizada `Java` con las clases `Swing`,  `JButton`, `JFrame`, `JLabel`, `JTextField`, `KeyEvent`,`KeyListener`, `ActionEvent`, `ActionListener`.

## Creación del .jar desde la terminal.
Se crea `meta-inf/manifest.mf` en la carpeta `bin`, en el archivo `manifest.mf` se indica, con la siguiente línea, la clase principal que ejecta el `main`.
```
Main-Class: controller.App
```
Desde la terminal, en la carpeta `bin` donde estan las clases compiladas. El último `.` hace que se empaquete todas los paquetes y clases que esten contenidos en la carpeta `bin`. 

El modificador “cvfm” en la llamada a jar.exe significa: "c” crear un  jar; “v” mostrar la salida detallada; “f” especificar el nombre del archivo jar; “m” especificar el nombre del archivo manifest. ***La última línea escrita en el archivo MANIFEST.MF, debe dejarse al menos una línea en blanco.**

```
jar cfmv ../calc.jar meta-inf/manifest.mf .
```

Para la ejecución desde la terminal: 
```
java -jar calc.jar
```

## Herramientas y recursos.
Como herramienta IDE/Editor **Vs Code**, con las siguientes extensiones:
- [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).
- [Todo Tree](https://marketplace.visualstudio.com/items?itemName=Gruntfuggly.todo-tree)
- [Markdown All in One](https://marketplace.visualstudio.com/items?itemName=yzhang.markdown-all-in-one).

## WebGrafía
- [How to Write a Document Listener](https://docs.oracle.com/javase/tutorial/uiswing/events/documentlistener.html)
- [Text Changed event in JTextArea? How to?](https://stackoverflow.com/questions/7740465/text-changed-event-in-jtextarea-how-to)
- [How do I add key listener event handler to JTextField?](https://kodejava.org/how-do-i-add-key-listener-event-handler-to-jtextfield/)
- [How to make textfield that only accepts numbers](https://www.youtube.com/watch?v=9B5ZgItFxNA)
- [Cadena Java: ver si una cadena contiene solo números y no letras](https://codeday.me/es/qa/20181212/28682.html)
- [¿Para qué sirve el uso de e.consume () en java?](https://codeday.me/es/qa/20190411/475313.html)
- [Ejemplo Eventos del Teclado en Java](http://codejavu.blogspot.com/2014/03/ejemplo-eventos-del-teclado.html)
- [Mensajes de dialogo en Java con JOptionPane](https://serprogramador.es/programando-mensajes-de-dialogo-en-java-parte-1/)
- [Removing lines around button after it's clicked in Swing](https://stackoverflow.com/questions/16132777/removing-lines-around-button-after-its-clicked-in-swing)
- [How can I add padding to a jtextfield](https://stackoverflow.com/questions/8792651/how-can-i-add-padding-to-a-jtextfield)
- [How to create a .jar file using the terminal](https://stackoverflow.com/questions/10125639/how-to-create-a-jar-file-using-the-terminal)
- [Difference between dispose and exit on close in java](https://stackoverflow.com/questions/19433358/difference-between-dispose-and-exit-on-close-in-java)
- [Creating a JAR File](https://docs.oracle.com/javase/tutorial/deployment/jar/build.html)
- [EMPAQUETAR UNA APP JAVA EN UN JAR](https://www.youtube.com/watch?v=NYlpXTCHp5U)
- [How to create jar file with package structure?](https://stackoverflow.com/questions/18146361/how-to-create-jar-file-with-package-structure)
- [How to create a .jar file using the terminal](https://stackoverflow.com/questions/10125639/how-to-create-a-jar-file-using-the-terminal)
- [Cómo crear y ejecutar un programa Java](http://www.edu4java.com/es/java/crear-ejecutar-programa-java.html)

Juan Antonio Pavón Carmona.  
Programación de servicios y procesos.  
ITT DAM 2.