# Operadores

1. Relacionales [Boolean][A operador B][A y B son numérico o boolean] `>`, `<`, `!=`, `==`, `>=`, `<=`
2. Aritméticos [Númerico][A operador B][A y B deben ser únicamente numérico] `%`, `^`, `*`, `/`, `+`, `-`
3. Lógicos [Boolean][A operador B, a exepción `!` operador(A)][A y B deben ser valores boolean] `&&`, `||`, `!`
    * Tabla de la verdad para &&
    T && T = T
    T && F = F
    F && T = F
    F && F = F

    * Tabla de la verdad para ||
    T || T = T
    T || F = T
    F || T = T
    F || F = F

    * Tabla de la verdad para !
    !(T) = F
    !(F) = T

# Elementos de apoyo. 

1. `[]`, `{}`, `()` Ayudan a organizar la formula establecida para solucionar la necesidad planteada. 

# Ejemplo

* A, B, C, D, Dónde A corresponde a corte 1, B corte 2, C corte 3. Se sabe que D es la nota definitiva; A y B equivale al 60% y C al 40%. Obtener la formula para deducir la nota final a partir de A, B y C. 

D =(A*0,3)+(B*0,3)+(C*0,4)
D =(A+B)0.3 + (C*0,4)

# Buenas prácticas de escritura de código
1. `camelCase` 
2. `PascalCase`
3. `unders_core` `snake_case`
4. `kebab-case` `dash-case`


# Estructuras

-  Secuenciales
-  Condicionales `
    ```java
        if(){

        }

        if(){
            
        }else{

        }

        if(){
            
        }else if{

        }

        //Evaluar boolean a == b
        a = true
        b = false
        c = a == b ? true:false 
    ```
    - Caso 
        ```java
            switch(){
                case 1:
                    break
                default
            }
        ```
    - Ciclos
    ```java
        do{

        }while()

        while(){

        }

        for(){

        }

        for each(){

        }
    ```
    - Palabras reservadas `Depende del lenguaje de programación.`

1. Estructuras de control
    - `for`, `for each`, `do while`, `while`, `switch`, `if`
2. Estructuras de datos
    `array`, `list`, `map`, `pilas`, `colas`, `diccionario (python)`, `key-value`, `json`


# Tipos de empaquetamiento

1. Java 
    * `war`, `jar` (compilación)
    * `Gradle - Groovy`, `Gradle - Kotlin`, `maven`

# Versiones Long Term Support
    * Java 8, 11, 17
    