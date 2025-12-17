[![Build status](https://ci.appveyor.com/api/projects/status/1jvnylbk4dhyd3a9?svg=true)](https://ci.appveyor.com/project/AsjaMedved/selenium)

## Описание
Проект содержит автоматизированные UI-тесты веб-приложения "Банк" с использованием Selenium и JUnit 5.
Тесты проверяют корректность работы формы заявки, включая:
- успешную отправку данных
- валидацию полей (имя, телефон)
- проверку работы чекбокса согласия
- проверку уведомлений и сообщений об ошибках

## Технологии
- Java 21
- Selenium
- JUnit 5
- Gradle
- Git

## Запуск тестов
1. Клонируйте репозиторий: git clone https://github.com/AsjaMedved/selenium
2. Перейдите в директорию проекта: cd artifacts
3. Запустите сервер: java -jar app-order.jar
4. В отдельном терминале перейдите в директорию проекта с тестами: cd Selenium
5. Запустите тесты через Gradle: ./gradlew clean test
> Тесты автоматически откроют браузер и проверят работу формы на `http://localhost:9999/`

## Структура проекта
- `src/test/java/ru/netology/service/BankTest.java` — класс с тестами Selenium
- `build.gradle.kts` — файл с зависимостями и конфигурацией Gradle

## Примеры тестов
- `theApplicationHasBeenSuccessfulSubmitted()` — заявка успешно отправлена
- `sendingEmptyFields()` — проверка ошибки при пустых полях 
- `fillingInAninvalidName()` — проверка ошибки при невалидном имени
- `fillingInAnInvalidPhoneNumber()` — проверка ошибки при невалидном телефоне
- `theCheckBoxIsNotMarked()` — проверка ошибки, если чекбокс не отмечен
- `theNameFieldIsNotFilledIn()` — проверка ошибки при путом поле имя
- `thePhoneNumberFieldIsNotFilledIn()` — проверка ошибки при пустом поле телефон

## Особенности
- Используется WebDriverManager для автоматического управления ChromeDriver
- Проверка видимости элементов и сообщений об ошибках через Selenium isDisplayed() и getText()
- После каждого теста браузер закрывается автоматически (driver.quit())