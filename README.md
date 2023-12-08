# Introdução

## Visão Geral

Este conjunto de documentações abrange diversos aspectos relacionados ao desenvolvimento de uma aplicação com foco em tratamento de exceções em tempo real. As classes e conceitos discutidos visam fornecer uma estrutura eficiente para lidar com erros e exceções de forma organizada e consistente.

## 1. **Classe `User`**

### 1.1 Propriedades

- `id` (int): Identificador único do usuário.
- `fname` (String): Primeiro nome do usuário.
- `lname` (String): Sobrenome do usuário.
- `email` (String): Endereço de e-mail do usuário.

### 1.2 Métodos

- `getId()`: Retorna o identificador único do usuário.
- `setId(int id)`: Define o identificador único do usuário.
- `getFname()`: Retorna o primeiro nome do usuário.
- `setFname(String fname)`: Define o primeiro nome do usuário.
- `getLname()`: Retorna o sobrenome do usuário.
- `setLname(String lname)`: Define o sobrenome do usuário.
- `getEmail()`: Retorna o endereço de e-mail do usuário.
- `setEmail(String email)`: Define o endereço de e-mail do usuário.

## 2. **Classe `Error`**

### 2.1 Propriedades

- `statusCode` (int): Código de status associado ao erro.
- `errorMessage` (String): Mensagem descritiva do erro.

### 2.2 Métodos

- `getStatusCode()`: Retorna o código de status do erro.
- `setStatusCode(int statusCode)`: Define o código de status do erro.
- `getErrorMessage()`: Retorna a mensagem de erro.
- `setErrorMessage(String errorMessage)`: Define a mensagem de erro.

## 3. **Classe `FirstNameValidationException`**

### 3.1 Construtor

- `FirstNameValidationException(String message)`: Construtor que inicializa a exceção com a mensagem de erro fornecida.

### 3.2 Herança

- Estende `RuntimeException`.

### 3.3 Utilização Recomendada

- Recomendada para lidar com erros específicos relacionados à validação do primeiro nome.

## 4. **Classe `EmailValidationException`**

### 4.1 Construtor

- `EmailValidationException(String error)`: Construtor que inicializa a exceção com a mensagem de erro fornecida.

### 4.2 Herança

- Estende `RuntimeException`.

### 4.3 Utilização Recomendada

- Recomendada para lidar com erros específicos relacionados à validação de endereços de e-mail.

## 5. **Classe `GlobalExceptionHandler`**

### 5.1 Método

- `emailValidation(FirstNameValidationException exception)`: Manipulador global de exceções para lidar com `FirstNameValidationException`.

### 5.2 Utilização Recomendada

- Recomendada para centralizar o tratamento de exceções específicas em uma aplicação Spring.

## 6. **Classe `UserController`**

### 6.1 Método

- `addUser(User user)`: Método para tratar requisições POST na rota "/user".
- Lógica de validação e lançamento de exceções associadas aos campos `email` e `fname`.

### 6.2 Método

- `emailValidation(EmailValidationException exception)`: Manipulador de exceções para lidar com `EmailValidationException`.

### 6.3 Utilização Recomendada

- Utilização de exceções personalizadas e manipuladores globais para fornecer feedback específico em resposta a validações de campos.


# 1. Classe User

A classe `User` representa uma entidade de usuário no contexto de um sistema que lida com exceções em tempo real. Esta classe fornece métodos para acessar e modificar as informações associadas a um usuário específico. A seguir, são detalhadas as propriedades e métodos oferecidos pela classe.

```java
package com.api.realtimeexceptionhandling.entity;

public class User {

    private int id;
    private String fname;
    private String lname;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
```

## Propriedades

### `id` (int)
- Descrição: Identificador único do usuário.
- Métodos associados:
  - `getId()`: Retorna o identificador único do usuário.
  - `setId(int id)`: Define o identificador único do usuário.

### `fname` (String)
- Descrição: Primeiro nome do usuário.
- Métodos associados:
  - `getFname()`: Retorna o primeiro nome do usuário.
  - `setFname(String fname)`: Define o primeiro nome do usuário.

### `lname` (String)
- Descrição: Sobrenome do usuário.
- Métodos associados:
  - `getLname()`: Retorna o sobrenome do usuário.
  - `setLname(String lname)`: Define o sobrenome do usuário.

### `email` (String)
- Descrição: Endereço de e-mail do usuário.
- Métodos associados:
  - `getEmail()`: Retorna o endereço de e-mail do usuário.
  - `setEmail(String email)`: Define o endereço de e-mail do usuário.

## Métodos

### `getId()`
- Descrição: Retorna o identificador único do usuário.
- Parâmetros: Nenhum.
- Retorno: `int` - Identificador único do usuário.

### `setId(int id)`
- Descrição: Define o identificador único do usuário.
- Parâmetros:
  - `id` (int): Novo identificador único a ser atribuído ao usuário.
- Retorno: Nenhum.

### `getFname()`
- Descrição: Retorna o primeiro nome do usuário.
- Parâmetros: Nenhum.
- Retorno: `String` - Primeiro nome do usuário.

### `setFname(String fname)`
- Descrição: Define o primeiro nome do usuário.
- Parâmetros:
  - `fname` (String): Novo primeiro nome a ser atribuído ao usuário.
- Retorno: Nenhum.

### `getLname()`
- Descrição: Retorna o sobrenome do usuário.
- Parâmetros: Nenhum.
- Retorno: `String` - Sobrenome do usuário.

### `setLname(String lname)`
- Descrição: Define o sobrenome do usuário.
- Parâmetros:
  - `lname` (String): Novo sobrenome a ser atribuído ao usuário.
- Retorno: Nenhum.

### `getEmail()`
- Descrição: Retorna o endereço de e-mail do usuário.
- Parâmetros: Nenhum.
- Retorno: `String` - Endereço de e-mail do usuário.

### `setEmail(String email)`
- Descrição: Define o endereço de e-mail do usuário.
- Parâmetros:
  - `email` (String): Novo endereço de e-mail a ser atribuído ao usuário.
- Retorno: Nenhum.

# 2. Classe Error

A classe `Error` é projetada para representar informações relacionadas a erros em um contexto de tratamento de exceções em tempo real. Ela fornece métodos para acessar e modificar detalhes específicos de um erro, como o código de status e a mensagem de erro. A seguir, são detalhadas as propriedades e métodos oferecidos pela classe.

```java
package com.api.realtimeexceptionhandling.errors;

public class Error {

    int statusCode;
    String errorMessage;

    public Error(int statusCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
```

## Construtor

### `Error(int statusCode, String errorMessage)`
- Descrição: Construtor que inicializa um objeto `Error` com o código de status e a mensagem de erro fornecidos.
- Parâmetros:
  - `statusCode` (int): Código de status associado ao erro.
  - `errorMessage` (String): Mensagem descritiva do erro.
- Retorno: Nenhum.

## Propriedades

### `statusCode` (int)
- Descrição: Código de status associado ao erro.
- Métodos associados:
  - `getStatusCode()`: Retorna o código de status do erro.
  - `setStatusCode(int statusCode)`: Define o código de status do erro.

### `errorMessage` (String)
- Descrição: Mensagem descritiva do erro.
- Métodos associados:
  - `getErrorMessage()`: Retorna a mensagem de erro.
  - `setErrorMessage(String errorMessage)`: Define a mensagem de erro.

## Métodos

### `getStatusCode()`
- Descrição: Retorna o código de status do erro.
- Parâmetros: Nenhum.
- Retorno: `int` - Código de status do erro.

### `setStatusCode(int statusCode)`
- Descrição: Define o código de status do erro.
- Parâmetros:
  - `statusCode` (int): Novo código de status a ser atribuído ao erro.
- Retorno: Nenhum.

### `getErrorMessage()`
- Descrição: Retorna a mensagem de erro.
- Parâmetros: Nenhum.
- Retorno: `String` - Mensagem de erro.

### `setErrorMessage(String errorMessage)`
- Descrição: Define a mensagem de erro.
- Parâmetros:
  - `errorMessage` (String): Nova mensagem de erro a ser atribuída.
- Retorno: Nenhum.

# 3. Classe FirstNameValidationException

A classe `FirstNameValidationException` representa uma exceção personalizada que estende a classe `RuntimeException`. Ela é utilizada para sinalizar situações específicas relacionadas à validação do primeiro nome em um contexto de tratamento de exceções em tempo real. A seguir, são fornecidos detalhes sobre a construção e o propósito desta classe.

```java
package com.api.realtimeexceptionhandling.customexceptions;

public class FirstNameValidationException extends RuntimeException {

    public FirstNameValidationException(String message) {
        super(message);
    }

}
```

## Construtor

### `FirstNameValidationException(String message)`
- Descrição: Construtor que inicializa um objeto `FirstNameValidationException` com a mensagem de erro fornecida.
- Parâmetros:
  - `message` (String): Mensagem descritiva que detalha a natureza da exceção.
- Retorno: Nenhum.

## Herança

A classe `FirstNameValidationException` estende `RuntimeException`, o que significa que ela é uma exceção não verificada. Isso permite que seja lançada em qualquer ponto do código sem a necessidade de declarações ou tratamentos específicos.

## Utilização Recomendada

A classe `FirstNameValidationException` é recomendada para lidar com erros específicos relacionados à validação do primeiro nome. Ao utilizá-la, você pode capturar essas exceções de forma seletiva e fornecer tratamentos personalizados, contribuindo para um controle mais granular e compreensível do fluxo do programa.

# 4. Classe EmailValidationException

A classe `EmailValidationException` é uma exceção personalizada que estende a classe `RuntimeException`. Ela é utilizada para sinalizar situações específicas relacionadas à validação de endereços de e-mail em um contexto de tratamento de exceções em tempo real. Abaixo estão detalhes sobre a construção e o propósito desta classe.

```java
package com.api.realtimeexceptionhandling.customexceptions;

public class EmailValidationException extends RuntimeException {

    public EmailValidationException(String error) {
        super(error);
    }

}
```

## Construtor

### `EmailValidationException(String error)`
- Descrição: Construtor que inicializa um objeto `EmailValidationException` com a mensagem de erro fornecida.
- Parâmetros:
  - `error` (String): Mensagem descritiva que detalha a natureza da exceção.
- Retorno: Nenhum.

## Herança

A classe `EmailValidationException` estende `RuntimeException`, indicando que é uma exceção não verificada. Isso permite que seja lançada em qualquer ponto do código sem a necessidade de declarações ou tratamentos específicos.

## Utilização Recomendada

A classe `EmailValidationException` é recomendada para lidar com erros específicos relacionados à validação de endereços de e-mail. Ao utilizar essa exceção personalizada, é possível capturar essas situações de erro de forma seletiva e fornecer tratamentos personalizados, contribuindo para um controle mais preciso do fluxo do programa.

# 5. Classe GlobalExceptionHandler

A classe `GlobalExceptionHandler` é uma classe de manipulação global de exceções para lidar com exceções específicas em um contexto de tratamento de exceções em tempo real em uma aplicação Spring. Ela utiliza a anotação `@ControllerAdvice` para aconselhar todos os controladores, permitindo um tratamento centralizado de exceções. Abaixo estão detalhes sobre a construção e o propósito desta classe.

```java
package com.api.realtimeexceptionhandling.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.realtimeexceptionhandling.customexceptions.FirstNameValidationException;
import com.api.realtimeexceptionhandling.errors.Error;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = FirstNameValidationException.class)
    public ResponseEntity<Error> emailValidation(FirstNameValidationException exception) {

        Error error = new Error(1000, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
```

## Anotação `@ControllerAdvice`

A anotação `@ControllerAdvice` é usada para marcar a classe como um manipulador de exceções global que será aplicado a todos os controladores na aplicação. Ela permite que a classe intercepte e lide com exceções lançadas por métodos anotados com `@RequestMapping` e outros métodos anotados em controladores.

## Método `emailValidation`

### `@ExceptionHandler(value = FirstNameValidationException.class)`
- Descrição: Método anotado com `@ExceptionHandler` para lidar com exceções do tipo `FirstNameValidationException`.
- Parâmetros:
  - `exception` (FirstNameValidationException): A exceção que foi lançada.
- Retorno: `ResponseEntity<Error>` - Uma resposta HTTP que contém detalhes sobre o erro.

### Construção da Resposta

Dentro do método `emailValidation`, é criada uma instância da classe `Error` com um código de status específico (1000) e a mensagem da exceção. Esses detalhes são encapsulados em uma instância de `ResponseEntity`, indicando um erro com status HTTP 400 (Bad Request). Esta resposta pode ser personalizada conforme necessário, por exemplo.

Exemplo de uso:

```java
try {
    // Código que pode lançar FirstNameValidationException
} catch (FirstNameValidationException e) {
    // A exceção será capturada pelo método emailValidation
}
```

## Utilização Recomendada

A classe `GlobalExceptionHandler` é recomendada para centralizar o tratamento de exceções específicas em uma aplicação Spring. Isso promove a coesão do tratamento de erros, facilita a manutenção e melhora a consistência nas respostas a erros em toda a aplicação.

# 6. Classe UserController

A classe `UserController` é um controlador Spring responsável por manipular requisições relacionadas à entidade `User`. Este controlador incorpora lógica de validação e manipulação de exceções para fornecer feedback em tempo real sobre erros de validação associados aos campos `email` e `fname`. A seguir, são detalhadas as funcionalidades desta classe.

```java
package com.api.realtimeexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.realtimeexceptionhandling.customexceptions.EmailValidationException;
import com.api.realtimeexceptionhandling.customexceptions.FirstNameValidationException;
import com.api.realtimeexceptionhandling.entity.User;
import com.api.realtimeexceptionhandling.errors.Error;

@RestController
public class UserController {

    // localhost:9090/user
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        if (!user.getEmail().contains("@")) {
            throw new EmailValidationException("Not a valid email :: " + user.getEmail());
        }

        if (user.getFname().contains("!")) {
            throw new FirstNameValidationException("Not a valid name :: " + user.getFname());
        }

        return user;
    }

    @ExceptionHandler(value = EmailValidationException.class)
    public ResponseEntity<Error> emailValidation(EmailValidationException exception) {

        Error error = new Error(1000, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
```

## Anotação `@RestController`

A anotação `@RestController` indica que a classe é um controlador Spring que trata requisições HTTP. Ela combina as anotações `@Controller` e `@ResponseBody`, permitindo que os métodos do controlador retornem diretamente os dados no corpo da resposta HTTP.

## Método `addUser`

### `@PostMapping("/user")`
- Descrição: Método anotado com `@PostMapping` para tratar requisições POST na rota "/user".
- Parâmetros:
  - `user` (User): Objeto `User` recebido no corpo da requisição.
- Retorno: `User` - O objeto `User` recebido na requisição, se a validação for bem-sucedida.

### Lógica de Validação e Lançamento de Exceções

Dentro do método `addUser`, são realizadas verificações de validação nos campos `email` e `fname` do objeto `User`. Se uma validação falhar, uma exceção específica é lançada (`EmailValidationException` ou `FirstNameValidationException`) com uma mensagem descritiva.

Exemplo de uso:

```java
// Requisição POST para localhost:9090/user com um objeto User no corpo
// Se a validação falhar, a exceção correspondente será lançada e tratada pelo método emailValidation

/* Testando no Postman:
 * 
 * {
 *      "id": "1",
 *      "fname": "!Daniel",
 *      "lname": "Penelva",
 *      "email": "d4n.andradegmail.com"
 * }
*/
```

## Método `emailValidation`

### `@ExceptionHandler(value = EmailValidationException.class)`
- Descrição: Método anotado com `@ExceptionHandler` para lidar com exceções do tipo `EmailValidationException`.
- Parâmetros:
  - `exception` (EmailValidationException): A exceção que foi lançada.
- Retorno: `ResponseEntity<Error>` - Uma resposta HTTP que contém detalhes sobre o erro.

### Construção da Resposta

Dentro do método `emailValidation`, é criada uma instância da classe `Error` com um código de status específico (1000) e a mensagem da exceção. Esses detalhes são encapsulados em uma instância de `ResponseEntity`, indicando um erro com status HTTP 400 (Bad Request). Esta resposta pode ser personalizada conforme necessário.

Exemplo de uso:

```java
// Se a validação do e-mail falhar, a exceção será capturada por este método e uma resposta de erro será enviada ao cliente.
```

## Utilização Recomendada

O `UserController` exemplifica a utilização de exceções personalizadas e manipuladores globais em um contexto Spring para fornecer feedback específico e consistente em resposta a validações de campos. O uso de exceções personalizadas e manipuladores globais contribui para um código mais modular, facilitando a manutenção e promovendo a consistência na tratativa de erros.

# Autor
## Feito por: `Daniel Penelva de Andrade`